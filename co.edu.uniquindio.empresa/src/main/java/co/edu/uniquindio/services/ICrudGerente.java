package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Gerente;

import java.util.ArrayList;

public interface ICrudGerente {
    public boolean createGerente(String nombre, String idEmpleado, int edad, Departamento departamento);
    public Gerente readGerente(String idEmpleado);
    public boolean updateGerente(String nombre, String idEmpleado, int edad, Departamento departamento);
    public boolean deleteGerente(String idEmpleado);
    public ArrayList<Gerente> getGerentes();
    }

