package implementacoes;

import classes_abstratas.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {
    private double quantidadeComida;
    private double distanciaPercorrida;
    private int horasDormidas;

    public Elefante(String nome, int idade, double altura, double peso) {
        super(nome, "implementacoes.Elefante", idade, altura, peso, 4);
        this.quantidadeComida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        quantidadeComida += 10;
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 1;
    }

    @Override
    public void dormir() {
        horasDormidas += 5;
    }
}
