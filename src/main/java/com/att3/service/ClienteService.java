package com.att3.service;

import com.att3.model.Cliente;
import com.att3.repository.ClienteRepository;

import java.util.List;

public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.salvar(cliente);
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.buscarPorId(id);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.listarTodos();
    }

    public Cliente atualizarCliente(Long id, String nome, String endereco) {
        Cliente cliente = clienteRepository.buscarPorId(id);

        if (cliente != null) {
            cliente.setNome(nome);
            cliente.setEndereco(endereco);
            clienteRepository.salvar(cliente);
        }

        return cliente;
    }

    public void removerCliente(Long id) {
        clienteRepository.removerPorId(id);
    }
}
