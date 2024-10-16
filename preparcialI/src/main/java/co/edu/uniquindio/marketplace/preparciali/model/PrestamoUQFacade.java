package co.edu.uniquindio.marketplace.preparciali.model;

import co.edu.uniquindio.marketplace.preparciali.service.IPrestamoUQFacade;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class PrestamoUQFacade implements IPrestamoUQFacade {
    private PrestamoUq prestamoUq;

    public PrestamoUQFacade(PrestamoUq prestamoUq) {
        this.prestamoUq = prestamoUq;
    }

    //Cliente
    @Override
    public boolean createCliente(Cliente cliente) {
        return prestamoUq.createCliente(cliente);
    }

    @Override
    public Cliente readCliente(String cedula){
        return prestamoUq.readCliente(cedula);
    }

    @Override
    public boolean updateCliente(String nombre, String apellido, String cedula, String edad){
        return prestamoUq.updateCliente(nombre, apellido, cedula, edad);
    }

    @Override
    public boolean deleteCliente(String cedula){
        return prestamoUq.deleteCliente(cedula);
    }

    @Override
    public List<Cliente> listClientes(){
        return prestamoUq.listClientes();
    }

    @Override
    public boolean verificarClienteExistente(String cedula){
        return prestamoUq.verificarClienteExistente(cedula);
    }

    //Empleado
    @Override
    public boolean createEmpleado(Empleado empleado) {
        return prestamoUq.createEmpleado(empleado);
    }

    @Override
    public Empleado readEmpleado(String cedula){
        return prestamoUq.readEmpleado(cedula);
    }

    @Override
    public boolean updateEmpleado(String nombre, String apellido, String cedula, String edad){
        return prestamoUq.updateEmpleado(nombre, apellido, cedula, edad);
    }

    @Override
    public boolean deleteEmpleado(String cedula){
        return prestamoUq.deleteEmpleado(cedula);
    }

    @Override
    public List<Empleado> listEmpleados(){
        return prestamoUq.listEmpleados();
    }

    @Override
    public boolean verificarEmpleadoExistente(String cedula){
        return prestamoUq.verificarEmpleadoExistente(cedula);
    }

    //Prestamo
    @Override
    public boolean createPrestamo(Prestamo prestamo){
        return prestamoUq.createPrestamo(prestamo);
    }

    @Override
    public Prestamo readPrestamo(String cedula){
        return prestamoUq.readPrestamo(cedula);
    }

    @Override
    public boolean updatePrestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado){
        return prestamoUq.updatePrestamo(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado);
    }

    @Override
    public boolean deletePrestamo(String numeroPrestamo){
        return prestamoUq.deletePrestamo(numeroPrestamo);
    }

    @Override
    public List<Prestamo> listPrestamos(){
        return prestamoUq.listPrestamos();
    }

    @Override
    public boolean verificarPrestamoExistente(String cedula){
        return prestamoUq.verificarPrestamoExistente(cedula);
    }

    //Objeto
    @Override
    public boolean createObjeto(Objeto objeto){
        return prestamoUq.createObjeto(objeto);
    }

    @Override
    public Objeto readObjeto(String nombre){
        return prestamoUq.readObjeto(nombre);
    }

    @Override
    public boolean updateObjeto(String nombre, Prestamo prestamoAsociado){
        return prestamoUq.updateObjeto(nombre, prestamoAsociado);
    }

    @Override
    public boolean deleteObjeto(String nombre){
        return prestamoUq.deleteObjeto(nombre);
    }

    @Override
    public List<Objeto> listObjetos(){
        return prestamoUq.listObjetos();
    }

    @Override
    public boolean verificarObjetoExistente(String nombre){
        return prestamoUq.verificarObjetoExistente(nombre);
    }
}
