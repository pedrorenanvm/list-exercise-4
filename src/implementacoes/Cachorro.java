package implementacoes;

import classes_abstratas.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {
    private double quantidadeComida;
    private double distanciaPercorrida;
    private int horasDormidas;

    public Cachorro(String nome, int idade, double altura, double peso) {
        super(nome, "implementacoes.Cachorro", idade, altura, peso, 4);
        this.quantidadeComida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        quantidadeComida += 0.5;
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 2;
    }

    @Override
    public void dormir() {
        horasDormidas += 8;
    }
}
