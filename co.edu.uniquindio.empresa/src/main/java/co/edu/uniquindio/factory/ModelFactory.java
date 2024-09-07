package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empresa;
import co.edu.uniquindio.model.Gerente;
import co.edu.uniquindio.model.Proyecto;

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
                nombre("Mudanzas").
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
        //Empleados - Gerentes
        Gerente gerente1 = (Gerente) Gerente.empleadobuilder().setDepartamento(departamento1).build();
        //Empleados - Tecnicos


    }
}
