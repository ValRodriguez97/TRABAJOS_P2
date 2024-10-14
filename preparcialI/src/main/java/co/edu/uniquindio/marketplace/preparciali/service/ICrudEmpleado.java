package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Empleado;

import java.util.List;

public interface ICrudEmpleado {
    boolean createEmpleado(String nombre, String apellido, String cedula, String edad);
    Empleado readEmpleado(String cedula);
    boolean updateEmpleado(String cedula, String nombre, String apellido, String edad);
    boolean deleteEmpleado(String cedula);
    List<Empleado> listEmpleados();

    boolean verificarEmpleadoExistente(String cedula);
}
