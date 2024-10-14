package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ClienteDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ObjetoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.PrestamoDto;
import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
import co.edu.uniquindio.marketplace.preparciali.model.Objeto;
import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;

import java.util.List;

public interface IPrestamoUQMapping {
    List<ClienteDto> getClientesDto(List<Cliente> listaClientes);
    List<EmpleadoDto> getEmpleadosDto(List<Empleado> listaEmpleados);
    List<ObjetoDto> getObjetosDto(List<Objeto> listaObjetos);
    List<PrestamoDto> getPrestamosDto(List<Prestamo> listaPrestamos);

    ClienteDto clienteToClienteDto(Cliente cliente);
    Cliente clienteDtoToCliente(ClienteDto clienteDto);

    EmpleadoDto empleadoToEmpleadoDto(Empleado empleado);
    Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto);

    ObjetoDto objetoToObjetoDto(Objeto objeto);
    Objeto objetoDtoToObjeto(ObjetoDto objetoDto);

    PrestamoDto prestamoToPrestamoDto(Prestamo prestamo);
    Prestamo prestamoDtoToPrestamo(PrestamoDto prestamoDto);

}
