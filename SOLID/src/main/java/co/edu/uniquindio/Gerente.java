package co.edu.uniquindio;

/**
 * Clase Gerente que se encarga de gestionar los proyectos y equipos de empleados de la empresa
 */
public class Gerente extends Empleado implements Contribuyente {

    /**
     * Método Constructor de la clase Gerente
     *
     * @param nombre del gerente
     * @param idEmpleado del gerente
     * @param departamento del gerente
     */
    public Gerente(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
    }

    /**
     * Implementación del método de la interface Contribuyente
     */
    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está gestionando el proyecto.");
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