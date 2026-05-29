package com.att3.view;

import com.att3.controller.EntregadorController;
import com.att3.model.Entregador;

import java.util.Scanner;

public class EntregadorView {
    private final EntregadorController entregadorController;
    private final Scanner sc;

    public EntregadorView(EntregadorController entregadorController, Scanner sc) {
        this.entregadorController = entregadorController;
        this.sc = sc;
    }

    public void exibirEntregador() {
        Entregador entregador = entregadorController.getEntregador();

        if (entregador == null) {
            System.out.println("Entregador nao encontrado.");
            return;
        }

        System.out.println("Entregador");
        System.out.println("ID: " + entregador.getId());
        System.out.println("Nome: " + entregador.getNome());
        System.out.println("Veiculo: " + entregador.getVeiculo());
        System.out.println("Disponivel: " + (entregador.isDisponivel() ? "Sim" : "Nao"));
    }
}
