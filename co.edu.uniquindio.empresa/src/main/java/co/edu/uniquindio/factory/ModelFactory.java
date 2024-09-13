package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.*;

import java.util.ArrayList;

public class ModelFactory implements ICrudDepartamento, ICrudProyecto, ICrudGerente, ICrudTecnico, ICrudPresupuesto {
    private static ModelFactory instance;
    private static Empresa empresa;

    public ModelFactory() {
        inicializarDatos();
    }

    /**
     * Aplicación del patron singleton en la clase Modelfactory
     *
     * @return Unica instancia
     */
    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    @Override
    public boolean createDepartamento(String nombre, String codigo) {
        return empresa.createDepartamento(nombre, codigo);
    }

    @Override
    public Departamento readDepartamento(String codigo) {
        return empresa.readDepartamento(codigo);
    }

    @Override
    public boolean updateDepartamento(String nombre, String codigo) {
        return empresa.updateDepartamento(nombre, codigo);
    }

    @Override
    public boolean deleteDepartamento(String codigo) {
        return empresa.deleteDepartamento(codigo);
    }

    @Override
    public ArrayList<Departamento> getDepartamentos() {
        return empresa.getDepartamentos();
    }

    @Override
    public boolean createProyecto(String nombre, String codigo) {
        return empresa.createProyecto(nombre, codigo);
    }

    @Override
    public Proyecto readProyecto(String codigo) {
        return empresa.readProyecto(codigo);
    }

    @Override
    public boolean updateProyecto(String nombre, String codigo) {
        return empresa.updateProyecto(nombre, codigo);
    }

    @Override
    public boolean deleteProyecto(String codigo) {
        return empresa.deleteProyecto(codigo);
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return empresa.getProyectos();
    }

    @Override
    public boolean createGerente(String nombre, String idEmpleado, int edad, Departamento departamento) {
        return empresa.createGerente(nombre, idEmpleado, edad, departamento);
    }

    @Override
    public Gerente readGerente(String codigo) {
        return empresa.readGerente(codigo);
    }

    @Override
    public boolean updateGerente(String nombre, String idEmpleado, int edad, Departamento departamento) {
        return empresa.updateGerente(nombre, idEmpleado, edad, departamento);
    }

    @Override
    public boolean deleteGerente(String codigo) {
        return empresa.deleteGerente(codigo);
    }

    @Override
    public ArrayList<Gerente> getGerentes() {
        return empresa.getGerentes();
    }

    @Override
    public boolean createTecnico(String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad) {
        return empresa.createTecnico(nombre, idEmpleado, edad, departamento, especialidad);
    }

    @Override
    public Tecnico readTecnico(String codigo) {
        return empresa.readTecnico(codigo);
    }

    @Override
    public boolean updateTecnico(String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad) {
        return empresa.updateTecnico(nombre, idEmpleado, edad, departamento, especialidad);
    }

    @Override
    public boolean deleteTecnico(String codigo) {
        return empresa.deleteTecnico(codigo);
    }

    @Override
    public ArrayList<Tecnico> getTecnicos() {
        return empresa.getTecnicos();
    }

    @Override
    public boolean createPresupuesto(String idPresupuesto, double valor, String estado, String descripcion){
        return empresa.createPresupuesto(idPresupuesto, valor, estado, descripcion);
    }

    @Override
    public Presupuesto readPresupuesto(String idPresupuesto){
        return empresa.readPresupuesto(idPresupuesto);
    }

    @Override
    public boolean updatePresupuesto(String idPresupuesto, double valor, String estado, String descripcion){
        return empresa.updatePresupuesto(idPresupuesto, valor, estado, descripcion);
    }

    @Override
    public boolean deletePresupuesto(String idPresupuesto){
        return empresa.deletePresupuesto(idPresupuesto);
    }

    @Override
    public ArrayList<Presupuesto> getPresupuestos(){
        return empresa.getPresupuestos();
    }

    private static void inicializarDatos() {
        empresa = new Empresa();

        //Departamentos
        Departamento departamento1 = Departamento.departamentoBuilder()
                .nombre("Mudanzas").
                codigo("123").build();
        Departamento departamento2 = Departamento.departamentoBuilder().
                nombre("Comercio").
                codigo("7346").build();
        Departamento departamento3 = Departamento.departamentoBuilder().
                nombre("Tecnologia").
                codigo("7381").build();
        Departamento departamento4 = Departamento.departamentoBuilder().
                nombre("Recursos Humanos").
                codigo("8461").build();

        //Proyectos
        Proyecto proyecto1 = Proyecto.proyectobuilder().
                nombre("Nuevo plan de negocios").
                codigo("17361").build();
        Proyecto proyecto2 = Proyecto.proyectobuilder().
                nombre("Flores").
                codigo("94hd1").build();
        Proyecto proyecto3 = Proyecto.proyectobuilder().
                nombre("Hojas").
                codigo("nco1").build();
        Proyecto proyecto4 = Proyecto.proyectobuilder().
                nombre("Billares").
                codigo("jdo21").build();

        //Empleados - Gerentes
        Gerente gerente1 = Gerente.gerenteBuilder().
                nombre("Fernando").
                idEmpleado("123").
                edad(34).build();
        Gerente gerente2 = Gerente.gerenteBuilder().
                nombre("Luisa").
                idEmpleado("1234").
                edad(22).build();
        Gerente gerente3 = Gerente.gerenteBuilder().
                nombre("Ana").
                idEmpleado("12345").
                edad(65).build();
        Gerente gerente4 = Gerente.gerenteBuilder().
                nombre("Oscar").
                idEmpleado("123456").
                edad(34).build();


        //Empleados - Tecnicos
        Tecnico tecnico1 = Tecnico.tecnicoBuilder().
                nombre("Julian").
                idEmpleado("1").
                edad(43).
                especialidad("Office").build();
        Tecnico tecnico2 = Tecnico.tecnicoBuilder().
                nombre("Sofia").
                idEmpleado("2").
                edad(45).
                especialidad("Idiomas").build();
        Tecnico tecnico3 = Tecnico.tecnicoBuilder().
                nombre("Rosa").
                idEmpleado("3").
                edad(53).
                especialidad("Finanzas").build();
        Tecnico tecnico4 = Tecnico.tecnicoBuilder().
                nombre("Juan").
                idEmpleado("4").
                edad(65).
                especialidad("Porgramacion").build();

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

        departamento1.agregarEmpleado(tecnico4);
        departamento2.agregarEmpleado(tecnico3);
        departamento3.agregarEmpleado(tecnico2);
        departamento4.agregarEmpleado(tecnico1);
        departamento1.agregarEmpleado(gerente1);
        departamento2.agregarEmpleado(gerente2);
        departamento3.agregarEmpleado(gerente3);
        departamento4.agregarEmpleado(gerente4);

        proyecto1.asignarTecnico(tecnico4);
        proyecto2.asignarTecnico(tecnico3);
        proyecto3.asignarTecnico(tecnico2);
        proyecto4.asignarTecnico(tecnico1);

        proyecto1.asignarGerente(gerente3);
        proyecto2.asignarGerente(gerente2);//jajaja ya lo miro
        proyecto3.asignarGerente(gerente1);
        proyecto4.asignarGerente(gerente4);
    }

}
