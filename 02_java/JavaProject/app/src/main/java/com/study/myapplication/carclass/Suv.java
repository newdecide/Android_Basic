package com.study.myapplication.carclass;

public class Suv extends Car {
    public Suv(){

    }

    @Override
    public void drive() {
        System.out.println("Suv를 운전하다");
    }
    @Override
    public void charge() {
        System.out.println("휘발유를 충전하다");
    }
}
