/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Empleado {
    public String nombre;
    public String apellido;
    public int codigoDeEmpleado;

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", codigoDeEmpleado=" + codigoDeEmpleado + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigoDeEmpleado() {
        return codigoDeEmpleado;
    }

    public void setCodigoDeEmpleado(int codigoDeEmpleado) {
        this.codigoDeEmpleado = codigoDeEmpleado;
    }

    public Empleado(String nombre, String apellido, int codigoDeEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeEmpleado = codigoDeEmpleado;
    }public void datosEmpleado
             arreglo[0] = new Empleado("Jaramillo","gonzales","1550");
             arreglo[0] = new Empleado("Rodrigo Abelardo","Rodriguez","1551");
             arreglo[0] = new Empleado("Gerardo","Salas","1555");
}
    
}
