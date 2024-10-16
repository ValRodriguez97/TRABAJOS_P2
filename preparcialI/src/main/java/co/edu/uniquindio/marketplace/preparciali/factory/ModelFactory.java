package co.edu.uniquindio.marketplace.preparciali.factory;

import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ClienteDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.ObjetoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.dto.PrestamoDto;
import co.edu.uniquindio.marketplace.preparciali.mapping.mappers.PrestamoUQMappingImplt;
import co.edu.uniquindio.marketplace.preparciali.model.*;
import co.edu.uniquindio.marketplace.preparciali.model.builder.ClienteBuilder;
import co.edu.uniquindio.marketplace.preparciali.service.IModelFactoryService;
import co.edu.uniquindio.marketplace.preparciali.service.IPrestamoUQFacade;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    private IPrestamoUQFacade prestamoUQFacade;
    PrestamoUQMappingImplt mapper;

    public static ModelFactory getInstance(IPrestamoUQFacade prestamoUQFacade) {
        if (instance == null) {
            instance = new ModelFactory(prestamoUQFacade);
        }
        return instance;
    }

    private ModelFactory(IPrestamoUQFacade prestamoUQFacade) {
        mapper = new PrestamoUQMappingImplt();
        this.prestamoUQFacade = prestamoUQFacade;
        inicializarDatos();
    }

   /* public PrestamoUq getPrestamoUq() {
        return prestamoUq;
    }*/

   /* public void setPrestamoUq(PrestamoUq prestamoUq) {
        this.prestamoUq = prestamoUq;
    }*/

    @Override
    public List<ClienteDto> getClientes() {
        return mapper.getClientesDto(prestamoUQFacade.listClientes());
    }

    public void  inicializarDatos() {
        //Clientes
        Cliente cliente1 = Cliente.builder()
                .cedula("1234")
                .nombre("Valentina")
                .apellido("Rodriguez")
                .edad("19")
                .build();

        Cliente cliente2 = Cliente.builder()
                .cedula("81892")
                .nombre("Jose")
                .apellido("Suarez")
                .edad("31")
                .build();

       //Empleados
        Empleado empleado1 = Empleado.builder()
                .cedula("81721")
                .nombre("Carlos")
                .apellido("Londoño")
                .edad("61")
                .build();

        Empleado empleado2 = Empleado.builder()
                .cedula("6719")
                .nombre("Sara")
                .apellido("Velasquez")
                .edad("34")
                .build();

        //Prestamos
        Prestamo prestamo1 = Prestamo.builder()
                .numeroPrestamo("1234")
                .fechaPrestamo(LocalDate.now())
                .fechaEntrega(LocalDate.of(2024, 11, 02))
                .descripcion("adiao")
                .clienteAsociado(cliente1)
                .empleadoAsociado(empleado2)
                .build();


        //Objetos
        Objeto objeto1 = Objeto.builder()
                .nombre("TV Samsung")
                .prestamo(prestamo1)
                .build();
    }

    @Override
    public boolean addCliente(ClienteDto clienteDto) {
        if(prestamoUQFacade.verificarClienteExistente(clienteDto.cedula())){
            Cliente newCliente = mapper.clienteDtoToCliente(clienteDto);
            return prestamoUQFacade.createCliente(newCliente);
        }
        return false;
    }

    @Override
    public boolean deleteCliente(String cedula){
        if(prestamoUQFacade.verificarClienteExistente(cedula)){
            return prestamoUQFacade.deleteCliente(cedula);
        }
        return false;
    }

    @Override
    public boolean updateCliente(String cedula, ClienteDto clienteDto){
        if(prestamoUQFacade.verificarClienteExistente(cedula)){
            Cliente clienteExistente = null;

            for(Cliente cliente : prestamoUQFacade.listClientes()){
                if(cliente.getCedula().equals(cedula)){
                    clienteExistente = cliente;
                    break;
                }
            }

            if(clienteExistente != null){
                Cliente newCliente = mapper.clienteDtoToCliente(clienteDto);
                newCliente.setCedula(cedula);
                newCliente.setNombre(clienteDto.nombre());
                newCliente.setApellido(clienteDto.apellido());
                newCliente.setEdad(clienteDto.edad());
                return prestamoUQFacade.updateCliente(cedula, newCliente.getNombre(), newCliente.getApellido(), newCliente.getEdad());
            }
        }
        return false;
    }

    @Override
    public List<EmpleadoDto> getEmpleados() {
        return mapper.getEmpleadosDto(prestamoUQFacade.listEmpleados());
    }

    @Override
    public boolean addEmpleado(EmpleadoDto empleadoDto) {
        if(prestamoUQFacade.verificarEmpleadoExistente(empleadoDto.cedula())){
            Empleado newEmpleado = mapper.empleadoDtoToEmpleado(empleadoDto);
            return prestamoUQFacade.createEmpleado(newEmpleado);
        }
        return false;
    }

    @Override
    public boolean deleteEmpleado(String cedula) {
        if(prestamoUQFacade.verificarEmpleadoExistente(cedula)){
            return prestamoUQFacade.deleteEmpleado(cedula);
        }
        return false;
    }

   @Override
    public boolean updateEmpleado(String cedula, EmpleadoDto empleadoDto) {
        if(prestamoUQFacade.verificarEmpleadoExistente(cedula) ){
            Empleado empleadoExistente = null;

            for(Empleado empleado : prestamoUQFacade.listEmpleados()){
                if(empleado.getCedula().equals(cedula)){
                    empleadoExistente = empleado;
                    break;
                }
            }

            if(empleadoExistente != null){
                Empleado newEmpleado = mapper.empleadoDtoToEmpleado(empleadoDto);
                newEmpleado.setCedula(cedula);
                newEmpleado.setNombre(empleadoDto.nombre());
                newEmpleado.setApellido(empleadoDto.apellido());
                newEmpleado.setEdad(empleadoDto.edad());
                return prestamoUQFacade.updateCliente(cedula, newEmpleado.getNombre(), newEmpleado.getApellido(), newEmpleado.getEdad());
            }
        }
        return false;
    }

    @Override
    public List<ObjetoDto> getObjetos(){
        return mapper.getObjetosDto(prestamoUQFacade.listObjetos());
    }

    @Override
    public boolean addObjeto(ObjetoDto objetoDto){
        if(prestamoUQFacade.verificarObjetoExistente(objetoDto.nombre())){
            Objeto newObjeto = mapper.objetoDtoToObjeto(objetoDto);
            return prestamoUQFacade.createObjeto(newObjeto);
        }
        return false;
    }

    @Override
    public boolean deleteObjeto(String nombre) {
        if(prestamoUQFacade.verificarObjetoExistente(nombre)){
            return prestamoUQFacade.deleteObjeto(nombre);
        }
        return false;
    }

    @Override
    public boolean updateObjeto(String nombre, ObjetoDto objetoDto) {
        if(prestamoUQFacade.verificarObjetoExistente(nombre) ){
            Objeto objetoExistente = null;

            for(Objeto objeto : prestamoUQFacade.listObjetos()){
                if(objeto.getNombre().equals(nombre)){
                    objetoExistente = objeto;
                    break;
                }
            }

            if(objetoExistente != null){
                Objeto newObjeto = mapper.objetoDtoToObjeto(objetoDto);
                newObjeto.setNombre(nombre);
                newObjeto.setPrestamoAsociado(objetoDto.prestamoAsociado());
                return prestamoUQFacade.updateObjeto(objetoExistente.getNombre(), newObjeto.getPrestamoAsociado());
            }
        }
        return false;
    }

    @Override
    public List<PrestamoDto> getPrestamos(){
        return mapper.getPrestamosDto(prestamoUQFacade.listPrestamos());
    }

    @Override
    public boolean addPrestamo(PrestamoDto prestamoDto){
        if(prestamoUQFacade.verificarPrestamoExistente(prestamoDto.numeroPrestamo())){
            Prestamo newPrestamo = mapper.prestamoDtoToPrestamo(prestamoDto);
            return prestamoUQFacade.createPrestamo(newPrestamo);
        }
        return false;
    }

    @Override
    public boolean deletePrestamo(String numeroPrestamo) {
        if(prestamoUQFacade.verificarPrestamoExistente(numeroPrestamo)){
            return prestamoUQFacade.deletePrestamo(numeroPrestamo);
        }
        return false;
    }

    @Override
    public boolean updatePrestamo(String numeroPrestamo, PrestamoDto prestamoDto) {
        if(prestamoUQFacade.verificarPrestamoExistente(numeroPrestamo) ){
            Prestamo prestamoExistente = null;

            for(Prestamo prestamo : prestamoUQFacade.listPrestamos()){
                if(prestamo.getNumeroPrestamo().equals(numeroPrestamo)){
                    prestamoExistente = prestamo;
                    break;
                }
            }

            if(prestamoExistente != null){
                Prestamo newPrestamo = mapper.prestamoDtoToPrestamo(prestamoDto);
                newPrestamo.setNumeroPrestamo(numeroPrestamo);
                newPrestamo.setFechaPrestamo(prestamoDto.fechaPrestamo());
                newPrestamo.setFechaEntrega(prestamoDto.fechaEntrega());
                newPrestamo.setDescripcion(prestamoDto.descripcion());
                newPrestamo.setClienteAsociado(prestamoDto.clienteAsociado());
                newPrestamo.setEmpleadoAsociado(prestamoDto.empleadoAsociado());
                return prestamoUQFacade.updatePrestamo(numeroPrestamo, newPrestamo.getFechaPrestamo(), newPrestamo.getFechaEntrega(), newPrestamo.getDescripcion(), newPrestamo.getClienteAsociado(), newPrestamo.getEmpleadoAsociado());
            }
        }
        return false;
    }

}
