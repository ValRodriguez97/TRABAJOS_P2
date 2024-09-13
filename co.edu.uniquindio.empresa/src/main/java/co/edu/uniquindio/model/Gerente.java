package co.edu.uniquindio.model;

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
     * @param nombre Nombre del gerente
     * @param idEmpleado IdEmpleado del gerente
     * @param edad Edad del gerente
     * @param departamentoAsociado Departamento asociado del gerente
     */
    public Gerente(String nombre, String idEmpleado, int edad, Departamento departamentoAsociado) {
        super(nombre, idEmpleado, edad, departamentoAsociado);
    }

    /**
     * crear una instancia del constructor del gerente(Aplicaion del builder)
     *
     * @return GerenteBuilder
     */
    public static GerenteBuilder gerenteBuilder() {
        return new GerenteBuilder();
    }

    /**
     * Implementación del método de la interface Contribuyente
     */
    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está gestionando el proyecto.");
    }

    /**
     * Implementacion del patron creacional prototype del gerente(Metodo para clonar)
     *
     * @return gerente
     */
    @Override
    public IPrototypeGerente clone() {
        Gerente gerente = null;
        try {
            gerente = (Gerente) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return gerente;
    }

    /**
     * Metodo toString para obtener el objeto como una cadena
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Gerente \n" + super.toString();
    }
}