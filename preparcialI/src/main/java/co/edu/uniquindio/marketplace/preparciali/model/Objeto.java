package co.edu.uniquindio.marketplace.preparciali.model;

public class Objeto {
    private String nombre;
    private Prestamo prestamoAsociado;

    public Objeto(String nombre, Prestamo prestamoAsociado) {
        this.nombre = nombre;
        this.prestamoAsociado = prestamoAsociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public void setPrestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
    }
}
