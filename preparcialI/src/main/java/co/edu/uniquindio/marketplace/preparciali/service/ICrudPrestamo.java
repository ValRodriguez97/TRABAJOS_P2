package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ICrudPrestamo {
    boolean createPrestamo(Prestamo prestamo);
    Prestamo readPrestamo(String numeroPrestamo);
    boolean updatePrestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado);
    boolean deletePrestamo(String numeroPrestamo);
    List<Prestamo> listPrestamos();
    boolean verificarPrestamoExistente(String numeroPrestamo);
}
