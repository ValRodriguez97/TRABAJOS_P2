package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Tecnico;

import java.util.ArrayList;

public interface ICrudTecnico {
    public boolean createTecnico(String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad);
    public Tecnico readTecnico(String codigo);
    public boolean updateTecnico(String nombre, String idEmpleado, int edad, Departamento departamento, String especialidad);
    public boolean deleteTecnico(String codigo);
    public ArrayList<Tecnico> getTecnicos();
}
