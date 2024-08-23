package implementacoes;

import classes_abstratas.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    private double distanciaVoador;
    private int horasDormidas;
    private double quantidadeComida;
    public Pombo(String nome, int idade, double altura, double peso, int quantidadeAssas, double envergaduraAssa) {
        super(nome, "implementacoes.Pombo", idade, altura, peso, quantidadeAssas, envergaduraAssa);
        this.distanciaVoador = 0;
    }

    @Override
    public void voar() {
        distanciaVoador += 5;
    }

    @Override
    public void comer() {
        quantidadeComida += 0.100;    }

    @Override
    public void moverse() {
        voar();
    }

    @Override
    public void dormir() {
        horasDormidas += 3;    }
}