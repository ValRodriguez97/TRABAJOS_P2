package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.PresupuestoBuilder;
import co.edu.uniquindio.services.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase representante de una Empresa la cual gestiona proyectos, departamentos, gerentes y técnicos.
 */
public class Empresa implements ICrudDepartamento, ICrudProyecto, ICrudGerente, ICrudTecnico, ICrudPresupuesto {

    private List<Proyecto> listProyectos;
    private List<Gerente> listGerentes;
    private List<Tecnico> listTecnicos;
    private List<Departamento> listDepartamentos;
    private List<Presupuesto> listPresupuestos;

    /**
     * Constructor de la clase Empresa que inicializa las listas de proyectos, gerentes, tecnicos y departamentos
     */
    public Empresa() {
        listProyectos = new ArrayList<>();
        listGerentes = new ArrayList<>();
        listTecnicos = new ArrayList<>();
        listDepartamentos = new ArrayList<>();
        listPresupuestos = new ArrayList<>();
    }

    /**
     * Método para obtener la lista de proyectos de una Empresa
     *
     * @return Lista de Proyectos
     */
    public List<Proyecto> getListProyectos() {
        return listProyectos;
    }

    /**
     * Método para establecer la nueva lista de Proyectos de una Empresa
     *
     * @param listProyectos Nueva lista de proyectos
     */
    public void setListProyectos(List<Proyecto> listProyectos) {
        this.listProyectos = listProyectos;
    }

    /**
     * Método para obtener la lista de departamentos de una Empresa
     *
     * @return Lista de departamentos
     */
    public List<Departamento> getListDepartamentos() {
        return listDepartamentos;
    }

    /**
     * Método para establecer la nueva lista de departamentos de una Empresa
     *
     * @param listDepartamentos Nueva lista de departamentos
     */
    public void setListDepartamentos(List<Departamento> listDepartamentos) {
        this.listDepartamentos = listDepartamentos;
    }

    /**
     * Método para obtener la lista de gerentes de una Empresa
     *
     * @return Lista de gerentes
     */
    public List<Gerente> getListGerentes() {
        return listGerentes;
    }

    /**
     * Método para establecer la nueva lista de gerentes de una Empresa
     *
     * @param listGerentes Nueva lista de gerentes
     */
    public void setListGerentes(List<Gerente> listGerentes) {
        this.listGerentes = listGerentes;
    }

    /**
     * Método para obtener la lista de tecnicos de una Empresa
     *
     * @return Lista de tecnicos
     */
    public List<Tecnico> getListTecnicos() {
        return listTecnicos;
    }

    /**
     * Método para establecer la nueva lista de técnicos de una Empresa
     *
     * @param listTecnicos Nueva lista de técnicos
     */
    public void setListTecnicos(List<Tecnico> listTecnicos) {
        this.listTecnicos = listTecnicos;
    }

    public List<Presupuesto> getListPresupuestos() {
        return listPresupuestos;
    }

    public void setListPresupuestos(List<Presupuesto> listPresupuestos) {
        this.listPresupuestos = listPresupuestos;
    }

    /**
     * Método  de la interface Crud para crear un Departamento
     *
     * @param nombre Nombre del departamento
     * @param codigo Codigo del departamento
     * @return
     */
    @Override
    public boolean createDepartamento(String nombre, String codigo) {
        if (verificarDepartamento(codigo) == null) {
            Departamento newDepartamento = Departamento.departamentoBuilder().nombre(nombre).codigo(codigo).build();
            agregarDepartamentos(newDepartamento);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para actualizar un Departamento
     *
     * @param nombre Nombre del departamento
     * @param codigo Codigo del Departamento
     * @return
     */
    @Override
    public boolean updateDepartamento(String nombre, String codigo) {
        Departamento departamentoExistente = verificarDepartamento(codigo);
        if (departamentoExistente != null) {
            departamentoExistente.setNombre(nombre);
            departamentoExistente.setCodigo(codigo);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para eliminar un Departamento
     *
     * @param codigo Codigo del departamento
     * @return
     */
    @Override
    public boolean deleteDepartamento(String codigo) {
        Departamento departamentoExistente = verificarDepartamento(codigo);
        if (departamentoExistente != null) {
            listDepartamentos.remove(departamentoExistente);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para leer un Departamento
     *
     * @param codigo Código del departamento
     * @return
     */
    @Override
    public Departamento readDepartamento(String codigo) {
        return verificarDepartamento(codigo);
    }

    /**
     * Método de la interface Crud para obtener la lista de departamentos
     *
     * @return
     */
    @Override
    public ArrayList<Departamento> getDepartamentos() {
        return new ArrayList<>(listDepartamentos);
    }

    /**
     * Método para agregar un departamento a la lista de departamentos
     *
     * @param departamento Departamento a agregar
     */
    public void agregarDepartamentos(Departamento departamento) {
        listDepartamentos.add(departamento);
    }

    /**
     * Método de la interface Crud para crear un proyecto de la Empresa
     *
     * @param nombre Nombre del proyecto
     * @param codigo Código del proyecto
     * @return
     */
    @Override
    public boolean createProyecto(String nombre, String codigo) {
        if (verificarproyecto(codigo) == null) {
            Proyecto newProyecto = Proyecto.proyectobuilder().nombre(nombre).codigo(codigo).build();
            agregarProyectos(newProyecto);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para actualizar un proyecto de la empresa
     *
     * @param nombre Nuevo nombre del proyecto
     * @param codigo Nuevo código del proyecto
     * @return
     */
    @Override
    public boolean updateProyecto(String nombre, String codigo) {
        Proyecto proyectoExistente = verificarproyecto(codigo);
        if (proyectoExistente != null) {
            proyectoExistente.setNombre(nombre);
            proyectoExistente.setCodigo(codigo);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para eliminar un proyecto de la empresa
     *
     * @param codigo Código a eliminar
     * @return
     */
    @Override
    public boolean deleteProyecto(String codigo) {
        Proyecto proyectoExistente = verificarproyecto(codigo);
        if (proyectoExistente != null) {
            listProyectos.remove(proyectoExistente);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para leer un proyecto de una empresa
     *
     * @param codigo Código del proyecto a leer
     * @return
     */
    @Override
    public Proyecto readProyecto(String codigo) {
        return verificarproyecto(codigo);
    }

    /**
     * Método para obtener la lista de proyectos de una empresa
     *
     * @return Lista de prpyectos
     */
    @Override
    public ArrayList<Proyecto> getProyectos() {
        return new ArrayList<>(listProyectos);
    }

    /**
     * Método para añadir un proyecto a la lista de proyectos de la Empresa
     *
     * @param proyecto Proyecto a añadir
     */
    public void agregarProyectos(Proyecto proyecto) {
        listProyectos.add(proyecto);
    }

    /**
     * Método de la interface Crud para crear un gerente de la Empresa
     *
     * @param nombre Nombre del gerente
     * @param idEmpleado Id del gerente
     * @param edad Edad del gerente
     * @param departamento Departamento donde esta el gerente
     * @return
     */
    @Override
    public boolean createGerente(String nombre, String idEmpleado, int edad, Departamento departamento) {
        if (verificarGerente(idEmpleado) == null) {
            Gerente newGerente = Gerente.gerenteBuilder().nombre(nombre).idEmpleado(idEmpleado).edad(edad).departamento(departamento).build();
            agregarGerente(newGerente);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para actualizar un gerente de la Empresa
     *
     * @param nombre Nuevo nombre del gerente
     * @param idEmpleado Nuevo idEmpleado del gerente
     * @param edad Nueva edad del gerente
     * @param departamento Nuevo departamento asociado al gerente
     * @return
     */
    @Override
    public boolean updateGerente(String nombre, String idEmpleado, int edad, Departamento departamento) {
        Gerente gerenteExistente = null;
        if (gerenteExistente != null) {
            gerenteExistente.setNombre(nombre);
            gerenteExistente.setIdEmpleado(idEmpleado);
            gerenteExistente.setEdad(edad);
            gerenteExistente.setDepartamentoAsociado(departamento);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para eliminar un gerente de la Empresa
     *
     * @param idEmpleado Id Empleado del gerente a eliminar
     * @return
     */
    @Override
    public boolean deleteGerente(String idEmpleado) {
        Gerente gerenteExistente = verificarGerente(idEmpleado);
        if (gerenteExistente != null) {
            listGerentes.remove(gerenteExistente);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para leer la información del gerente de una empresa
     *
     * @param idEmpleado IdGerente
     * @return
     */
    @Override
    public Gerente readGerente(String idEmpleado) {
        return verificarGerente(idEmpleado);
    }

    /**
     * Método de la interface Crud para obtener la lista de gerentes de una empresa
     * @return
     */
    @Override
    public ArrayList<Gerente> getGerentes() {
        return new ArrayList<>(listGerentes);
    }

    /**
     * Método para añadir un gerente a la lista de gerentes de una empresa
     *
     * @param gerente Gerente añadir
     */
    public void agregarGerente(Gerente gerente) {
        listGerentes.add(gerente);
    }

    /**
     * Método de la interface Crud para crear un Tecnico
     *
     * @param nombre Nombre del tecnico
     * @param idEmpleado IdEmpleado del tecnico
     * @param edad Edad del tecnico
     * @param departamento Departamento del tecnico
     * @param especialidad Especialidad del Tecnico
     * @return
     */
    @Override
    public boolean createTecnico(String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad) {
       Tecnico tecnicoExistente = verificarTecnico(idEmpleado);
        if (tecnicoExistente == null) {
            Tecnico newTecnico = Tecnico.tecnicoBuilder().nombre(nombre).idEmpleado(idEmpleado).edad(edad).departamento(departamento).especialidad(especialidad).build();
            agregarTecnico(newTecnico);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para actualizar la información de un tecnico
     *
     * @param nombre Nombre del tecnico
     * @param idEmpleado IdEmpleado del tecnico
     * @param edad Edad del tecnico
     * @param departamento Departamento del tecnico
     * @param especialidad Especialidad del tecnico
     * @return
     */
    @Override
    public boolean updateTecnico(String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad) {
        Tecnico tecnicoExistente = null;
        if (tecnicoExistente != null) {
            tecnicoExistente.setNombre(nombre);
            tecnicoExistente.setIdEmpleado(idEmpleado);
            tecnicoExistente.setEdad(edad);
            tecnicoExistente.setDepartamentoAsociado(departamento);
            tecnicoExistente.setEspecialidad(especialidad);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para eliminar la informacion de un tecnico
     *
     * @param idEmpleado IdEmpleado del tecnico a eliminar
     * @return
     */
    @Override
    public boolean deleteTecnico(String idEmpleado) {
        Tecnico tecnicoExistente = verificarTecnico(idEmpleado);
        if (tecnicoExistente != null) {
            listTecnicos.remove(tecnicoExistente);
            return true;
        }
        return false;
    }

    /**
     * Método de la interface Crud para leer la informacion de una tecnico
     *
     * @param idEmpleado IdEmpleado para obtener su informacion
     * @return
     */
    @Override
    public Tecnico readTecnico(String idEmpleado) {
        return verificarTecnico(idEmpleado);
    }

    /**
     * Método para obtener la lista de tecnicos de la empresa
     *
     * @return Lista de tecnicos
     */
    @Override
    public ArrayList<Tecnico> getTecnicos() {
        return new ArrayList<>(listTecnicos);
    }

    /**
     * Método para añadir un tecnico a la lista de tecnicos de la empresa
     *
     * @param tecnico Tecnico a añadir
     */
    public void agregarTecnico(Tecnico tecnico) {
        listTecnicos.add(tecnico);
    }

    public boolean createPresupuesto (String idPresupuesto, double valor, String estado, String descripcion){
        Presupuesto presupuestoExistente = verificarPresupuesto(idPresupuesto);
        if(presupuestoExistente == null){
            Presupuesto newPresupuesto = Presupuesto.presupuestoBuilder().idPresupuesto(idPresupuesto).valor(valor).estado(estado).descripcion(descripcion).build();
            agregarPresupuesto(newPresupuesto);
            return true;
        }
        return false;
    }

    public Presupuesto readPresupuesto(String idPresupuesto){
        return verificarPresupuesto(idPresupuesto);
    }

    public boolean updatePresupuesto(String idPresupuesto, double valor, String estado, String descripcion){
        Presupuesto presupuestoExistente = null;
        if(presupuestoExistente != null){
            presupuestoExistente.setIdPresupuesto(idPresupuesto);
            presupuestoExistente.setValor(valor);
            presupuestoExistente.setEstado(estado);
            presupuestoExistente.setDescripcion(descripcion);
            return true;
        }
        return false;
    }

    public boolean deletePresupuesto(String idPresupuesto){
        Presupuesto presupuestoExistente = verificarPresupuesto(idPresupuesto);
        if(presupuestoExistente != null){
            listPresupuestos.remove(presupuestoExistente);
            return true;
        }
        return false;
    }

    public ArrayList<Presupuesto> getPresupuestos(){
        return  new ArrayList<>(listPresupuestos);
    }

    public void agregarPresupuesto(Presupuesto presupuesto){
        listPresupuestos.add(presupuesto);
    }

    /**
     * Método para verificar la existencia de un departamento en la empresa
     *
     * @param codigo Código del departamento a verificar
     * @return Departamento existente
     */
    private Departamento verificarDepartamento(String codigo) {
        Departamento departamentoExistente = null;
        for (Departamento departamento : listDepartamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                departamentoExistente = departamento;
                break;
            }
        }
        return departamentoExistente;
    }

    /**
     * Método para verificar la existencia de un proyecto en la empresa
     *
     * @param codigo Código de verificacion
     * @return
     */
    private Proyecto verificarproyecto(String codigo) {
       Proyecto proyectoExistente = null;
        for (Proyecto proyecto : listProyectos) {
            if (proyecto.getCodigo().equals(codigo)) {
                proyectoExistente = proyecto;
                break;
            }
        }
        return proyectoExistente;
    }

    /**
     * Método para verificar la existencia de un gerente en la empresa
     *
     * @param idEmpleado IdEmpleado a verificar
     * @return
     */
    private Gerente verificarGerente(String idEmpleado) {
        Gerente gerenteExistente = null;
        for (Gerente gerente : listGerentes) {
            if (gerente.getIdEmpleado().equals(idEmpleado)) {
            gerenteExistente = gerente;
            break;
            }
        }
        return gerenteExistente;
    }

    /**
     * Método para verificar la existencia de un tecnico en la empresa
     *
     * @param idEmpleado IdEmpleado a verificar
     * @return
     */
    private Tecnico verificarTecnico(String idEmpleado) {
        Tecnico tecnicoExistente = null;
        for (Tecnico tecnico : listTecnicos) {
            if (tecnico != null) {
                if (tecnico.getIdEmpleado().equals(idEmpleado)  ) {

                    tecnicoExistente = tecnico;
                    break;
                }
            }
        }
        return tecnicoExistente;
    }

    private Presupuesto verificarPresupuesto (String idPresupuesto){
        Presupuesto presupuestoExistente = null;

        for(Presupuesto presupuesto : listPresupuestos){
            if(presupuesto != null){
                if(presupuesto.getIdPresupuesto().equals(idPresupuesto)){
                    presupuestoExistente = presupuesto;
                    break;
                }
            }
        }
        return presupuestoExistente;
    }
}

