package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Gerente;

/**
 * Builder para crear instancias de la clase Gerente
 * Implementación del builder para el objeto Gerente
 */
public class GerenteBuilder extends EmpleadoBuilder {

    /**
     * Método para establecer el nombre del gerente
     *
     * @param nombre Nombre del gerente
     * @return Instancia del gerente
     */
    public GerenteBuilder nombre(String nombre) {
        super.self();
        return this;
    }

    /**
     * Método para establecer el ID del gerente
     *
     * @param idEmpleado ID del gerente
     * @return Instancia actual
     */
    public GerenteBuilder idEmpleado(String idEmpleado) {
        super.self();
        return this;
    }

    /**
     * Método para establecer la edad del gerente
     *
     * @param edad Edad del gerente
     * @return Instancia actual
     */
    public GerenteBuilder edad(int edad) {
        super.self();
        return this;
    }

    /**
     * Método para establecer el departamento del gerente
     *
     * @param departamento Departamento del gerente
     * @return
     */
    public GerenteBuilder departamento(Departamento departamento) {
        super.self();
        return this;
    }

    /**
     * Método para crear una nueva instancia de Gerente
     * @return
     */
    public Gerente build() {
        return new Gerente(self().nombre, self().idEmpleado, self().edad, self().departamento);
    }
}
