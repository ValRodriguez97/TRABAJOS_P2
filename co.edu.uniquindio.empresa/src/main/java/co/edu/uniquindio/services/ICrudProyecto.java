package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Proyecto;

import java.util.ArrayList;

public interface ICrudProyecto {

    public boolean createProyecto(Proyecto proyecto);
    public Proyecto readProyecto(String codigo);
    public boolean updateProyecto(Proyecto proyecto);
    public boolean deleteProyecto(String codigo);
    public ArrayList<Proyecto> getProyectos();
}
