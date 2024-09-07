package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Gerente;

public class GerenteBuilder {
    private EmpleadoBuilder empleadoBuilder;

    public GerenteBuilder() {
        this.empleadoBuilder = new EmpleadoBuilder();
    }

    public EmpleadoBuilder getEmpleadoBuilder() {
        return empleadoBuilder;
    }

    public Gerente build (){
        return  new Gerente(empleadoBuilder);
    }
}
