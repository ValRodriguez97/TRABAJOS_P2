package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Objeto;

import java.util.List;

public interface ICrudObjeto {
    boolean createObjeto(Objeto objeto);
    Objeto readObjeto(String nombre);
    boolean updateObjeto(String nombre);
    boolean deleteObjeto(String nombre);
    List<Objeto> listObjetos();

    boolean verificarObjetoExistente(String nombre);
}
