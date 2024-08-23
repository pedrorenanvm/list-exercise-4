package implementacoes;

import classes_abstratas.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {
    private double quantidadeComida;
    private double distanciaPercorrida;
    private int horasDormidas;

    public Gato(String nome, int idade, double altura, double peso) {
        super(nome, "implementacoes.Gato", idade, altura, peso, 4);
        this.quantidadeComida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        quantidadeComida += 0.2;
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 3;
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
    }
}
