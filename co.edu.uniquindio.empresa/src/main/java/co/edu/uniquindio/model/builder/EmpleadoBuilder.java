package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;

/**
 * Builder para crear instancias de la clase Empleado
 *
 * @param <T> Tipo de builder
 */
public class EmpleadoBuilder<T extends EmpleadoBuilder<T>> {
    protected String nombre;
    protected String idEmpleado;
    protected int edad;
    protected Departamento departamento;

    /**
     * Método para establecer el nombre del empleado
     *
     * @param nombre Nombre del empleado
     * @return Instancia actual
     */
    public T nombre(String nombre) {
        this.nombre = nombre;
        return self();
    }

    /**
     * Método para establecer el ID del empleado
     *
     * @param idEmpleado ID del empleado
     * @return Instancia actual
     */
    public T idEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
        return self();
    }

    /**
     * Método para establecer la edad del empleado
     *
     * @param edad Edad del empleado
     * @return
     */
    public T edad(int edad) {
        this.edad = edad;
        return self();
    }

    /**
     * Método para establecer el departamento del empleado
     *
     * @param departamento Departamento del empleado
     * @return Instancia actual
     */
    public T departamento(Departamento departamento) {
        this.departamento = departamento;
        return self();
    }

    /**
     * Método portegido para retomar la instancia del builder necesario para el encadenamiento de métodos
     *
     * @return Instancia actual
     */
    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    /**
     * Método para crerar una nueva instancia de Empleado
     * @return
     */
    public Empleado build() {
        return new Empleado(nombre, idEmpleado, edad, departamento) {
            @Override
            public void contribuir() {
            }
        };
    }
}