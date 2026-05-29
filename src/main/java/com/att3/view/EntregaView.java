package com.att3.view;

import com.att3.controller.EntregaController;
import com.att3.model.Cliente;
import com.att3.model.Entrega;
import com.att3.model.Entregador;

import java.util.Scanner;

public class EntregaView {
    private final EntregaController entregaController;
    private final Scanner sc;

    public EntregaView(EntregaController entregaController, Scanner sc) {
        this.entregaController = entregaController;
        this.sc = sc;
    }

    public void exibirEntrega() {
        Entrega entrega = entregaController.getEntrega();

        if (entrega == null) {
            System.out.println("Entrega nao encontrada.");
            return;
        }

        Cliente cliente = entrega.getCliente();
        Entregador entregador = entrega.getEntregador();

        System.out.println("Entrega");
        System.out.println("ID: " + entrega.getId());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Entregador: " + entregador.getNome());
        System.out.println("Descricao: " + entrega.getDescricao());
        System.out.println("Status: " + entrega.getStatus());
    }
}
