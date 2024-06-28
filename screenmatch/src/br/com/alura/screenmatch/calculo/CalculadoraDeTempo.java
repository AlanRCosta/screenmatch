package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempototal;

    public int getTempototal() {
        return tempototal;
    }

    public void inclui(Titulo titulo){
        tempototal += titulo.getDuracaoEmMinutos();
    }
}
