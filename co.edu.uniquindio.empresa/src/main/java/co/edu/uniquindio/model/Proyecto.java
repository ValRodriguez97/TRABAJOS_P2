package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.ProyectoBuilder;
import co.edu.uniquindio.services.IAsignable;
import co.edu.uniquindio.services.IPrototypeProyecto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Proyecto perteneciente a la empresa
 */
public class Proyecto implements IPrototypeProyecto, IAsignable {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados;
    private List<Departamento> departamentosAsignados;;

    /**
     * Metodo constructor de la clase proyecto
     *
     * @param nombre Nombre del proyecto
     * @param codigo Codigo del proyecto
     */
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = new ArrayList<>();
    }

    /**
     * Metodo para obtener el nombre del proyecto
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre del proyecto
     *
     * @param nombre Nombre del proyecto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el codigo del proyecto
     *
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para modificar el codigo del proyecto
     *
     * @param codigo Codigo del proyecto
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener la lista de empleados asignados al proyecto
     *
     * @return empleadosAsignados
     */
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    /**
     * Metodo para modificar la lista de empleados asignados
     *
     * @param empleadosAsignados Empleados asignados al proyecto
     */
    public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }

    public List<Departamento>ngetDepartamentosAsignados(){
        return departamentosAsignados;
    }

    public void setDepartamentosAsignados(List<Departamento> departamentosAsignados) {
        this.departamentosAsignados = departamentosAsignados;
    }

    /**
     * Metodo para asignar un gerente a la lista de empleados asignados
     *
     * @param gerente Gerente a asignar
     */
    public void asignarGerente(Gerente gerente) {
        empleadosAsignados.add(gerente);
    }

    /**
     * Metodo para asignar un tecnico a la lista de empleados asignados
     *
     * @param tecnico Tecnico a asignar
     */
    public void asignarTecnico(Tecnico tecnico) {
        empleadosAsignados.add(tecnico);
    }

    /**
     * Crear una instancia del constructor del proyecto(Aplicacion del builder)
     *
     * @return ProyectoBuilder
     */
    public static ProyectoBuilder proyectobuilder() {
        return new ProyectoBuilder();
    }

    /**
     * Implementacion del patron creacional prototype(Metodo para clonar un proyecto)
     *
     * @return proyecto
     */
    @Override
    public IPrototypeProyecto clone() {
        Proyecto proyecto = null;
        try {
            proyecto = (Proyecto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return proyecto;
    }

    public void asignarDepartamento (Departamento departamento){
        departamentosAsignados.add(departamento);
    }
    /**
     * Metodo toString de la clase proyecto(Metodo para obtener el objeto como una cadena)
     * @return String
     */
    @Override
    public String toString() {
        return "Proyecto \n"
                + "Nombre: " + nombre + "\n"
                + "Codigo: " + codigo + "\n"
                + "Empleados: " + empleadosAsignados + "\n";
    }
}