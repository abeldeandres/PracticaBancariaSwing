/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabancaria;

/**
 *
 * @author Carlos
 */
public class Prod {
    
    private Producto prod;
    private String tipoMensaje;
    private String mensaje;

    public Prod(Producto prod) {
        this.prod = prod;
        this.mensaje="";
        this.tipoMensaje="";
    }
    
    
    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
