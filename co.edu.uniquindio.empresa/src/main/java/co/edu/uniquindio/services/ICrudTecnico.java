package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Tecnico;

import java.util.ArrayList;

public interface ICrudTecnico {
    public boolean createTecnico(Tecnico tecnico);
    public Tecnico readTecnico(String codigo);
    public boolean updateTecnico(Tecnico tecnico);
    public boolean deleteTecnico(String codigo);
    public ArrayList<Tecnico> getTecnicos();
}
