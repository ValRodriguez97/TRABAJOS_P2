package co.edu.uniquindio.marketplace.preparciali.model.builder;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;
import co.edu.uniquindio.marketplace.preparciali.model.Persona;

public class ClienteBuilder extends PersonaBuilder<ClienteBuilder> {

    @Override
    protected ClienteBuilder self() {
        return this;
    }

    @Override
    public Cliente build() {
        return new Cliente(nombre, apellido, cedula, edad);
    }
}
