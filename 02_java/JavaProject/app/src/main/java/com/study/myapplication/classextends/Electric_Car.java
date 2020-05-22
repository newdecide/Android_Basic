package com.study.myapplication.classextends;

public class Electric_Car extends Car {
    public Electric_Car(){

    }

    @Override
    public void drive() {
        System.out.println("전기차를 운전하다");
    }

    @Override
    public void charge() {
        System.out.println("전기로 충전하다");
    }

    public void atomatic_Driving(){
        System.out.println("자율주행으로 운전하다.");
    }
}
