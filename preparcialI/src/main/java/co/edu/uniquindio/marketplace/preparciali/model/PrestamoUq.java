package co.edu.uniquindio.marketplace.preparciali.model;

import co.edu.uniquindio.marketplace.preparciali.service.ICrudCliente;
import co.edu.uniquindio.marketplace.preparciali.service.ICrudEmpleado;
import co.edu.uniquindio.marketplace.preparciali.service.ICrudObjeto;
import co.edu.uniquindio.marketplace.preparciali.service.ICrudPrestamo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrestamoUq implements ICrudObjeto, ICrudPrestamo, ICrudCliente, ICrudEmpleado {
    private String nombre;
    private List<Cliente> listaClientes;
    private List<Prestamo> listaPrestamos;
    private List<Empleado> listaEmpleados;
    private List<Objeto> listaObjetos;

    public PrestamoUq (String nombre){
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaObjetos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    @Override
    public boolean createObjeto(Objeto newObjeto){
        if (newObjeto  != null) {
            getListaObjetos().add(newObjeto);
            return true;
        }
        return false;
    }

    @Override
    public Objeto readObjeto(String nombre){
        Objeto objetoExistente = verificarObjeto(nombre);
        if (objetoExistente != null){
            return objetoExistente;
        }
        return null;
    }

    @Override
    public boolean updateObjeto(String nombre){
        Objeto objetoExistente = verificarObjeto(nombre);
        if(objetoExistente != null){
            objetoExistente.setNombre(nombre);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteObjeto(String nombre){
        Objeto objetoExistente = verificarObjeto(nombre);
        if(objetoExistente != null){
            getListaObjetos().remove(objetoExistente);
            return true;
        }
        return false;
    }

    @Override
    public List<Objeto> listObjetos(){
        return List.of();
    }

    @Override
    public boolean verificarObjetoExistente(String nombre){
        if(verificarObjeto(nombre) == null){
            return false;
        }
        return true;
    }

    public Objeto verificarObjeto(String nombre){
        Objeto objetoExistente = null;
        for (Objeto objeto : listaObjetos){
            if (objeto.getNombre().equals(nombre)){
                objetoExistente = objeto;
                break;
            }
        }
        return objetoExistente;
    }

    @Override
    public boolean createPrestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion){
        Prestamo prestamoExistente = verificarPrestamo(numeroPrestamo);
        if (prestamoExistente != null){
            getListaPrestamos().add(prestamoExistente);
            return true;
        }
        return false;
    }

    @Override
    public Prestamo readPrestamo (String numeroPrestamo){
        Prestamo prestamoExistente = verificarPrestamo(numeroPrestamo);
        if(prestamoExistente != null){
            return prestamoExistente;
        }
        return null;
    }

    @Override
    public boolean updatePrestamo (String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion){
        Prestamo prestamoExistente = verificarPrestamo(numeroPrestamo);
        if (prestamoExistente != null){
            prestamoExistente.setNumeroPrestamo(numeroPrestamo);
            prestamoExistente.setFechaPrestamo(fechaPrestamo);
            prestamoExistente.setFechaEntrega(fechaEntrega);
            prestamoExistente.setDescripcion(descripcion);

            return true;
        }
        return false;
    }

    @Override
    public boolean deletePrestamo(String numeroPrestamo){
        Prestamo prestamoExistente = verificarPrestamo(numeroPrestamo);
        if(prestamoExistente != null){
            getListaPrestamos().remove(prestamoExistente);
            return true;
        }
        return false;
    }

    @Override
    public List<Prestamo> listPrestamos(){
        return List.of();
    }

    @Override
    public boolean verificarPrestamoExistente(String numeroPrestamo){
        if(verificarPrestamo(numeroPrestamo) == null){
            return false;
        }
        return true;
    }

    public Prestamo verificarPrestamo(String numeroPrestamo){
        Prestamo prestamoExistente = null;
        for (Prestamo prestamo : listaPrestamos){
            if (prestamo.getNumeroPrestamo().equals(numeroPrestamo)){
                prestamoExistente = prestamo;
                break;
            }
        }
        return prestamoExistente;
    }

    @Override
    public boolean createCliente(String nombre, String apellido, String cedula, String edad){
        Cliente clienteExistente = verificarCliente(cedula);
        if (clienteExistente != null){
            getListaClientes().add(clienteExistente);
            return true;
        }
        return false;
    }

    @Override
    public Cliente readCliente(String cedula){
        Cliente clienteExistente = verificarCliente(cedula);
        if (clienteExistente != null){
            return clienteExistente;
        }
        return null;
    }

    @Override
    public boolean updateCliente(String nombre, String apellido,String cedula, String edad){
        Cliente clienteExistente = verificarCliente(cedula);
        if (clienteExistente != null){
            clienteExistente.setCedula(cedula);
            clienteExistente.setNombre(nombre);
            clienteExistente.setApellido(apellido);
            clienteExistente.setEdad(edad);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCliente(String cedula){
        Cliente clienteExistente = verificarCliente(cedula);
        if (clienteExistente != null){
            getListaClientes().remove(clienteExistente);
            return true;
        }
        return false;
    }

    @Override
    public List<Cliente> listClientes(){
        return List.of();
    }

    @Override
    public boolean verificarClienteExistente(String cedula){
        if (verificarCliente(cedula) == null){
            return false;
        }
        return true;
    }

    public Cliente verificarCliente(String cedula){
        Cliente clienteExistente = null;
        for (Cliente cliente : getListaClientes()){
            if (cliente.getCedula().equals(cedula)){
                clienteExistente = cliente;
                break;
            }
        }
        return clienteExistente;
    }

    @Override
    public boolean createEmpleado(String nombre, String apellido, String cedula, String edad){
        Empleado  empleadoExistente = verificarEmpleado(cedula);
        if (empleadoExistente != null){
            getListaEmpleados().add(empleadoExistente);
            return true;
        }
        return false;
    }

    @Override
    public Empleado readEmpleado(String cedula){
        Empleado empleadoExistente = verificarEmpleado(cedula);
        if (empleadoExistente != null){
            return empleadoExistente;
        }
        return null;
    }

    @Override
    public boolean updateEmpleado(String cedula, String nombre, String apellido, String edad){
        Empleado  empleadoExistente = verificarEmpleado(cedula);
        if (empleadoExistente != null){
            empleadoExistente.setNombre(nombre);
            empleadoExistente.setApellido(apellido);
            empleadoExistente.setCedula(cedula);
            empleadoExistente.setEdad(edad);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmpleado(String cedula){
        Empleado  empleadoExistente = verificarEmpleado(cedula);
        if (empleadoExistente != null){
            getListaEmpleados().remove(empleadoExistente);
            return true;
        }
        return false;
    }

    @Override
    public List<Empleado> listEmpleados(){
        return List.of();
    }

    @Override
    public boolean verificarEmpleadoExistente(String cedula){
        if (verificarCliente(cedula) == null){
            return true;
        }
        return false;
    }

    public Empleado verificarEmpleado(String cedula){
        Empleado empleadoExistente = null;
        for (Empleado empleado : getListaEmpleados()){
            if (empleado.getCedula().equals(cedula)){
                empleadoExistente = empleado;
                break;
            }
        }
        return empleadoExistente;
    }









}
