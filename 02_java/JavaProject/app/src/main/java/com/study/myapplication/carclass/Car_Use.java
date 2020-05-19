package com.study.myapplication.carclass;

public class Car_Use {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Electric_Car electric_car = new Electric_Car();
        Suv suv = new Suv();


        truck.drive();
        truck.charge();
        truck.stop();
        System.out.println();

        suv.drive();
        suv.charge();
        suv.speedredyce();
        System.out.println();

        electric_car.drive();
        electric_car.charge();
        electric_car.accelerate();
        electric_car.atomatic_Driving();



    }
}
