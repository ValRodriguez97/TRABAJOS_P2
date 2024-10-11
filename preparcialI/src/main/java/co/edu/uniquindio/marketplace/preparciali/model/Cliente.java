package co.edu.uniquindio.marketplace.preparciali.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends  Persona{
    private List<Prestamo> listaPrestamosAsociados;

    public Cliente(String nombre, String apellido, String cedula, String edad){
        super(nombre, apellido, cedula, edad);
        this.listaPrestamosAsociados = new ArrayList<Prestamo>();
    }

    public List<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }

    public void setListaPrestamosAsociados(List<Prestamo> listaPrestamosAsociados) {
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }
}
