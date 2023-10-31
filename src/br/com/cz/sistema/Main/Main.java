package br.com.cz.sistema.Main;

import br.com.cz.sistema.Exception.VacinaVencidaException;
import br.com.cz.sistema.Model.CentroSaude;
import br.com.cz.sistema.Model.Implementacao.ICentroSaude;
import br.com.cz.sistema.Model.Implementacao.IPaciente;
import br.com.cz.sistema.Model.Implementacao.IVacina;
import br.com.cz.sistema.Model.Paciente;
import br.com.cz.sistema.Model.Vacina;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        IVacina vacina1 = new Vacina("COVID-19", new Date(2023, 12, 31), "ABC123");
        ICentroSaude centroSaude1 = new CentroSaude("Hospital A", 1000, true);
        IPaciente paciente1 = new Paciente("João", "123-456-789");

        SistemaGestao sistema = new SistemaGestao();
        sistema.adicionarVacina(vacina1);
        sistema.adicionarCentroSaude(centroSaude1);

        try {
            sistema.registrarAplicacao(paciente1, vacina1);
            System.out.println("Aplicação registrada com sucesso!");
        } catch (VacinaVencidaException e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }
}