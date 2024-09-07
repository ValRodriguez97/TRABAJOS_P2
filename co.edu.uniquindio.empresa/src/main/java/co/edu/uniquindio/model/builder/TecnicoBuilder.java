package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Tecnico;

public class TecnicoBuilder {
    private EmpleadoBuilder empleadoBuilder;
    private String especialidad;

    public TecnicoBuilder() {
        this.empleadoBuilder = new EmpleadoBuilder();
    }

    public EmpleadoBuilder getEmpleadoBuilder() {
        return empleadoBuilder;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Tecnico build (){
        return new Tecnico(empleadoBuilder, especialidad);
    }
}
