package com.att3.repository;

import com.att3.model.Entregador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntregadorRepository {
    private final Map<Long, Entregador> entregadores = new HashMap<>();

    public Entregador salvar(Entregador entregador) {
        entregadores.put(entregador.getId(), entregador);
        return entregador;
    }

    public Entregador buscarPorId(Long id) {
        return entregadores.get(id);
    }

    public List<Entregador> listarTodos() {
        return new ArrayList<>(entregadores.values());
    }

    public void removerPorId(Long id) {
        entregadores.remove(id);
    }
}
