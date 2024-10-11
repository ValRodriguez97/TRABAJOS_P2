package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;

import java.util.List;

public interface ICrudCliente {
    boolean createCliente (String nombre, String apellido, String cedula, String edad);
    Cliente readCliente(String cedula);
    boolean updateCliente(String nombre, String apellido, String cedula, String edad);
    boolean deleteCliente(String cedula);
    List<Cliente> getClientes();
    boolean verificarClienteExistente(String cedula);
}
