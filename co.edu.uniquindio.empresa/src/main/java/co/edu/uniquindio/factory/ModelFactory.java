package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.*;

import java.util.ArrayList;

public class ModelFactory implements ICrudDepartamento, ICrudProyecto, ICrudGerente, ICrudTecnico {
    private static ModelFactory instance;
    private static Empresa empresa;

    public ModelFactory() {
        inicializarDatos();
    }

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
                nombre("").
                codigo("").build();
        Proyecto proyecto3 = Proyecto.proyectobuilder().
                nombre("").
                codigo("").build();
        Proyecto proyecto4 = Proyecto.proyectobuilder().
                nombre("").
                codigo("").build();

        //Empleados - Gerentes
        Gerente gerente1 = Gerente.gerenteBuilder().
                nombre("").
                idEmpleado("").
                edad(34).build();
        Gerente gerente2 = Gerente.gerenteBuilder().
                nombre("").
                idEmpleado("").
                edad(22).build();
        Gerente gerente3 = Gerente.gerenteBuilder().
                nombre("").
                idEmpleado("").
                edad(65).build();
        Gerente gerente4 = Gerente.gerenteBuilder().
                nombre("").
                idEmpleado("").
                edad(34).build();


        //Empleados - Tecnicos
        Tecnico tecnico1 = Tecnico.tecnicoBuilder().
                nombre("").
                idEmpleado("").
                edad(43).
                especialidad("Office").build();
        Tecnico tecnico2 = Tecnico.tecnicoBuilder().
                nombre("").
                idEmpleado("").
                edad(45).
                especialidad("").build();
        Tecnico tecnico3 = Tecnico.tecnicoBuilder().
                nombre("").
                idEmpleado("").
                edad(53).
                especialidad("").build();
        Tecnico tecnico4 = Tecnico.tecnicoBuilder().
                nombre("").
                idEmpleado("").
                edad(65).
                especialidad("").build();

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

        proyecto3.asignarTecnico(tecnico2);
        proyecto3.asignarGerente(gerente4);

    }

}
