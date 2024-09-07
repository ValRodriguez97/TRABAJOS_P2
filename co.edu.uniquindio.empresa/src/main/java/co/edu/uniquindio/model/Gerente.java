package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.model.builder.GerenteBuilder;
import co.edu.uniquindio.services.IContribuyente;

/**
 * Clase Gerente que se encarga de gestionar los proyectos y equipos de empleados de la empresa
 */
public class Gerente extends Empleado implements IContribuyente {

    /**
     * Método Constructor de la clase Gerente
     *
     * @param empleadoBuilder
     */
    public Gerente(EmpleadoBuilder empleadoBuilder) {
        super(empleadoBuilder);
    }

    /**
     * Implementación del método de la interface Contribuyente
     */
    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está gestionando el proyecto.");
    }

    public static GerenteBuilder gerenteBuilder(){
        return new GerenteBuilder();
    }
    /**
     * Método que devuelve la representación en cadena de la clase Gerente
     *
     * @return representación en cadena de la clase Gerente
     */
    @Override
    public String toString (){
        return "Gerente \n" + super.toString();
    }
}