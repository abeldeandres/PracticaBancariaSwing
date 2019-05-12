/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabancaria;

import java.util.ArrayList;

/**
 *
 * @author cargo
 */
public class Cliente {
    private String nombre;
    private String dni;
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
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
    
    
}
