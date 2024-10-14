package co.edu.uniquindio.marketplace.preparciali.model.builder;

import co.edu.uniquindio.marketplace.preparciali.model.Empleado;

public class EmpleadoBuilder extends PersonaBuilder<EmpleadoBuilder> {
    private String nombre;
    private String apellido;
    private String cedula;
    private String edad;

    @Override
    protected EmpleadoBuilder self() {
        return this;
    }

    @Override
    public Empleado build() {
        return new Empleado(nombre, apellido, cedula, edad);
    }
}
