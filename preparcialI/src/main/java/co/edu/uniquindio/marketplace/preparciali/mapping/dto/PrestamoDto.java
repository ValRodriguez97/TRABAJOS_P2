package co.edu.uniquindio.marketplace.preparciali.mapping.dto;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;

import java.util.Date;

public record PrestamoDto (
   String numeroPrestamo,
   Date fechaPrestamo,
   Date fechaEntrega,
   String descripcion,
   Cliente clienteAsociado,
   Empleado empleadoAsociado
){
}
