package co.edu.uniquindio;

import co.edu.uniquindio.factory.ModelFactory;
import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Gerente;
import co.edu.uniquindio.model.Proyecto;
import co.edu.uniquindio.model.Tecnico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEmpresa {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();

        System.out.println("Departamentos:  \n" );
        for(Departamento departamento : modelFactory.getDepartamentos()){
            System.out.println("Nombre: " +  departamento.getNombre() + "  Código: " + departamento.getCodigo());
        }

        System.out.println("Proyectos:  \n" );
        for(Proyecto proyecto : modelFactory.getProyectos()){
            System.out.println("Nombre: " +  proyecto.getNombre() + "  Codigo: " + proyecto.getCodigo());
        }

        System.out.println("Gerentes:  \n" );
        for(Gerente gerente : modelFactory.getGerentes()){
            System.out.println("Nombre: " + gerente.getNombre() + "  idEmpleado:  " + gerente.getIdEmpleado() + " Edad: " + gerente.getEdad() + " Departamento: " + gerente.getDepartamentoAsociado() );
        }

        System.out.println("Tecnicos:  \n" );
        for(Tecnico tecnico : modelFactory.getTecnicos()){
            System.out.println("Nombre: " + tecnico.getNombre()+ "  idEmpleado:  " + tecnico.getIdEmpleado() + " Edad: " + tecnico.getEdad() + " Departamento: " + tecnico.getDepartamentoAsociado() + " Especialidad " + tecnico.getEspecialidad());
        }
    }
}