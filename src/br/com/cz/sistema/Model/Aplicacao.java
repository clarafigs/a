package br.com.cz.sistema.Model;

import br.com.cz.sistema.Model.Implementacao.IAplicacao;
import br.com.cz.sistema.Model.Implementacao.IPaciente;
import br.com.cz.sistema.Model.Implementacao.IVacina;

import java.util.Date;

public class Aplicacao implements IAplicacao {
    public IPaciente paciente;
    public IVacina vacina;
    public Date dataAplicacao;

    public Aplicacao(IPaciente paciente, IVacina vacina, Date dataAplicacao) {
        this.paciente = paciente;
        this.vacina = vacina;
        this.dataAplicacao = dataAplicacao;


    }

    @Override
    public IPaciente getPaciente() {
        return null;
    }

    @Override
    public IVacina getVacina() {
        return null;
    }

    @Override
    public Date getDataAplicacao() {
        return null;
    }
}
