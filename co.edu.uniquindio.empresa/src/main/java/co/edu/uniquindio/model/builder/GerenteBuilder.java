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

    public String nombre (){
        return  nombre();
    }

    public String idEmpleado(){
        return idEmpleado();
    }

    public int edad (){
        return edad();
    }

    public GerenteBuilder setNombre (String nombre){
        this.empleadoBuilder.setNombre(nombre);
        return this;
    }

    public GerenteBuilder setIdEmpleado (String idEmpleado){
        this.empleadoBuilder.setIdEmpleado(idEmpleado);
        return this;
    }

    public GerenteBuilder setEdad (int edad){
        this.empleadoBuilder.setEdad(edad);
        return this;
    }

    public Gerente build (){
        return  new Gerente(empleadoBuilder);
    }
}
