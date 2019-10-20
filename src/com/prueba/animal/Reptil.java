package com.prueba.animal;

public class Reptil extends Animal implements Piel {

    public int escamas;
    public Reptil(String sangre, int extremidades, int escamas){
        super(sangre, extremidades);
        // super calls the parent class' constructor with the arguments passed to it.
        this.escamas =escamas;
    }

    public int getEscamas() {
        return escamas;
    }

    public void setEscamas(int escamas) {
        this.escamas = escamas;
    }

    @Override
    public String alimentacion(){return "Carnivora";}

    @Override
    public Integer cambioDePiel(){return 30;}

}
