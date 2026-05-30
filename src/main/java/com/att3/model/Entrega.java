package com.att3.model;

public class Entrega
{
    private Long id;
    private Cliente cliente;
    private Entregador entregador;
    private String descricao;
    private StatusEntrega statusEntrega;

    public Entrega(Long id, Cliente cliente, Entregador entregador, String descricao, StatusEntrega statusEntrega)
    {
        this.id = id;
        this.cliente = cliente;
        this.entregador = entregador;
        this.descricao = descricao;
        this.statusEntrega = statusEntrega;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Entregador getEntregador()
    {
        return entregador;
    }

    public void setEntregador(Entregador entregador)
    {
        this.entregador = entregador;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public StatusEntrega getStatusEntrega()
    {
        return statusEntrega;
    }

    public void setStatusEntrega(StatusEntrega statusEntrega)
    {
        this.statusEntrega = statusEntrega;
    }

}
