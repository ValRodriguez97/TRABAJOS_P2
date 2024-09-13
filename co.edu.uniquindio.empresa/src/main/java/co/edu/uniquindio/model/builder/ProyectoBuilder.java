package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Proyecto;

/**
 * Builder para crear instancias de la clase Proyecto
 */
public class ProyectoBuilder {
    private String nombre;
    private String codigo;

    public ProyectoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProyectoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Proyecto build() {
        return new Proyecto(nombre, codigo);
    }
}

