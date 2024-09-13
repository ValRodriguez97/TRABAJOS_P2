package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.EmpleadoBuilder;

/**
 * Clase Empleado
 */
public abstract class Empleado {
    private String nombre;
    private String idEmpleado;
    private int edad;
    private Departamento departamentoAsociado;

    public Empleado(String nombre, String idEmpleado, int edad, Departamento departamentoAsociado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.edad = edad;
        this.departamentoAsociado = departamentoAsociado;
        assert nombre != null && !nombre.isEmpty();
        assert idEmpleado != null && !idEmpleado.isEmpty();
        assert departamentoAsociado != null;
    }

    /**
     * Metodo para obtener el nombre del empleado
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el id del emppleado
     * @return idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    } 

    /**
     * Metodo para obtener el departamento del empleado
     * @return departamentoAsociado
     */
    public Departamento getDepartamentoAsociado() {
        return departamentoAsociado;
    }

    /**
     * Metodo para obtener la edad del empleado
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Crear una instancia del constructor del empleado(Aplicacion del builder)
     * @return Empleado Builder
     */
    public static EmpleadoBuilder empleadobuilder() {
        return new EmpleadoBuilder();
    }

    /**
     * Metodo para modificar el id del empleado
     * @param idEmpleado
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Metodo para modificar la edad del empleado
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo para modificar el departamento asociado del empleado
     * @param departamentoAsociado
     */
    public void setDepartamentoAsociado(Departamento departamentoAsociado) {
        this.departamentoAsociado = departamentoAsociado;
    }

    /**
     * Metodo abstracto contribuir
     */
    public abstract void contribuir();

    /**
     * Metodo para modificar el nombre del empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo toString para mostrar el objeto como una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "Empleado \n"
                + "Nombre: " + nombre + "\n"
                + "IdEmpleado: " + idEmpleado + "\n"
                + "Departamento: " + departamentoAsociado + "\n";
    }

}