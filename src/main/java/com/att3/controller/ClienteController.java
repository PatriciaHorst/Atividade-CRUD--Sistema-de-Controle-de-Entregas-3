package com.att3.controller;

import com.att3.model.Cliente;
import com.att3.service.ClienteService;

public class ClienteController {
    private final ClienteService clienteService;
    private final Long clienteId;

    public ClienteController(ClienteService clienteService, Long clienteId) {
        this.clienteService = clienteService;
        this.clienteId = clienteId;
    }

    public Cliente getCliente() {
        return clienteService.buscarClientePorId(clienteId);
    }

    public void atualizarCliente(String nome, String endereco) {
        clienteService.atualizarCliente(clienteId, nome, endereco);
    }
}
