package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;

import java.util.ArrayList;

public interface ICrudDepartamento {

    public boolean createDepartamento(Departamento departamento);
    public Departamento readDepartamento(String codigo);
    public boolean updateDepartamento(Departamento departamento);
    public boolean deleteDepartamento(String codigo);
    public ArrayList<Departamento> getDepartamentos();
}

