package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.model.builder.TecnicoBuilder;
import co.edu.uniquindio.services.IContribuyente;
import co.edu.uniquindio.services.IPrototypeTecnico;

/**
 * Clase Técnico hereda los atributos de la clase Empleado e implementa el método de la interface Contribuyente
 */
public class Tecnico extends Empleado implements IContribuyente, IPrototypeTecnico {
    private EmpleadoBuilder empleadoBuilder;
    private String especialidad;

    /**
     * Constructor de la clase Tecnico
     * @param nombre Nombre del tecnico
     * @param idEmpleado IdEmpleado del tecnico
     * @param edad Edad del tecnico
     * @param departamentoAsociador Departamento asociado al tecnico
     * @param especialidad Especialidad del tecnico
     */
    public Tecnico(String nombre, String idEmpleado, int edad, Departamento departamentoAsociador, String especialidad) {
        super(nombre, idEmpleado, edad, departamentoAsociador);
        this.especialidad = especialidad;
    }

    /**
     * Crear una instancia del constructor del tecnico(Aplicacion del builder)
     * @return TecnicoBuilder
     */
    public static TecnicoBuilder tecnicoBuilder() {
        return new TecnicoBuilder();
    }

    /**
     * Implementacion del metodo contribuir
     */
    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está trabajando en tareas técnicas.");
    }

    /**
     * Metodo para clonar un tecnico(Implementacion del prototype)
     *
     * @return Copia del objeto tecnico
     */
    @Override
    public IPrototypeTecnico clone() {
        Tecnico tecnico = null;
        try {
            tecnico = (Tecnico) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tecnico;
    }

    /**
     * Metodo para obtener la especialida del tecnico
     *
     * @return especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Metodo para modificar la especialidad del tecnico
     *
     * @param especialidad Especialidad del tecnico
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Metodo toString para obtener el objeto como una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "Tecnico \n" + "Nombre: " + getNombre() + "\n" + "IdEmpleado: " + getIdEmpleado() + "\n" + "Especialidad: " + especialidad + "\n";
    }
}