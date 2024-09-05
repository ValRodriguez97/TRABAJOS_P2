package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;

public class DepartamentoBuilder {
    private String nombre, codigo;

    public DepartamentoBuilder(){}
    public DepartamentoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public DepartamentoBuilder codigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public Departamento build(){
        return new Departamento(nombre, codigo);
    }
}
