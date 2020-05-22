package com.study.myapplication.classextends;

public class Truck extends Car{
    public Truck(){

    }

    @Override
    public void drive() {
        System.out.println("트럭을 운전하다");
    }

    @Override
    public void charge() {
        System.out.println("경유를 충전하다");
    }
}
