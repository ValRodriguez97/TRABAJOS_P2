package co.edu.uniquindio.marketplace.preparciali.service;

import co.edu.uniquindio.marketplace.preparciali.model.Cliente;

import java.util.List;

public interface ICrudCliente {
    boolean createCliente (Cliente cliente);
    Cliente readCliente(String cedula);
    boolean updateCliente(String nombre, String apellido, String cedula, String edad);
    boolean deleteCliente(String cedula);
    List<Cliente> listClientes();

    boolean verificarClienteExistente(String cedula);
}
