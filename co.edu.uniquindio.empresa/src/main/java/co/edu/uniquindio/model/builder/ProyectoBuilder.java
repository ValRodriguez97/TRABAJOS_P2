package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Proyecto;

public class ProyectoBuilder {
    private String nombre;
    private String codigo;

    public String nombre() {
        return nombre;
    }

    public String codigo() {
        return codigo;
    }

    public ProyectoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProyectoBuilder setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Proyecto build() {
        return new Proyecto(this);
    }
}

