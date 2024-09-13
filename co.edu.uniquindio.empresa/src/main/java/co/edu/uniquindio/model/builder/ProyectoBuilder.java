package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Proyecto;

/**
 * Builder para crear instancias de la clase Proyecto
 */
public class ProyectoBuilder {
    private String nombre;
    private String codigo;

    /**
     * Método para establecer el nombre del proyecto
     *
     * @param nombre Nombre del proyecto
     * @return Instancia actual
     */
    public ProyectoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    /**
     * Método para establecer el codigo del proyecto
     *
     * @param codigo Codigo del proyecto
     * @return Instancia actual
     */
    public ProyectoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Método para crear la nueva instancia de gerente
     *
     * @return Objeto gerente
     */
    public Proyecto build() {
        return new Proyecto(nombre, codigo);
    }
}

