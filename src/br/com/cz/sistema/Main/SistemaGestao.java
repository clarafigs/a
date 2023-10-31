package br.com.cz.sistema.Main;

import br.com.cz.sistema.Exception.VacinaVencidaException;
import br.com.cz.sistema.Model.Aplicacao;
import br.com.cz.sistema.Model.Implementacao.IAplicacao;
import br.com.cz.sistema.Model.Implementacao.ICentroSaude;
import br.com.cz.sistema.Model.Implementacao.IPaciente;
import br.com.cz.sistema.Model.Implementacao.IVacina;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaGestao {
    public List<IVacina> vacinas;
    public List<ICentroSaude> centrosSaude;
    public List<IAplicacao> aplicacoes;

    public SistemaGestao() {
        vacinas = new ArrayList<>();
        centrosSaude = new ArrayList<>();
        aplicacoes = new ArrayList<>();
    }

    public void adicionarVacina(IVacina vacina) {
        vacinas.add(vacina);
    }

    public void adicionarCentroSaude(ICentroSaude centroSaude) {
        centrosSaude.add(centroSaude);
    }

    public void registrarAplicacao(IPaciente paciente, IVacina vacina) throws VacinaVencidaException {
        if (vacina.estaVencida()) {
            throw new VacinaVencidaException();
        }

        IAplicacao aplicacao = new Aplicacao(paciente, vacina, new Date());
        aplicacoes.add(aplicacao);
    }
}

