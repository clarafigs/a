package br.com.cz.sistema.Model;

import br.com.cz.sistema.Model.Implementacao.ICentroSaude;

public class CentroSaude implements ICentroSaude {
    public String nome;
    public int capacidadeArmazenamento;
    public boolean equipamentoAdequado;

    public CentroSaude(String nome, int capacidadeArmazenamento, boolean equipamentoAdequado) {
        this.nome = nome;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.equipamentoAdequado = equipamentoAdequado;


        }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public int getCapacidadeArmazenamento() {
        return 0;
    }

    @Override
    public boolean temEquipamentoAdequado() {
        return false;
    }
}

