package co.edu.uniquindio.model;
import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudEmpleado;
import co.edu.uniquindio.services.ICrudProyecto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements ICrudEmpleado, ICrudDepartamento, ICrudProyecto {
    private List<Proyecto> listProyectos;
    private List<Empleado> listEmpleados;
    private List<Departamento> listDepartamentos;
    private List<Empleado> listEmpleadosMayores;

    public Empresa() {
        listProyectos = new ArrayList<>();
        listEmpleados = new ArrayList<>();
        listDepartamentos = new ArrayList<>();
        listEmpleadosMayores = new ArrayList<>();
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

    @Override
    public boolean createDepartamento(String nombre, String codigo){
        Departamento departamentoExistente = verificarDepartamento(codigo);
        if(departamentoExistente == null){
            Departamento newDepartamento = Departamento.departamentoBuilder().setNombre(nombre).setCodigo(codigo).build();
            agregarDepartamentos(newDepartamento);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateDepartamento(String nombre, String codigo){
        return false;
    }

    @Override
    public boolean deleteDepartamento(String codigo){
        return false;
    }

    @Override
    public Departamento readDepartamento(String codigo){
        return null;
    }

    @Override
    public ArrayList<Departamento> getDepartamentos() {
        return null;
    }

    private Departamento verificarDepartamento(String codigo){
        Departamento departamentoExistente = null;
        for (Departamento departamento : listDepartamentos){
            if(departamento.getCodigo().equals(codigo)){
                departamentoExistente = departamento;
                break;
            }
        }
        return departamentoExistente;
    }

    @Override
    public boolean createProyecto(String nombre, String codigo){
        Proyecto proyectoExistente = verificarroyecto(codigo);
        if(proyectoExistente == null){
            Proyecto newProyecto = Proyecto.proyectobuilder().setNombre(nombre).setCodigo(codigo).build();
            agregarProyectos(newProyecto);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateProyecto(String nombre, String codigo){
        return false;
    }

    @Override
    public boolean deleteProyecto(String codigo){
        return false;
    }

    @Override
    public Proyecto readProyecto(String codigo){
        return null;
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return null;
    }

    private Proyecto verificarroyecto(String codigo){
        Proyecto proyectoExistente = null;
        for(Proyecto proyecto : listProyectos){
            if(proyecto.getCodigo().equals(codigo)){
                proyectoExistente = proyecto;
                break;
            }
        }
        return proyectoExistente;
    }

    @Override
    public boolean createEmpleado(String nombre, String idEmpleado, int edad, Departamento departamento){
        Empleado empleadoExistente = null;
        if (empleadoExistente == null){
            Empleado newEmpleado = Empleado.empleadobuilder().setNombre(nombre).setIdEmpleado(idEmpleado).setEdad(edad).setDepartamento(departamento).build();
            agregarEmpleados(newEmpleado);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateEmpleado(String nombre, String idEmpleado, int edad, Departamento departamento){
        return false;
    }

    @Override
    public boolean deleteEmpleado(String idEmpleado){
        return false;
    }

    @Override
    public Empleado readEmpleado(String idEmpleado){
        return null;
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        return null;
    }

    private Empleado verificarEmpleado(String idEmpleado){
        Empleado empleadoExistente = null;
        for(Empleado empleado : listEmpleadosMayores){
            if(empleado.getIdEmpleado().equals(idEmpleado)){
                empleadoExistente = empleado;
                break;
            }
        }
        return empleadoExistente;
    }


    /**
     * Método para añadir proyectos a la lista de proyectos de una empresa
     *
     * @param proyecto a añadir
     */
    public void agregarProyectos(Proyecto proyecto) {
        listProyectos.add(proyecto);
    }

    /**
     * Método para añadir empleados a la lista de empleados de una empresa
     *
     * @param empleado a añadir
     */
    public void agregarEmpleados(Empleado empleado) {
        listEmpleados.add(empleado);
    }

    /**
     * Método para añadir departamentos a la lista de departamentos de una empresa
     *
     * @param departamento a añadir
     */
    public void agregarDepartamentos(Departamento departamento) {
        listDepartamentos.add(departamento);
    }

    /**
     * Metodo para obtener la lista de mayores de edad
     */
    public void mayorEdad() {
        for (Empleado empleado : listEmpleados){
            if (empleado.getEdad() >= 18){
                listEmpleadosMayores.add(empleado);

            }
        }
        JOptionPane.showMessageDialog(null,listEmpleadosMayores);
    }

    /**
     * Metodo para saber que tipo de empleado es
     */
    public void identificarEmpleado(){
        for (Object obj : listEmpleados) {
            if (obj instanceof Gerente) {
                JOptionPane.showMessageDialog(null,((Gerente) obj).getNombre() + "  IdEmpleado: " + ((Gerente) obj).getIdEmpleado() + " es un Gerente.");
            } else if (obj instanceof Tecnico) {
                JOptionPane.showMessageDialog(null,((Tecnico) obj).getNombre() + "  IdEmpleado: " + ((Tecnico) obj).getIdEmpleado() + " es un Técnico.");
            } else if (obj instanceof Empleado) {
                JOptionPane.showMessageDialog(null,((Empleado) obj).getNombre() + "  IdEmpleado: " + ((Empleado) obj).getIdEmpleado() + " es un Empleado.");
            } else {
                JOptionPane.showMessageDialog(null,obj + " es de un tipo desconocido.");
            }
        }
    }

    /**
     * Metodo para eliminar un empleado
     */
    public void eliminarEmpleado(){
        String idEmpleadoEliminar = JOptionPane.showInputDialog("Ingurese el id del empleado a eliminar:");
        for (Empleado empleado : listEmpleados) {
            if(empleado.getIdEmpleado().equals(idEmpleadoEliminar)){
                listEmpleados.remove(empleado);
            }
        }
        JOptionPane.showMessageDialog(null, "El empleado fue eliminado exitosamente");
    }
}
