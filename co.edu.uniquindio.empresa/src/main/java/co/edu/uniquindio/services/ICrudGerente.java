package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Gerente;

import java.util.ArrayList;

public interface ICrudGerente {
    public boolean createGerente(Gerente gerente);
    public Gerente readGerente(String idEmpleado);
    public boolean updateGerente(Gerente gerente);
    public boolean deleteGerente(String idEmpleado);
    public ArrayList<Gerente> getGerentes();
    }

