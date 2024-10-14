package co.edu.uniquindio.marketplace.preparciali.model;

import co.edu.uniquindio.marketplace.preparciali.model.builder.EmpleadoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends  Persona{
    private List<Prestamo> listaPrestamosAsociados;

    public Empleado(String nombre, String apellido, String cedula, String edad){
        super(nombre, apellido, cedula, edad);
        this.listaPrestamosAsociados = new ArrayList<Prestamo>();
    }

    public static EmpleadoBuilder builder(){
        return new EmpleadoBuilder();
    }

    public List<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }

    public void setListaPrestamosAsociados(List<Prestamo> listaPrestamosAsociados) {
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }
}
