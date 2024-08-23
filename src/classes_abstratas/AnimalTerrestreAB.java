package classes_abstratas;

import classes_abstratas.AnimalAB;

public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, "Terrestre", altura, peso);
        this.quantidadePatas = quantidadePatas;
    }
}