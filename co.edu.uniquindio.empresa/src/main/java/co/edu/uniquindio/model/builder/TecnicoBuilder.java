package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Tecnico;

public class TecnicoBuilder extends EmpleadoBuilder{
   private String especialidad;

    public TecnicoBuilder(){
    }

    public  TecnicoBuilder setNombre(String nombre){
        super.setNombre(nombre);
        return this;
    }

    public TecnicoBuilder setIdEmpleado(String idEmpleado){
        super.setIdEmpleado(idEmpleado);
        return this;
    }

    public TecnicoBuilder setEdad(int edad){
        super.setEdad(edad);
        return this;
    }

    public TecnicoBuilder setDepartamento(Departamento departamento){
        super.setDepartamento(departamento);
        return this;
    }

    public TecnicoBuilder setEspecialidad(String especialidad){
        this.especialidad = especialidad;
        return this;
    }

    public Tecnico build(){
        return new Tecnico(nombre(), idEmpleado(), edad(), departamento(), this);
    }
}
