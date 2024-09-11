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

    public Tecnico(String nombre, String idEmpleado, int edad, Departamento departamentoAsociador, String especialidad) {
        super(nombre, idEmpleado, edad, departamentoAsociador);
        this.especialidad = especialidad;
        assert especialidad != null;
    }

    /**
     * Implementación del método de la interface Contribuyente
     */
    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está trabajando en tareas técnicas.");
    }

    public static TecnicoBuilder tecnicoBuilder (){
        return new TecnicoBuilder();
    }

    @Override
    public IPrototypeTecnico clone(){
        Tecnico tecnico = null;
        try{
            tecnico = (Tecnico)  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tecnico;
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