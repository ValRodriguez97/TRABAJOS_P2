package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;

public class ModelFactory {
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

       empresa.agregarEmpleados(gerente1);
       empresa.agregarEmpleados(gerente2);
       empresa.agregarEmpleados(gerente3);
       empresa.agregarEmpleados(gerente4);
       empresa.agregarEmpleados(tecnico1);
       empresa.agregarEmpleados(tecnico2);
       empresa.agregarEmpleados(tecnico3);
       empresa.agregarEmpleados(tecnico4);

       departamento1.agregarEmpleado(tecnico2);
       departamento4.agregarEmpleado(gerente3);

       proyecto3.asignarEmpleado(tecnico2);
       proyecto3.asignarGerente(gerente4);


    }

}
