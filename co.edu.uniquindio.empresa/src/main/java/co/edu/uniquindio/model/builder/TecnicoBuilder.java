package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Tecnico;

/**
 * Builder para crear instancias de la clase Tecnico
 */
public class TecnicoBuilder extends EmpleadoBuilder {
    private String especialidad;

    /**
     * Método para establecer el nombre del tecnico
     *
     * @param nombre Nombre del tecnico
     * @return Instancia actual
     */
    public TecnicoBuilder nombre(String nombre) {
        super.self();
        return this;
    }

    /**
     * Método para establecer el ID del tecnico
     * @param idEmpleado ID del tecnico
     * @return Instancia actual
     */
    public TecnicoBuilder idEmpleado(String idEmpleado) {
        super.self();
        return this;
    }

    /**
     * Método para establecer la edad del tecnico
     *
     * @param edad Edad del tecnico
     * @return Instancia actual
     */
    public TecnicoBuilder edad(int edad) {
        super.self();
        return this;
    }

    /**
     * Método para establecer el departamento de un tecnico
     *
     * @param departamento Departamento del tecnico
     * @return Instancia actual
     */
    public TecnicoBuilder departamento (Departamento departamento) {
        super.self();
        return this;
    }

    /**
     * Método para establecer la especialidad de un tecnico
     *
     * @param especialidad Especialidad de un tecnico
     * @return Instancia actual
     */
    public TecnicoBuilder especialidad(String especialidad) {
        this.especialidad = especialidad;
        return this;
    }

    /**
     * Método para creara una nueva instancia de Tecnico
     * @return
     */
    public Tecnico build() {
        return new Tecnico(self().nombre, self().idEmpleado, self().edad, self().departamento, especialidad);
    }
}
