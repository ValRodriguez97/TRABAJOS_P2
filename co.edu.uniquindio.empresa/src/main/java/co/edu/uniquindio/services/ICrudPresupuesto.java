package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Presupuesto;

import java.util.List;

public interface ICrudPresupuesto {
    public boolean createPresupuesto (String idPresupuesto, double valor, String estado, String descripcion);
    public Presupuesto readPresupuesto(String idPresupuesto);
    public boolean updatePresupuesto(String idPresupuesto, double valor, String estado, String descripcion);
    public boolean deletePresupuesto(String idPresupuesto);
    public List<Presupuesto> getPresupuestos();
}
