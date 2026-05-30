package com.att3.model;

public class Entregador
{
    private Long id;
    private String nome;
    private String veiculo;
    private boolean disponivel;

    public Entregador(Long id, String nome, String veiculo, boolean disponivel)
    {
        this.id = id;
        this.nome = nome;
        this.veiculo = veiculo;
        this.disponivel = disponivel;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getVeiculo()
    {
        return veiculo;
    }

    public void setVeiculo(String veiculo)
    {
        this.veiculo = veiculo;
    }

    public boolean isDisponivel()
    {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel)
    {
        this.disponivel = disponivel;
    }
}
