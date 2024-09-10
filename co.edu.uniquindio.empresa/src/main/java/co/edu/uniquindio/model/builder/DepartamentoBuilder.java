package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;

public class DepartamentoBuilder {
    private String nombre;
    private String codigo;

    public String nombre(){
        return nombre;
    }

    public String codigo(){
        return codigo;
    }

    public DepartamentoBuilder setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public DepartamentoBuilder setCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public Departamento build(){
        return new Departamento(nombre(), codigo());
    }

}
