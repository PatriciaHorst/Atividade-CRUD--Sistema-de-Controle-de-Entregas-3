package com.att3.repository;

import com.att3.model.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteRepository {
    private final Map<Long, Cliente> clientes = new HashMap<>();

    public Cliente salvar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    public Cliente buscarPorId(Long id) {
        return clientes.get(id);
    }

    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes.values());
    }

    public void removerPorId(Long id) {
        clientes.remove(id);
    }
}
