package co.edu.uniquindio.marketplace.preparciali.model.builder;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;

import java.util.Date;

public class PrestamoBuilder {
    protected String numeroPrestamo;
    protected Date fechaPrestamo;
    protected Date fechaEntrega;
    protected String descripcion;
    protected Cliente clienteAsociado;
    protected Empleado empleadoAsociado;

    public PrestamoBuilder numeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
        return this;
    }

    public PrestamoBuilder fechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        return this;
    }

    public PrestamoBuilder fechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
        return this;
    }

    public PrestamoBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public PrestamoBuilder clienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
        return this;
    }

    public PrestamoBuilder empleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
        return this;
    }

    public Prestamo build() {
        return new Prestamo(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado);
    }


}
