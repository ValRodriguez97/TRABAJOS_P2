package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;

import java.util.ArrayList;

public interface ICrudDepartamento {

    public boolean createDepartamento(String nombre, String codigo);
    public Departamento readDepartamento(String codigo);
    public boolean updateDepartamento(String nombre, String codigo);
    public boolean deleteDepartamento(String codigo);
    public ArrayList<Departamento> getDepartamentos();
}

