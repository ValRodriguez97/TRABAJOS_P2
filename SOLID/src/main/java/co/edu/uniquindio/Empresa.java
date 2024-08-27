package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Proyecto> listProyectos;
    private List<Empleado> listEmpleados;
    private List<Departamento> listDepartamentos;

    public Empresa() {
        listProyectos = new ArrayList<>();
        listEmpleados = new ArrayList<>();
        listDepartamentos = new ArrayList<>();
    }

    /**
     * Método para obtener la lista de los proyectos de una empresa
     *
     * @return lista de proyectos
     */
    public List<Proyecto> getListProyectos() {
        return listProyectos;
    }

    /**
     * Método para establecer la lista de los proyectos de una empresa
     *
     * @param listProyectos nueva lista de proyectas
     */
    public void setListProyectos(List<Proyecto> listProyectos) {
        this.listProyectos = listProyectos;
    }

    /**
     * Método para obtener la lista de empleados de una empresa
     *
     * @return lista de empleados
     */
    public List<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    /**
     * Método para establecer la lista de empleados de una empresa
     *
     * @param listEmpleados nueva lista de empleados
     */
    public void setListEmpleados(List<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    /**
     * Método para obtener la lista de departamentos de una empresa
     *
     * @return lista de departamentos  de una empresa
     */
    public List<Departamento> getListDepartamentos() {
        return listDepartamentos;
    }

    /**
     * Método para establecer la lista de departamentos de una empresa
     *
     * @param listDepartamentos nueva lista de departamentos
     */
    public void setListDepartamentos(List<Departamento> listDepartamentos) {
        this.listDepartamentos = listDepartamentos;
    }

    /**
     * Método para añadir proyectos a la lista de proyectos de una empresa
     *
     * @param proyecto a añadir
     */
    public void agregarProyectos( Proyecto proyecto) {
        listProyectos.add(proyecto);
    }

    /**
     * Método para añadir empleados a la lista de empleados de una empresa
     *
     * @param empleado a añadir
     */
    public void agregarEmpleados( Empleado empleado) {
        listEmpleados.add(empleado);
    }

    /**
     * Método para añadir departamentos a la lista de departamentos de una empresa
     *
     * @param departamento a añadir
     */
    public void agregarDepartamentos( Departamento departamento) {
        listDepartamentos.add(departamento);
    }
}
