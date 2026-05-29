package com.att3.repository;

import com.att3.model.Entrega;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntregaRepository {
    private final Map<Long, Entrega> entregas = new HashMap<>();

    public Entrega salvar(Entrega entrega) {
        entregas.put(entrega.getId(), entrega);
        return entrega;
    }

    public Entrega buscarPorId(Long id) {
        return entregas.get(id);
    }

    public List<Entrega> listarTodas() {
        return new ArrayList<>(entregas.values());
    }

    public void removerPorId(Long id) {
        entregas.remove(id);
    }
}
