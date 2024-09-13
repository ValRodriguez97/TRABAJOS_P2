package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.model.builder.DepartamentoBuilder;
import co.edu.uniquindio.services.IPrototypeDepto;

/**
 * Clase Departamento dentro de una empresa
 * implement IPrototypeDepto para clonar la clase Departamento
 */
public class Departamento implements IPrototypeDepto {

    private String nombre;
    private String codigo;
    private List<Empleado> listEmpleados;

    /**
     * Constructor de la clase Departamento
     *
     * @param nombre Nombre del Departamento
     * @param codigo Código del departamento
     */
    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listEmpleados = new ArrayList<>();
        assert nombre != null && !nombre.isEmpty();
        assert codigo != null && !codigo.isEmpty();
    }

    /**
     * Instancia del DepartamentoBuilder para construir un objeto del tipo Departamento
     *
     * @return DepartamentoBuilder para construir un objeto
     */
    public static DepartamentoBuilder departamentoBuilder() {
        return new DepartamentoBuilder();
    }

    /**
     * Método para agregar un empleado a la lista de empleados del departamento
     * @param empleado Empleado a agregar
     */
    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("No se puede agregar el empleado");
        }
        listEmpleados.add(empleado);
    }

    /**
     * Método para obtener el nombre del Departamento
     *
     * @return Nombre del Departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del departamento
     *
     * @param nombre Nuevo nombre del Departamento
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el código del Departamento
     *
     * @return Código del Departamento
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método para establecer el código del Departamento
     *
     * @param codigo Nuevo código del Departamento
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener la lista de empleados del Departamento
     *
     * @return Lista de empleados
     */
    public List<Empleado> getEmpleados() {
        return listEmpleados;
    }

    /**
     * Método para establecer la lista de empleados del Departamento
     *
     * @param empleados Nueva lista de empleados
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.listEmpleados = empleados;
    }

    /**
     * Método para clonar el objeto Departamento
     *
     * @return Copia del Departamento
     */
    @Override
    public IPrototypeDepto clone() {
        Departamento depto = null;
        try {
            depto = (Departamento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return depto;
    }

    /**
     * Método toString que devuelve una representación en cadena de Departamento
     *
     * @return Representación en cadena de Departamento
     */
    @Override
    public String toString() {
        return "Departamento \n"
                + "Nombre: " + nombre + "\n"
                + "Codigo: " + codigo + "\n"
                + "Lista de empleados: " + listEmpleados + "\n";
    }
}