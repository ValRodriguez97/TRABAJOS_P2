package co.edu.uniquindio.marketplace.preparciali.mapping.mappers;

import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ClienteDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
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
}
