package com.prueba.animal;

public class Mamifero extends Animal {

    public Mamifero(String sangre, int extremidades){
        super(sangre,extremidades);
    }

    @Override
    public String alimentacion(){return "Omnivora";}
}
