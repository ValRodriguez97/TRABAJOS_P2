package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Proyecto;

import java.util.ArrayList;

public interface ICrudProyecto {

    public boolean createProyecto(String nombre, String codigo);
    public Proyecto readProyecto(String codigo);
    public boolean updateProyecto(String codigo, String nombre);
    public boolean deleteProyecto(String codigo);
    public ArrayList<Proyecto> getProyectos();
}
