package co.edu.uniquindio.marketplace.preparciali.factory;

import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ClienteDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.mappers.PrestamoUQMappingImplt;
import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
import co.edu.uniquindio.marketplace.preparciali.model.PrestamoUq;
import co.edu.uniquindio.marketplace.preparciali.service.IModelFactoryService;

import java.util.List;

/*public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    PrestamoUq prestamoUq;
    PrestamoUQMappingImplt mapper;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory() {
        mapper = new PrestamoUQMappingImplt();
        prestamoUq = inicializarDatos();
    }

    public PrestamoUq getPrestamoUq() {
        return prestamoUq;
    }

    public void setPrestamoUq(PrestamoUq prestamoUq) {
        this.prestamoUq = prestamoUq;
    }

    @Override
    public List<ClienteDto> getClientes() {
        return mapper.getClientesDto(prestamoUq.getListaClientes());
    }

    @Override
    public boolean addCliente(ClienteDto clienteDto) {
        if(prestamoUq.verificarClienteExistente(clienteDto.cedula())){
            Cliente newCliente = mapper.clienteDtoToCliente(clienteDto);

            getPrestamoUq().createCliente(newCliente);
            return  true;
        }
        return false;
    }

    @Override
    public boolean deleteCliente(String cedula){
        if(prestamoUq.verificarClienteExistente(cedula)){
            getPrestamoUq().deleteCliente(cedula);
        }
        return false;
    }

    @Override
    public boolean updateCliente(String nombre, String apellido, String cedula, String edad) {

    }

    @Override
    public boolean addEmpleado(EmpleadoDto empleadoDto) {
        if(prestamoUq.verificarEmpleadoExistente(empleadoDto.cedula())){
            Empleado newEmpleado = mapper.empleadoDtoToEmpleado(empleadoDto);

            getPrestamoUq().createEmpleado(newEmpleado);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmpleado(String cedula) {
        if(prestamoUq.verificarEmpleadoExistente(cedula)){
            getPrestamoUq().deleteEmpleado(cedula);
            return true;
        }
        return false;
    }

  /**  @Override
    public boolean updateEmpleado(String cedula, EmpleadoDto empleadoDto) {
        if(prestamoUq.verificarEmpleadoExistente(cedula)){
            Emplea
        }
    }**/

  /**  public static PrestamoUq inicializarDatos() {
        PrestamoUq prestamoUq = new PrestamoUq("Prestamos UQ");
        return prestamoUq;
    }**/


//}
