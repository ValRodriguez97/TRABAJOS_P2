package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.PresupuestoBuilder;

public class Presupuesto {
    private String idPresupuesto;
    private  double valor;
    private String estado;
    private String descripcion;

    public Presupuesto(String idPresupuesto, double valor, String estado, String descripcion){
        this.idPresupuesto = idPresupuesto;
        this.valor = valor;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public static PresupuestoBuilder presupuestoBuilder(){
        return new PresupuestoBuilder();
    }

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
