package co.edu.uniquindio;

class Gerente extends Empleado implements Contribuyente {
    public Gerente(String nombre, int idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
    }

    @Override
    public void contribuir() {
        System.out.println(getNombre() + " está gestionando el proyecto.");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + getNombre() + '\'' +
                ", idEmpleado=" + getIdEmpleado() +
                ", departamento='" + getDepartamento() + '\'' +
                '}';
    }
}