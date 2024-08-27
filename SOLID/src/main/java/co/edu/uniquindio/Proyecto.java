package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Proyecto perteneciente a la empresa
 */
public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados;

    /**
     * Método Constructor de la clase Proyecto
     *
     * @param nombre nombre del Proyecto
     * @param codigo código del Proyecto
     */
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = new ArrayList<>();
        assert nombre != null && !nombre.isEmpty();
        assert codigo != null && !codigo.isEmpty();
        assert empleadosAsignados != null && !empleadosAsignados.isEmpty();
    }

    /**
     * Método para obtener el nombre del proyecto
     *
     * @return nombre del proyecto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del Proyecto
     *
     * @param nombre nuevo nombre del proyecto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el código del proyecto
     *
     * @return código del proyecto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método para establecer el codigo del proyecto de una empresa
     *
     * @param codigo nuevo código del proyecto
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener la lista de empleados asignados al proyecto
     *
     * @return lista de empleados asignados
     */
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    /**
     * Método para establecer la lista de empleados asignados de un proyecto
     *
     * @param empleadosAsignados nuevos empleados asignados
     */
    public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }

    /**
     * Método para asignar un gerente al proyecto
     *
     * @param gerente a asignar
     */
    public void asignarGerente(Gerente gerente) {
        empleadosAsignados.add(gerente);
    }

    /**
     * Método para asignar un empleado al proyecto
     *
     * @param empleado a asignar
     */
    public void asignarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
    }

    /**
     * Método que devuleve una representación en cadena de la clase Proyecto
     *
     * @return representación en cadena de la clase Proyecto
     */
    @Override
    public String toString() {
        return "Proyecto \n"
                + "Nombre: " + nombre + "\n"
                + "Codigo: " + codigo + "\n"
                + "Empleados: " + empleadosAsignados + "\n";
    }
}
