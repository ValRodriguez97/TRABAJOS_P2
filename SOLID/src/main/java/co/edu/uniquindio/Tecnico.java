package co.edu.uniquindio;

/**
 * Clase Técnico hereda los atributos de la clase Empleado e implementa el método de la interface Contribuyente
 */
public class Tecnico extends Empleado implements Contribuyente {
    private String especialidad;

    public Tecnico(String nombre, String idEmpleado, int edad, String especialidad, Departamento departamento) {
        super(nombre, idEmpleado, edad, departamento);
        this.especialidad = especialidad;
        assert especialidad != null && !especialidad.isEmpty();
    }

    /**
     * Implementación del método de la interface Contribuyente
     */
    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está trabajando en tareas técnicas.");
    }

    /**
     * Método que devuelte la representación en cadena de la clase Tecnico
     *
     * @return representación en cadena de la clase Tecnico
     */
    @Override
    public String toString() {
        return "Tecnico \n"
                + "Nombre: " + getNombre() + "\n"
                + "IdEmpleado: " + getIdEmpleado() + "\n"
                + "Especialidad: " + especialidad + "\n";
    }
}