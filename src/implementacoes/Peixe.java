package implementacoes;

import classes_abstratas.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    private double distanciaNadada;
    private int horasDormidas;
    private double quantidadeComida;
    public Peixe(String nome, int idade, double altura, double peso) {
        super(nome, "implementacoes.Peixe", idade, altura, peso);
        this.distanciaNadada = 0;
    }

    @Override
    public void nadar() {
        distanciaNadada += 1;
    }

    @Override
    public void comer() {
        quantidadeComida += 0.50;    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
        horasDormidas += 4;
    }
}
