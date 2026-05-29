package com.att3.controller;

import com.att3.model.Entrega;
import com.att3.service.EntregaService;

public class EntregaController {
    private final EntregaService entregaService;
    private final Long entregaId;

    public EntregaController(EntregaService entregaService, Long entregaId) {
        this.entregaService = entregaService;
        this.entregaId = entregaId;
    }

    public Entrega getEntrega() {
        return entregaService.buscarEntregaPorId(entregaId);
    }

    public void atualizarEntrega(String descricao, String status) {
        entregaService.atualizarEntrega(entregaId, descricao, status);
    }

    public void atualizarStatus(String status) {
        entregaService.atualizarStatus(entregaId, status);
    }
}
