package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.model.builder.GerenteBuilder;
import co.edu.uniquindio.services.IContribuyente;
import co.edu.uniquindio.services.IPrototypeGerente;

/**
 * Clase Gerente que se encarga de gestionar los proyectos y equipos de empleados de la empresa
 */
public class Gerente extends Empleado implements IContribuyente, IPrototypeGerente {

    /**
     * Método Constructor de la clase Gerente
     *
     * @param nombre
     * @param idEmpleado
     * @param edad
     * @param departamentoAsociado
     */
    public Gerente(String nombre, String idEmpleado, int edad, Departamento departamentoAsociado) {
        super(nombre, idEmpleado, edad, departamentoAsociado);
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

    @Override
    public IPrototypeGerente clone (){
        Gerente gerente = null;
        try{
            gerente = (Gerente) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return gerente;
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