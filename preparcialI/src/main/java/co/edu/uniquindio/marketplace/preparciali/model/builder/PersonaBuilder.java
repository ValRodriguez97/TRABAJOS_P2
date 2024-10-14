package co.edu.uniquindio.marketplace.preparciali.model.builder;

import co.edu.uniquindio.marketplace.preparciali.model.Persona;

public abstract class PersonaBuilder<T extends PersonaBuilder<T>> {
    protected String nombre;
    protected String apellido;
    protected String  cedula;
    protected String edad;

    public T nombre (String nombre){
        this.nombre = nombre;
        return self();
    }

    public T apellido (String apellido){
        this.apellido = apellido;
        return self();
    }

    public T cedula (String cedula){
        this.cedula = cedula;
        return self();
    }

    public T edad (String edad){
        this.edad = edad;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public abstract Persona build();
}
