package com.att3.repository;

import java.util.ArrayList;
import java.util.HashMap;

import com.att3.model.Entrega;
import com.att3.model.StatusEntrega;

public class EntregaRepository
{
    HashMap<Long, Entrega> entregas = new HashMap<>();

    public Entrega cadastrarEntrega(Entrega entrega)
    {
        entregas.put(entrega.getId(), entrega);
        return entrega;
    }

    public ArrayList<Entrega> listarEntrega()
    {
        return new ArrayList<>(entregas.values());
    }

    public void atualizarStatus(Entrega entrega, StatusEntrega statusEntrega)
    {
        entregas.get(entrega.getId()).setStatusEntrega(statusEntrega);
    }

    public void remover(Entrega entrega)
    {
        entregas.remove(entrega.getId());
    }
}
