package com.study.myapplication.animalinterface;

public class Cat implements Animal_Interface{
    @Override
    public void name() {
        System.out.println("고양이의 이름은 키티다.");
    }

    @Override
    public void dance() {
        System.out.println("키티가 춤을 춘다.");

    }

    @Override
    public void sleep() {
        System.out.println("키티가 잠을 잔다.");
    }

    @Override
    public void wash() {
        System.out.println("키티를 씻긴다.");
    }

    @Override
    public void cry() {
        System.out.println("키티가 짓는다.");
    }

    @Override
    public void move() {
        System.out.println("키티가 움직인다.");
    }
}
