package com.att3.view;

import com.att3.controller.ClienteController;
import com.att3.model.Cliente;

import java.util.Scanner;

public class ClienteView {
    private final ClienteController clienteController;
    private final Scanner sc;

    public ClienteView(ClienteController clienteController, Scanner sc) {
        this.clienteController = clienteController;
        this.sc = sc;
    }

    public void exibirCliente() {
        Cliente cliente = clienteController.getCliente();

        if (cliente == null) {
            System.out.println("Cliente nao encontrado.");
            return;
        }

        System.out.println("Cliente");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
    }
}
