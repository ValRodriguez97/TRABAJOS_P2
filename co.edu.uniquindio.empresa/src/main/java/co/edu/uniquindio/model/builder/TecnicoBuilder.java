package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Tecnico;

public class TecnicoBuilder extends EmpleadoBuilder{
   private String especialidad;

    public TecnicoBuilder(){
    }

    public  TecnicoBuilder setNombre(String nombre){
        super.self();
        return this;
    }

    public TecnicoBuilder setIdEmpleado(String idEmpleado){
        super.self();
        return this;
    }

    public TecnicoBuilder setEdad(int edad){
        super.self();
        return this;
    }

    public TecnicoBuilder setDepartamento(Departamento departamento){
        super.self();
        return this;
    }

    public TecnicoBuilder setEspecialidad(String especialidad){
        this.especialidad = especialidad;
        return this;
    }

    public Tecnico build(){
        return new Tecnico(self().nombre, self().idEmpleado, self().edad, self().departamento,especialidad);
    }
}
