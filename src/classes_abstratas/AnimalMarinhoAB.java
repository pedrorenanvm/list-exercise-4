package classes_abstratas;

import classes_abstratas.AnimalAB;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, double altura, double peso) {
        super(nome, tipoAnimal, idade, "Aquático", altura, peso);
    }

    public abstract void nadar();
}