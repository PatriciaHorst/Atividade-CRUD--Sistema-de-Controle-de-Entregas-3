package com.att3.repository;

import java.util.HashMap;

import com.att3.model.Entregador;

public class EntregadorRepository
{
    private HashMap<Long, Entregador> entregadores = new HashMap<>();

    public Entregador cadastrar(Entregador entregador)
    {
        entregadores.put(entregador.getId(), entregador);
        return entregador;
    }
}
