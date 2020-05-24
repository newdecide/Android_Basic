package com.study.myapplication.animalinterface;

public class Tutle implements Animal_Interface {
    @Override
    public void name() {
        System.out.println("거북이의 이름은 꼬부기다.");
    }

    @Override
    public void dance() {
        System.out.println("꼬부기가 춤을 춘다.");
    }

    @Override
    public void sleep() {
        System.out.println("꼬부기가 잠을 잔다.");
    }

    @Override
    public void wash() {
        System.out.println("꼬부기를 씻기다.");
    }

    @Override
    public void cry() {
        System.out.println("꼬부기가 짓는다.");
    }

    @Override
    public void move() {
        System.out.println("꼬부기가 움직인다.");
    }
}
