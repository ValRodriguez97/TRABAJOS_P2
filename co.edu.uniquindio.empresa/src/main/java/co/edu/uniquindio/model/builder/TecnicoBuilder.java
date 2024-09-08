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

    public TecnicoBuilder setNombre(String nombre){
        this.empleadoBuilder.setNombre(nombre);
        return this;
    }

    public TecnicoBuilder setIdEmpleado(String idEmpleado){
        this.empleadoBuilder.setIdEmpleado(idEmpleado);
        return this;
    }

    public TecnicoBuilder setEdad(int edad){
        this.empleadoBuilder.setEdad(edad);
        return this;
    }

    public String especialidad() {
        return especialidad;
    }

    public TecnicoBuilder setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
       return this;
    }

    public Tecnico build (){
        return new Tecnico(empleadoBuilder, this);
    }
}
