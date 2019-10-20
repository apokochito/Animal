package com.prueba.animal;

public class Main {

    public static void main(String[] args) {

        Reptil cocodrilo = new Reptil("Fría", 4, 0);
        Reptil serpiente = new Reptil("Fría", 0,0);
        cocodrilo.setEscamas(700);
        serpiente.setEscamas(200);
        System.out.println("El cocodrilo es de sangre: "+cocodrilo.getSangre()+", tiene "+cocodrilo.getExtremidades().toString()+" extremidades y tiene "+cocodrilo.getEscamas()+" escamas. Lleva una dieta "+cocodrilo.alimentacion()+" y cambia de piel cada "+cocodrilo.cambioDePiel()+" días.");
        System.out.println("La serpiente es de sangre: "+serpiente.getSangre()+", tiene "+serpiente.getExtremidades().toString()+" extremidades y tiene "+serpiente.getEscamas()+" escamas. Lleva una dieta "+serpiente.alimentacion()+" y cambia de piel cada "+serpiente.cambioDePiel()+" días.");

        Animal humano = new Mamifero("Caliente",4);

        System.out.println("El humano es de sangre "+humano.sangre+", tiene "+humano.extremidades.toString()+" extremidades. Lleva una dieta "+humano.alimentacion()+".");

    }

    /* TODO:
    * < ANIMAL class >
    * 1 - Create base (abstract) class (Animal.java) - Model
    * 2 - Describe an animal using properties (Sangre (String) and Extremidades (Integer))
    * 3 - Create constructor for Animal class because we need to initialize each object on Run (Main) class. (Reptil cocodrilo = new Reptil("Fría", 4, 0);)
    * 4 - Generate getter and setters for each property on Animal, we need to implement security.
    * 5 - Generate ToSting method on Animal, to convert their properties to String.
    * 6 - Generate an abstract method to inherit and implement it on its children.
    * < REPTIL class >
    * 1 - Create public class and extend it from the base class (Animal), implements the PIEL interface also.
    * 2 - Describe a reptil using properties (escamas (int)).
    * 3 - Create constructor for Reptil class because we need to initializa each inherit property.
    * 4 - Generate getter and setter for excamas property.
    * 6 - Override the abstract method and the method of the interface to implement them when we use reptil class to create an object.
    * < PIEL interface >
    * 1 - An interface is like a contract, we need to create an integer method to implemented wherever we need it.
    * < MAMIFERO class >
    * 1 - Create public class and extend it from the base class (Animal).
    * 2 - Create constructor for Mamifero class because we need to initialize each inherit property.
    * 3 - Override alimentacion method to implement our custom kind of alimentacion on the child class.
    * The super keyword (on constructor) in java is a reference variable that is used to refer parent class objects.
    * < MAIN class >
    * 1 - Create a Reptil object called 'cocodrilo' and initialize it.
    * 2 - Create a Reptil object called 'serpiente' and initialize it.
    * 3 - Set the number of escamas to every Animal that need it.
    * 4 - Print the information to every object.
    * 5 - Create an Animal called humano, but initialyze it like mamifero.
    * 6 - Print every property to every object.
    * */

}
