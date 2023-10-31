package br.com.cz.sistema.Exception;

public class VacinaVencidaException extends Exception {
    public VacinaVencidaException() {
        super("A vacina está vencida e não pode ser aplicada.");
    }
}
