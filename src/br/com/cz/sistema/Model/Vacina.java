package br.com.cz.sistema.Model;

import br.com.cz.sistema.Model.Implementacao.IVacina;

import java.util.Date;

public class Vacina implements IVacina {
    public String tipo;
    public String DataValidade;
    public String lote;

    public Vacina(String tipo, String DataValidade, String lote){
        this.tipo = tipo;
        this.DataValidade = DataValidade;
        this.lote = lote;
    }

    public Vacina(String tipo, Date date, String abc123) {
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public Date getDataValidade() {
        return null;
    }

    @Override
    public String getLote() {
        return null;
    }

    @Override
    public boolean estaVencida() {
        return false;



    }
}
