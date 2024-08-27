package co.edu.uniquindio;

class Tecnico extends Empleado implements Contribuyente {
    private String especialidad;
    public Tecnico(String nombre, int idEmpleado, String especialidad, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
        this.especialidad = especialidad;
    }

    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está trabajando en tareas técnicas.");
    }

    @Override
    public String toString() {
        return "Técnico{" +
                "nombre='" + getNombre() + '\'' +
                ", idEmpleado=" + getIdEmpleado() +
                ", departamento='" + getDepartamento() + '\'' +
                '}';
    }
}