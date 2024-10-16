package co.edu.uniquindio.marketplace.preparciali.mapping.dto;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;

import java.time.LocalDate;
import java.util.Date;

public record PrestamoDto (
   String numeroPrestamo,
   LocalDate fechaPrestamo,
   LocalDate fechaEntrega,
   String descripcion,
   Cliente clienteAsociado,
   Empleado empleadoAsociado
){
}
