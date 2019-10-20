package com.prueba.animal;

public abstract class Animal {

    public String sangre;
    public Integer extremidades;

    public Animal(String sangre, int extremidades){
        this.sangre = sangre;
        this.extremidades = extremidades;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public Integer getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(Integer extremidades) {
        this.extremidades = extremidades;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "sangre='" + sangre + '\'' +
                ", extremidades=" + extremidades +
                '}';
    }

    public abstract String alimentacion();

}
