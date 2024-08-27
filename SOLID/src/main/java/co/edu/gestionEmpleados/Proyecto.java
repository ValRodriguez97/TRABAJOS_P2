package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados;

    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = new ArrayList<>();
    }
    public void asignarGerente(Gerente gerente) {
        empleadosAsignados.add(gerente);
    }
    public void asignarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", empleadosAsignados=" + empleadosAsignados +
                '}';
    }
}
