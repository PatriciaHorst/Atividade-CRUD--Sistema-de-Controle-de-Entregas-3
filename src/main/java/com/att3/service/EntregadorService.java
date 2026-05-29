package com.att3.service;

import com.att3.model.Entregador;
import com.att3.repository.EntregadorRepository;

import java.util.List;

public class EntregadorService {
    private final EntregadorRepository entregadorRepository;

    public EntregadorService(EntregadorRepository entregadorRepository) {
        this.entregadorRepository = entregadorRepository;
    }

    public Entregador cadastrarEntregador(Entregador entregador) {
        return entregadorRepository.salvar(entregador);
    }

    public Entregador buscarEntregadorPorId(Long id) {
        return entregadorRepository.buscarPorId(id);
    }

    public List<Entregador> listarEntregadores() {
        return entregadorRepository.listarTodos();
    }

    public Entregador atualizarEntregador(Long id, String nome, String veiculo, boolean disponivel) {
        Entregador entregador = entregadorRepository.buscarPorId(id);

        if (entregador != null) {
            entregador.setNome(nome);
            entregador.setVeiculo(veiculo);
            entregador.setDisponivel(disponivel);
            entregadorRepository.salvar(entregador);
        }

        return entregador;
    }

    public Entregador alterarDisponibilidade(Long id, boolean disponivel) {
        Entregador entregador = entregadorRepository.buscarPorId(id);

        if (entregador != null) {
            entregador.setDisponivel(disponivel);
            entregadorRepository.salvar(entregador);
        }

        return entregador;
    }

    public void removerEntregador(Long id) {
        entregadorRepository.removerPorId(id);
    }
}
