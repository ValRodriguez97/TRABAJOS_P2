package co.edu.uniquindio;

/**
 * Clase Empleado
 */
public class Empleado {
    private String nombre;
    private String idEmpleado;
    private Departamento departamentoAsociado;

    /**
     * Método Constructor de la clase Empleado
     *
     * @param nombre nombre del empleado
     * @param idEmpleado id del empleado
     * @param departamentoAsociado del empleado
     */
    public Empleado(String nombre, String idEmpleado, Departamento departamentoAsociado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.departamentoAsociado = departamentoAsociado;
        assert nombre != null && !nombre.isEmpty();
        assert idEmpleado != null && !idEmpleado.isEmpty();
        assert departamentoAsociado != null;
    }

    /**
     * Método para obtener el nombre del empleado
     *
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del empleado
     *
     * @param nombre nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la identificacion del empleado
     *
     * @return idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Método para establecer la identificación del empleado
     *
     * @return nuevo idEmpleado
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Método para obtener el departamento asociado del empleado
     *
     * @return departamento asociado del empleado
     */
    public Departamento getDepartamentoAsociado () {
        return departamentoAsociado;
    }

    /**
     * Método que devuelva la representación en cadema de la clase Empleado
     *
     * @return representación en cadena de la clase Empleado
     */
    @Override
    public String toString (){
        return "Empleado \n"
                + "Nombre: " + nombre + "\n"
                + "IdEmpleado: " + idEmpleado + "\n"
                + "Departamento: " + departamentoAsociado + "\n";
    }
}
