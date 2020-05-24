package com.study.myapplication.animalinterface;

public class Animal_Interface_Use {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Tutle tutle = new Tutle();

        cat.name();
        cat.dance();
        cat.cry();
        cat.move();
        cat.wash();
        cat.sleep();

        System.out.println();

        dog.name();
        dog.dance();
        dog.cry();
        dog.move();
        dog.wash();
        dog.sleep();

        System.out.println();
        
        tutle.name();
        tutle.dance();
        tutle.cry();
        tutle.move();
        tutle.wash();
        tutle.sleep();

    }

}
