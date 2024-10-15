package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Objeto;
import co.edu.uniquindio.marketplace.preparciali.model.Prestamo;

import java.util.List;

public interface ICrudObjeto {
    boolean createObjeto(Objeto objeto);
    Objeto readObjeto(String nombre);
    boolean updateObjeto(String nombre, Prestamo prestamoAsociado);
    boolean deleteObjeto(String nombre);
    List<Objeto> listObjetos();
    boolean verificarObjetoExistente(String nombre);
}
