package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> empleados;

    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = new ArrayList<>();
    }

    public void agregarGerente(Gerente gerente) {
        empleados.add(gerente);
    }
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
