package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Empresa;

import java.util.ArrayList;

public interface ICrudEmpleado {
    public boolean createEmpleado(String nombre, String idEmpleado, int edad, Departamento departamento);
    public Empleado readEmpleado(String idEmpleado);
    public boolean updateEmpleado(String nombre, String idEmpleado, int edad, Departamento departamento);
    public boolean deleteEmpleado(String idEmpleado);
    public ArrayList<Empleado> getEmpleados();
}
