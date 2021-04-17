
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class sensores {
    public String Encargado;
    public String nombre;
    public int cantidad;        
    private static final Logger LOG = Logger.getLogger(sensores.class.getName());

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "sensores{" + "Encargado=" + Encargado + ", nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
}
