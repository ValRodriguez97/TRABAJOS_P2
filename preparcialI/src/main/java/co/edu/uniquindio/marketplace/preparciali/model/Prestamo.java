package co.edu.uniquindio.marketplace.preparciali.model;

import co.edu.uniquindio.marketplace.preparciali.model.builder.PrestamoBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private String numeroPrestamo;
    private Date fechaPrestamo;
    private Date fechaEntrega ;
    private String descripcion;
    private Cliente clienteAsociado;
    private List<Objeto> listaObjetosAsociados;
    private Empleado empleadoAsociado;

    public Prestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = clienteAsociado;
        this.listaObjetosAsociados = new ArrayList<>();
        this.empleadoAsociado = empleadoAsociado;
    }

    public static PrestamoBuilder builder(){
        return new PrestamoBuilder();
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public List<Objeto> getListaObjetosAsociados() {
        return listaObjetosAsociados;
    }

    public void setListaObjetosAsociados(List<Objeto> listaObjetosAsociados) {
        this.listaObjetosAsociados = listaObjetosAsociados;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }
}
