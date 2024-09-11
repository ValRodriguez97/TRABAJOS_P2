package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.*;

import java.util.ArrayList;

public class ModelFactory implements ICrudDepartamento, ICrudProyecto, ICrudGerente, ICrudTecnico{
    private static ModelFactory instance;
    private static Empresa empresa;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    @Override
    public boolean createDepartamento(Departamento departamento){
        return empresa.createDepartamento(departamento);
    }

    @Override
    public Departamento readDepartamento(String codigo){
        return empresa.readDepartamento(codigo);
    }

    @Override
    public boolean updateDepartamento (Departamento departamento){
        return empresa.updateDepartamento(departamento);
    }

    @Override
    public boolean deleteDepartamento(String codigo){
        return empresa.deleteDepartamento(codigo);
    }

    @Override
    public ArrayList<Departamento> getDepartamentos(){
        return empresa.getDepartamentos();
    }

    @Override
    public boolean createProyecto(Proyecto proyecto){
        return empresa.createProyecto(proyecto);
    }

    @Override
    public Proyecto readProyecto(String codigo){
        return empresa.readProyecto(codigo);
    }

    @Override
    public boolean updateProyecto(Proyecto proyecto){
        return empresa.updateProyecto(proyecto);
    }

    @Override
    public boolean deleteProyecto(String codigo) {
        return empresa.deleteProyecto(codigo);
    }

    @Override
    public ArrayList<Proyecto> getProyectos(){
        return empresa.getProyectos();
    }
    @Override
    public boolean createGerente(Gerente gerente){
        return empresa.createGerente(gerente);
    }

    @Override
    public Gerente readGerente(String codigo){
        return empresa.readGerente(codigo);
    }

    @Override
    public boolean updateGerente(Gerente gerente){
        return empresa.updateGerente(gerente);
    }

    @Override
    public boolean deleteGerente(String codigo){
        return empresa.deleteGerente(codigo);
    }

    @Override
    public ArrayList<Gerente> getGerentes() {
        return empresa.getGerentes();
    }

    @Override
    public boolean createTecnico(Tecnico tecnico){
        return empresa.createTecnico(tecnico);
    }

    @Override
    public Tecnico readTecnico(String codigo){
        return empresa.readTecnico(codigo);
    }

    @Override
    public boolean updateTecnico(Tecnico tecnico){
        return empresa.updateTecnico(tecnico);
    }

    @Override
    public boolean deleteTecnico(String codigo){
        return empresa.deleteTecnico(codigo);
    }

    @Override
    public ArrayList<Tecnico> getTecnicos() {
        return empresa.getTecnicos();
    }

    private static void inicializarDatos() {
        empresa = new Empresa();

        //Departamentos
        Departamento departamento1 = Departamento.departamentoBuilder().
                setNombre("Mudanzas").
                setCodigo("123").build();
        Departamento departamento2 = Departamento.departamentoBuilder().
                setNombre("Comercio").
                setCodigo("7346").build();
        Departamento departamento3 = Departamento.departamentoBuilder().
                setNombre("Tecnologia").
                setCodigo("7381").build();
        Departamento departamento4 = Departamento.departamentoBuilder().
                setNombre("Recursos Humanos").
                setCodigo("8461").build();

        //Proyectos
        Proyecto proyecto1 = Proyecto.proyectobuilder().
                setNombre("Nuevo plan de negocios").
                setCodigo("17361").build();
        Proyecto proyecto2 = Proyecto.proyectobuilder().
                setNombre("").
                setCodigo("").build();
        Proyecto proyecto3 = Proyecto.proyectobuilder().
                setNombre("").
                setCodigo("").build();
        Proyecto proyecto4 = Proyecto.proyectobuilder().
                setNombre("").
                setCodigo("").build();

        //Empleados - Gerentes
        Gerente gerente1 = Gerente.gerenteBuilder().
                setNombre("").
                setIdEmpleado("").
                setEdad(34).build();
        Gerente gerente2 = Gerente.gerenteBuilder().
                setNombre("").
                setIdEmpleado("").
                setEdad(22).build();
        Gerente gerente3 = Gerente.gerenteBuilder().
                setNombre("").
                setIdEmpleado("").
                setEdad(65).build();
        Gerente gerente4 = Gerente.gerenteBuilder().
                setNombre("").
                setIdEmpleado("").
                setEdad(34).build();


        //Empleados - Tecnicos
       Tecnico tecnico1 = Tecnico.tecnicoBuilder().
               setNombre("").
               setIdEmpleado("").
               setEdad(43).
               setEspecialidad("Office").build();
       Tecnico tecnico2 = Tecnico.tecnicoBuilder().
               setNombre("").
               setIdEmpleado("").
               setEdad(45).
               setEspecialidad("").build();
       Tecnico tecnico3 = Tecnico.tecnicoBuilder().
               setNombre("").
               setIdEmpleado("").
               setEdad(53).
               setEspecialidad("").build();
       Tecnico tecnico4 = Tecnico.tecnicoBuilder().
               setNombre("").
               setIdEmpleado("").
               setEdad(65).
               setEspecialidad("").build();

       empresa.agregarDepartamentos(departamento1);
       empresa.agregarDepartamentos(departamento2);
       empresa.agregarDepartamentos(departamento3);
       empresa.agregarDepartamentos(departamento4);

       empresa.agregarProyectos(proyecto1);
       empresa.agregarProyectos(proyecto2);
       empresa.agregarProyectos(proyecto3);
       empresa.agregarProyectos(proyecto4);

       empresa.agregarGerente(gerente1);
       empresa.agregarGerente(gerente2);
       empresa.agregarGerente(gerente3);
       empresa.agregarGerente(gerente4);
       empresa.agregarTecnico(tecnico1);
       empresa.agregarTecnico(tecnico2);
       empresa.agregarTecnico(tecnico3);
       empresa.agregarTecnico(tecnico4);

       departamento1.agregarEmpleado(tecnico2);
       departamento4.agregarEmpleado(gerente3);

       proyecto3.asignarEmpleado(tecnico2);
       proyecto3.asignarGerente(gerente4);

    }

}
