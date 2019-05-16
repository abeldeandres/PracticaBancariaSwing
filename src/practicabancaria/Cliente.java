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
    private ArrayList<Prod> listaProductos = new ArrayList<Prod>();
    private Comunicacion comunicacion;


    

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

    public Comunicacion getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(Comunicacion comunicacion) {
        this.comunicacion = comunicacion;
    }
    
        public ArrayList<Prod> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Prod> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public String[] productosToString(){
     String[] arrayString = new String[listaProductos.size()];
     for (int i=0; i<this.listaProductos.size();i++){
         arrayString[i]=listaProductos.get(i).toString();
     }
     return arrayString;
    }
    

}
