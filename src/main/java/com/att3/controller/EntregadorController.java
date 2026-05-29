package com.att3.controller;

import com.att3.model.Entregador;
import com.att3.service.EntregadorService;

public class EntregadorController {
    private final EntregadorService entregadorService;
    private final Long entregadorId;

    public EntregadorController(EntregadorService entregadorService, Long entregadorId) {
        this.entregadorService = entregadorService;
        this.entregadorId = entregadorId;
    }

    public Entregador getEntregador() {
        return entregadorService.buscarEntregadorPorId(entregadorId);
    }

    public void atualizarEntregador(String nome, String veiculo, boolean disponivel) {
        entregadorService.atualizarEntregador(entregadorId, nome, veiculo, disponivel);
    }

    public void alterarDisponibilidade(boolean disponivel) {
        entregadorService.alterarDisponibilidade(entregadorId, disponivel);
    }
}
