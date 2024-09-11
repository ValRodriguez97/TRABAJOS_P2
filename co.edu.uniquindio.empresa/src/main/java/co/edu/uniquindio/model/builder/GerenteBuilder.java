package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Gerente;

public class GerenteBuilder extends EmpleadoBuilder{
    public GerenteBuilder(){}

    public GerenteBuilder setNombre (String nombre){
        super.self();
        return this;
    }

    public GerenteBuilder setIdEmpleado (String idEmpleado){
        super.self();
        return this;
    }

    public GerenteBuilder setEdad (int edad){
        super.self();
        return this;
    }

    public GerenteBuilder setDepartamento(Departamento departamento){
        super.self();
        return this;
    }

    public Gerente build (){
        return  new Gerente(self().nombre, self().idEmpleado, self().edad, self().departamento);
    }
}
