package br.com.cz.sistema.Model.Implementacao;

import java.util.Date;

public interface IVacina {
    String getTipo();
    Date getDataValidade();
    String getLote();
    boolean estaVencida();
}
