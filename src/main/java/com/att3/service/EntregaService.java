package com.att3.service;

import com.att3.model.Cliente;
import com.att3.model.Entrega;
import com.att3.model.Entregador;
import com.att3.repository.ClienteRepository;
import com.att3.repository.EntregaRepository;
import com.att3.repository.EntregadorRepository;

import java.util.List;

public class EntregaService {

    private final EntregaRepository entregaRepository;
    private final ClienteService clienteService;
    private final EntregadorService entregadorService;

    public EntregaService(
            EntregaRepository entregaRepository,
            ClienteService clienteService,
            EntregadorService entregadorService
    ) {
        this.entregaRepository = entregaRepository;
        this.clienteService = clienteService;
        this.entregadorService = entregadorService;
    }

    public Entrega cadastrarEntrega(Entrega entrega) {
        return entregaRepository.salvar(entrega);
    }

    public Entrega cadastrarEntrega(Long id, Long clienteId, Long entregadorId, String descricao, String status) {
        Cliente cliente = clienteService.buscarCliente(id);
        Entregador entregador = entregadorService.buscarEntregadorPorId(entregadorId);

        if (cliente == null || entregador == null) {
            return null;
        }

        Entrega entrega = new Entrega(id, cliente, entregador, descricao, status);
        return entregaRepository.salvar(entrega);
    }

    public Entrega buscarEntregaPorId(Long id) {
        return entregaRepository.buscarPorId(id);
    }

    public List<Entrega> listarEntregas() {
        return entregaRepository.listarTodas();
    }

    public Entrega atualizarEntrega(Long id, String descricao, String status) {
        Entrega entrega = entregaRepository.buscarPorId(id);

        if (entrega != null) {
            entrega.setDescricao(descricao);
            entrega.setStatus(status);
            entregaRepository.salvar(entrega);
        }

        return entrega;
    }

    public Entrega atualizarStatus(Long id, String status) {
        Entrega entrega = entregaRepository.buscarPorId(id);

        if (entrega != null) {
            entrega.setStatus(status);
            entregaRepository.salvar(entrega);
        }

        return entrega;
    }

    public void removerEntrega(Long id) {
        entregaRepository.removerPorId(id);
    }


}
