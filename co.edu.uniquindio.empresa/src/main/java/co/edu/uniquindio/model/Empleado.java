package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.EmpleadoBuilder;
/**
 * Clase Empleado
 */
public class Empleado {
    private String nombre;
    private String idEmpleado;
    private int edad;
    private Departamento departamentoAsociado;

    /**
     * Método Constructor de la clase Empleado
     *
     * @param builder
     */
    public Empleado(EmpleadoBuilder builder) {
        this.nombre = builder.nombre();
        this.idEmpleado = builder.idEmpleado();
        this.edad = builder.edad();
        this.departamentoAsociado = builder.departamento();
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
     * Método para obtener la identificacion del empleado
     *
     * @return idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
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
     * Metodo para obtener la edad del empleado
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Crear una instancia del constructor del objeto(Aplicacion del builder)
     */
    public static EmpleadoBuilder empleadobuilder(){
        return new EmpleadoBuilder();
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