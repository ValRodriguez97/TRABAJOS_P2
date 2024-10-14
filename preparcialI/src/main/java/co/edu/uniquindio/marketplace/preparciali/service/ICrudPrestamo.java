package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;

import java.util.Date;
import java.util.List;

public interface ICrudPrestamo {
    boolean createPrestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion);
    Prestamo readPrestamo(String numeroPrestamo);
    boolean updatePrestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion);
    boolean deletePrestamo(String numeroPrestamo);
    List<Prestamo> listPrestamos();

    boolean verificarPrestamoExistente(String numeroPrestamo);
}
