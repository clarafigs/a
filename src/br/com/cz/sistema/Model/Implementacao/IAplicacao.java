package br.com.cz.sistema.Model.Implementacao;

import java.util.Date;

public interface IAplicacao {
    IPaciente getPaciente();
    IVacina getVacina();
    Date getDataAplicacao();
}
