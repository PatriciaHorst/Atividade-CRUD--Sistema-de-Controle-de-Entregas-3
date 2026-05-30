package com.att3.repository;

import java.util.ArrayList;
import java.util.HashMap;

import com.att3.model.Cliente;

public class ClienteRepository
{
    private HashMap<Long, Cliente> clientes = new HashMap<>();

    public Cliente cadastrarCliente(Cliente cliente)
    {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    public Cliente buscarPorId(Long id)
    {
        return clientes.get(id);
    }

    public ArrayList<Cliente> listarClientes()
    {
        return new ArrayList<>(clientes.values());
    }

    public void removerPorId(Long id)
    {
        clientes.remove(id);
    }
}