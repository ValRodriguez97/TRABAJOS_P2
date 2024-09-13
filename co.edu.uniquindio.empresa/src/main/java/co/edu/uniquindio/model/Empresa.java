package co.edu.uniquindio.model;
import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudGerente;
import co.edu.uniquindio.services.ICrudProyecto;
import co.edu.uniquindio.services.ICrudTecnico;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements ICrudDepartamento, ICrudProyecto, ICrudGerente, ICrudTecnico {
    private List<Proyecto> listProyectos;
    private List<Gerente> listGerentes;
    private List<Tecnico> listTecnicos;
    private List<Departamento> listDepartamentos;
    private List<Empleado> listEmpleadosMayores;

    public Empresa() {
        listProyectos = new ArrayList<>();
        listGerentes = new ArrayList<>();
        listTecnicos = new ArrayList<>();
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

    public List<Gerente> getListGerentes() {
        return listGerentes;
    }

    public void setListGerentes(List<Gerente> listGerentes) {
        this.listGerentes = listGerentes;
    }

    public List<Tecnico> getListTecnicos() {
        return listTecnicos;
    }

    public void setListTecnicos(List<Tecnico> listTecnicos) {
        this.listTecnicos = listTecnicos;
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
        Departamento departamentoExistente = verificarDepartamento(codigo);
        if(departamentoExistente == null){
            departamentoExistente.setNombre(nombre);
            departamentoExistente.setCodigo(codigo);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDepartamento(String codigo){
        Departamento departamentoExistente = verificarDepartamento(codigo);
        if(departamentoExistente != null){
            listDepartamentos.remove(departamentoExistente);
            return true;
        }
        return false;
    }

    @Override
    public Departamento readDepartamento(String codigo){
        return verificarDepartamento(codigo);
    }



    @Override
    public ArrayList<Departamento> getDepartamentos() {
        return new ArrayList<>(listDepartamentos);
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
        Proyecto proyectoExistente = verificarproyecto(codigo);
        if(proyectoExistente == null){
            Proyecto newProyecto = Proyecto.proyectobuilder().setNombre(nombre).setCodigo(codigo).build();
            agregarProyectos(newProyecto);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateProyecto(String nombre, String codigo){
        Proyecto proyectoExistente = verificarproyecto(codigo);
        if(proyectoExistente == null){
            proyectoExistente.setNombre(nombre);
            proyectoExistente.setCodigo(codigo);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteProyecto(String codigo){
        Proyecto proyectoExistente = verificarproyecto(codigo);
        if(proyectoExistente == null){
            listProyectos.remove(proyectoExistente);
            return true;
        }
        return false;
    }

    @Override
    public Proyecto readProyecto(String codigo){
        return verificarproyecto(codigo);
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return new ArrayList<>(listProyectos);
    }

    private Proyecto verificarproyecto(String codigo){
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
    public boolean createGerente (String nombre, String idEmpleado, int edad, Departamento departamento){
        Gerente gerenteExistente  = null;
        if(gerenteExistente == null){
            Gerente newGerente = Gerente.gerenteBuilder().setNombre(nombre). setIdEmpleado(idEmpleado). setEdad(edad). setDepartamento(departamento).build();
            agregarGerente(newGerente);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateGerente(String nombre, String idEmpleado, int edad, Departamento departamento){
        Gerente gerenteExistente = null;
        if(gerenteExistente == null){
            gerenteExistente.setNombre(nombre);
            gerenteExistente.setIdEmpleado(idEmpleado);
            gerenteExistente.setEdad(edad);
            gerenteExistente.setDepartamentoAsociado(departamento);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteGerente(String idEmpleado){
        Gerente gerenteExistente = verificarGerente(idEmpleado);
        if(gerenteExistente == null){
            listGerentes.remove(gerenteExistente);
            return true;
        }
        return false;
    }

    @Override
    public Gerente readGerente(String idEmpleado){
        return verificarGerente(idEmpleado);
    }

    @Override
    public ArrayList<Gerente> getGerentes() {
        return new ArrayList<>(listGerentes);
    }

    private Gerente verificarGerente(String idEmpleado){
        Gerente gerenteExistente = null;
        for(Gerente gerente : listGerentes){
            if(gerente.getIdEmpleado().equals(idEmpleado)){

                break;
            }
        }
        return gerenteExistente;
    }

   @Override
    public boolean createTecnico (String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad){
        Tecnico tecnicoExistente = null;
        if(tecnicoExistente == null){
            Tecnico newTecnico = Tecnico.tecnicoBuilder().setNombre(nombre).setIdEmpleado(idEmpleado).setEdad(edad). setDepartamento(departamento).setEspecialidad(especialidad).build();
            agregarTecnico(newTecnico);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateTecnico(String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad){
        Tecnico tecnicoExistente = null;
        if(tecnicoExistente == null){
            tecnicoExistente.setNombre(nombre);
            tecnicoExistente.setIdEmpleado(idEmpleado);
            tecnicoExistente.setEdad(edad);
            tecnicoExistente.setDepartamentoAsociado(departamento);
            tecnicoExistente.setEspecialidad(especialidad);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteTecnico(String idEmpleado){
        Tecnico tecnicoExistente = verificarTecnico(idEmpleado);
        if(tecnicoExistente == null){
            listTecnicos.remove(tecnicoExistente);
            return true;
        }
        return false;
    }

    @Override
    public Tecnico readTecnico(String idEmpleado){
        return verificarTecnico(idEmpleado);
    }

    @Override
    public ArrayList<Tecnico> getTecnicos() {
        return new ArrayList<>(listTecnicos);
    }

    private Tecnico verificarTecnico(String idEmpleado) {
        Tecnico tecnicoExistente = null;
        for (Tecnico tecnico : listTecnicos) {
            if (tecnico.getIdEmpleado().equals(idEmpleado)) {
                tecnicoExistente = tecnico;
                break;
            }
        }
        return tecnicoExistente;
        }


        /**
         * Método para añadir proyectos a la lista de proyectos de una empresa
         *
         * @param proyecto a añadir
         */
        public void agregarProyectos(Proyecto proyecto){
            listProyectos.add(proyecto);
        }

        /**
         * Método para añadir departamentos a la lista de departamentos de una empresa
         *
         * @param departamento a añadir
         */
        public void agregarDepartamentos (Departamento departamento){
            listDepartamentos.add(departamento);
        }
        public void agregarGerente (Gerente gerente) {
            listGerentes.add(gerente);
        }

        public void agregarTecnico(Tecnico tecnico) {
            listTecnicos.add(tecnico);
        }

    }

