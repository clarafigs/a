package br.com.cz.sistema.Model;

import br.com.cz.sistema.Model.Implementacao.IPaciente;

public class Paciente implements IPaciente{
    public String nome;
    public String cpf;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;



    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getcpf() {
        return null;
    }
}
