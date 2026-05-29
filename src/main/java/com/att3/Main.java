package com.att3;

import com.att3.controller.ClienteController;
import com.att3.controller.EntregaController;
import com.att3.controller.EntregadorController;
import com.att3.model.Cliente;
import com.att3.model.Entrega;
import com.att3.model.Entregador;
import com.att3.repository.ClienteRepository;
import com.att3.repository.EntregaRepository;
import com.att3.repository.EntregadorRepository;
import com.att3.service.ClienteService;
import com.att3.service.EntregaService;
import com.att3.service.EntregadorService;
import com.att3.view.ClienteView;
import com.att3.view.EntregaView;
import com.att3.view.EntregadorView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClienteRepository clienteRepository = new ClienteRepository();
        EntregadorRepository entregadorRepository = new EntregadorRepository();
        EntregaRepository entregaRepository = new EntregaRepository();

        ClienteService clienteService = new ClienteService(clienteRepository);
        EntregadorService entregadorService = new EntregadorService(entregadorRepository);
        EntregaService entregaService = new EntregaService(
                entregaRepository,
                clienteService,
                entregadorService
        );

        Cliente cliente = new Cliente(1L, "Murilo", "Rua Principal");
        Entregador entregador = new Entregador(1L, "Carlos", "Moto", true);
        Entrega entrega = new Entrega(1L, cliente, entregador, "Pedido de mercado", "Pendente");

        clienteService.cadastrarCliente(cliente);
        entregadorService.cadastrarEntregador(entregador);
        entregaService.cadastrarEntrega(entrega);

        ClienteController clienteController = new ClienteController(clienteService, cliente.getId());
        EntregadorController entregadorController = new EntregadorController(entregadorService, entregador.getId());
        EntregaController entregaController = new EntregaController(entregaService, entrega.getId());

        ClienteView clienteView = new ClienteView(clienteController, sc);
        EntregadorView entregadorView = new EntregadorView(entregadorController, sc);
        EntregaView entregaView = new EntregaView(entregaController, sc);

        clienteView.exibirCliente();
        System.out.println();
        entregadorView.exibirEntregador();
        System.out.println();
        entregaView.exibirEntrega();

        sc.close();
    }
}
