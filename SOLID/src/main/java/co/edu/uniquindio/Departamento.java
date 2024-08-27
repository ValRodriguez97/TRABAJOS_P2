package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Departamento
 */
public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> listEmpleados;

    /**
     * Método Constructor de la clase Departamento
     *
     * @param nombre nombre del Departamento de la empresa
     * @param codigo codigo del Departamento de la empresa
     */
    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listEmpleados = new ArrayList<>();
        assert nombre != null && !nombre.isEmpty();
        assert codigo != null && !codigo.isEmpty();
    }

    /**
     * Método para agregar un empleado a la lista  de empleados
     *
     * @param empleado a agregar
     */
    public void agregarEmpleado(Empleado empleado) {
        listEmpleados.add(empleado);
    }

    /**
     * Método para obtener el nombre del departamento de una empresa
     *
     * @return nombre del Departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del Departamento de la empresa
     *
     * @param nombre nuevo nombre del Departamento de la empresa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el código del Departamento de la empresa
     *
     * @return codigo del Departamento de la empresa
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método para establecer el codigo del Departamento de una empresa
     *
     * @param codigo nuevo codigo del Departamento de una empresa
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener la lista de los empleados de un Departamento
     *
     * @return lista de empleados
     */
    public List<Empleado> getEmpleados() {
        return listEmpleados;
    }

    /**
     * Método para establecer la lista de empleados de un Departamento
     *
     * @param empleados nueva lista de empleados
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.listEmpleados = empleados;
    }

    /**
     * Método que devuelve la representación en cadena de la clase Departamento
     *
     * @return representación en cadena de la clase Departamento
     */
    @Override
    public String toString() {
        return "Departamento \n"
                + "Nombre: " + nombre + "\n"
                + "Codigo: " + codigo + "\n"
                + "Lista de empleados: " + listEmpleados + "\n";
    }
}


