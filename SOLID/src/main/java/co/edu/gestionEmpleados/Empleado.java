package co.edu.uniquindio;

public class Empleado {
    private String nombre;
    private int idEmpleado;
    private Departamento departamento;

    public Empleado(String nombre, int idEmpleado, Departamento departamento) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", idEmpleado=" + idEmpleado +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
