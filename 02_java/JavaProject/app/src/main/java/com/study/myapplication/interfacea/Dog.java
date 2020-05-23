package com.study.myapplication.interfacea;

public class Dog implements Animal_Interface {

    @Override
    public void name() {
        System.out.println("개의 이름은 흰둥이다.");
    }

    @Override
    public void dance() {
        System.out.println("흰둥이가 춤을 춘다.");

    }

    @Override
    public void sleep() {
        System.out.println("흰둥이가 잠을 잔다.");
    }

    @Override
    public void wash() {
        System.out.println("흰둥이를 씻긴다.");
    }

    @Override
    public void cry() {
        System.out.println("흰둥이가 짓는다.");
    }

    @Override
    public void move() {
        System.out.println("흰둥이가 움직인다.");
    }
}
