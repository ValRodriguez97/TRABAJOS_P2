package co.edu.uniquindio.marketplace.preparciali.mapping.mappers;

import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ClienteDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ObjetoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.PrestamoDto;
import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
import co.edu.uniquindio.marketplace.preparciali.model.Objeto;
import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;
import co.edu.uniquindio.marketplace.preparciali.service.IPrestamoUQMapping;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUQMappingImplt implements IPrestamoUQMapping {

    @Override
    public List<ClienteDto> getClientesDto(List<Cliente> listaClientes){
        if(listaClientes == null){
            return null;
        }

        List<ClienteDto> listaClientesDto = new ArrayList<ClienteDto>(listaClientes.size());
        for(Cliente cliente : listaClientes){
            listaClientesDto.add(clienteToClienteDto(cliente));
        }

        return listaClientesDto;
    }

    @Override
    public List<EmpleadoDto> getEmpleadosDto(List<Empleado> listaEmpleados){
        if(listaEmpleados == null){
            return null;
        }

        List<EmpleadoDto> listaEmpleadosDto = new ArrayList<EmpleadoDto>(listaEmpleados.size());
        for(Empleado empleado : listaEmpleados){
            listaEmpleadosDto.add(empleadoToEmpleadoDto(empleado));
        }
        return listaEmpleadosDto;
    }

    @Override
    public List<ObjetoDto> getObjetosDto(List<Objeto> listaObjetos){
        if(listaObjetos == null){
            return null;
        }

        List<ObjetoDto> listObjetosDto = new ArrayList<ObjetoDto>(listaObjetos.size());
        for (Objeto objeto : listaObjetos){
            listObjetosDto.add(objetoToObjetoDto(objeto));
        }
        return listObjetosDto;
    }

    @Override
    public List<PrestamoDto> getPrestamosDto(List<Prestamo> listaPrestamos){
        if(listaPrestamos == null){
            return null;
        }

        List<PrestamoDto> listPrestamosDto = new ArrayList<PrestamoDto>(listaPrestamos.size());
        for(Prestamo prestamo : listaPrestamos){
            listPrestamosDto.add(prestamoToPrestamoDto(prestamo));
        }
        return listPrestamosDto;
    }

    @Override
    public ClienteDto clienteToClienteDto(Cliente cliente){
        return new ClienteDto(
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getCedula(),
                cliente.getEdad());
    }

    @Override
    public Cliente clienteDtoToCliente(ClienteDto clienteDto){
        return Cliente.builder()
                .nombre(clienteDto.nombre())
                .apellido(clienteDto.apellido())
                .cedula(clienteDto.cedula())
                .edad(clienteDto.edad())
                .build();
    }

    @Override
    public EmpleadoDto empleadoToEmpleadoDto(Empleado empleado){
        return new EmpleadoDto(
                empleado.getNombre(),
                empleado.getApellido(),
                empleado.getCedula(),
                empleado.getEdad());
    }

    @Override
    public Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto){
        return Empleado.builder()
                .nombre(empleadoDto.nombre())
                .apellido(empleadoDto.apellido())
                .cedula(empleadoDto.cedula())
                .edad(empleadoDto.edad())
                .build();
    }

    @Override
    public ObjetoDto objetoToObjetoDto(Objeto objeto){
        return new ObjetoDto(
                objeto.getNombre(),
                objeto.getPrestamoAsociado());
    }

    @Override
    public Objeto objetoDtoToObjeto(ObjetoDto objetoDto){
        return Objeto.builder()
                .nombre(objetoDto.nombre())
                .prestamo(objetoDto.prestamoAsociado())
                .build();
    }

    @Override
    public PrestamoDto prestamoToPrestamoDto(Prestamo prestamo){
        return new PrestamoDto(
                prestamo.getNumeroPrestamo(),
                prestamo.getFechaPrestamo(),
                prestamo.getFechaEntrega(),
                prestamo.getDescripcion(),
                prestamo.getClienteAsociado(),
                prestamo.getEmpleadoAsociado());
    }

    @Override
    public Prestamo prestamoDtoToPrestamo(PrestamoDto prestamoDto){
        return Prestamo.builder()
                .numeroPrestamo(prestamoDto.numeroPrestamo())
                .fechaPrestamo(prestamoDto.fechaPrestamo())
                .fechaEntrega(prestamoDto.fechaEntrega())
                .descripcion(prestamoDto.descripcion())
                .clienteAsociado(prestamoDto.clienteAsociado())
                .empleadoAsociado(prestamoDto.empleadoAsociado())
                .build();
    }
}
