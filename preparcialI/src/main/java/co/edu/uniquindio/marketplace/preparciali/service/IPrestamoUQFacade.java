package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Empleado;
import co.edu.uniquindio.marketplace.preparciali.model.Objeto;
import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IPrestamoUQFacade {

    //Cliente
    boolean createCliente (Cliente cliente);
    Cliente readCliente(String cedula);
    boolean updateCliente(String cedula, String nombre, String apellido, String edad);
    boolean deleteCliente(String cedula);
    List<Cliente> listClientes();
    boolean verificarClienteExistente(String cedula);


    //Empleado
    boolean createEmpleado(Empleado empleado);
    Empleado readEmpleado(String cedula);
    boolean updateEmpleado(String cedula, String nombre, String apellido, String edad);
    boolean deleteEmpleado(String cedula);
    List<Empleado> listEmpleados();
    boolean verificarEmpleadoExistente(String cedula);


    //Prestamo
    boolean createPrestamo(Prestamo prestamo);
    Prestamo readPrestamo(String numeroPrestamo);
    boolean updatePrestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado);
    boolean deletePrestamo(String numeroPrestamo);
    List<Prestamo> listPrestamos();
    boolean verificarPrestamoExistente(String numeroPrestamo);

    //Objeto
    boolean createObjeto(Objeto objeto);
    Objeto readObjeto(String nombre);
    boolean updateObjeto(String nombre, Prestamo prestamoAsociado);
    boolean deleteObjeto(String nombre);
    List<Objeto> listObjetos();
    boolean verificarObjetoExistente(String nombre);
}
