package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ClienteDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ObjetoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.PrestamoDto;
import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;

import java.util.Date;
import java.util.List;

public interface IModelFactoryService {
    List<ClienteDto> getClientes();
    boolean addCliente(ClienteDto clienteDto);
    boolean deleteCliente(String cedula);
    boolean updateCliente(String nombre, String apellido, String cedula, String edad);

    List<EmpleadoDto> getEmpleados();
    boolean addEmpleado(EmpleadoDto empleadoDto);
    boolean deleteEmpleado(String cedula);
    boolean updateEmpleado(String nombre,EmpleadoDto empleadoDto);

    List<ObjetoDto> getObjetos();
    boolean addObjeto(ObjetoDto objetoDto);
    boolean deleteObjeto(String nombre);
    boolean updateObjeto(ObjetoDto objetoDto);

    List<Prestamo> getPrestamos();
    boolean addPrestamo(Prestamo prestamoDto);
    boolean deletePrestamo(String numeroPrestamo);
    boolean updatePrestamo(String numeroPrestamo, PrestamoDto prestamoDto);
}
