package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
public class EmpleadoBuilder {
    private String nombre, idEmpleado;
    private int edad;
    private Departamento departamento;

    public EmpleadoBuilder(){}

    public EmpleadoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilder idEmpleado(String idEmpleado){
        this.idEmpleado = idEmpleado;
        return this;
    }

    public EmpleadoBuilder edad(int edad){
        this.edad = edad;
        return this;
    }

    public EmpleadoBuilder departamento(Departamento departamento){
        this.departamento = departamento;
        return this;
    }

    public Empleado build(){
        return new Empleado(nombre, idEmpleado, edad, departamento);
    }
}
