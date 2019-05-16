/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabancaria;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Cliente {
    private String nombre;
    private String dni;
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    private Comunicacion comunicacion;
    private ArrayList<String> listaMensajes = new ArrayList<String>();
     private ArrayList<String> listaTipoMensajes = new ArrayList<String>();

    public ArrayList<String> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<String> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public ArrayList<String> getListaTipoMensaje() {
        return listaTipoMensaje;
    }

    public void setListaTipoMensaje(ArrayList<String> listaTipoMensaje) {
        this.listaTipoMensaje = listaTipoMensaje;
    }
    private ArrayList<String> listaTipoMensaje = new ArrayList<String>();



    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }
    private String tipoMensaje;

    public Cliente(String nombre, String dni, Comunicacion comunicacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.comunicacion = comunicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Comunicacion getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(Comunicacion comunicacion) {
        this.comunicacion = comunicacion;
    }
    
    public String[] productosToString(){
     String[] arrayString = new String[listaProductos.size()];
     for (int i=0; i<this.listaProductos.size();i++){
         arrayString[i]=listaProductos.get(i).toString();
     }
     return arrayString;
    }
    
    public void aniadirMensaje(String mensaje){
        this.listaMensajes.add(mensaje);
    }
    public void aniadirTipoMensaje(String tipomensaje){
        this.listaTipoMensajes.add(tipomensaje);
    }
}
