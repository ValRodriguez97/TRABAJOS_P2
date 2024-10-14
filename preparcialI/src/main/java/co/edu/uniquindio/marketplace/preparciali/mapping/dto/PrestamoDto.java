package co.edu.uniquindio.marketplace.preparciali.mapping.dto;

import java.util.Date;

public record PrestamoDto (
   String numeroPrestamo,
   Date fechaPrestamo,
   Date fechaEntrega,
   String descripcion
){
}
