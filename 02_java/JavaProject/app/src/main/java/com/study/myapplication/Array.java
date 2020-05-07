package com.study.myapplication;

public class Array {
    public static void main(String[] args) {

        int [] intarray = new int[4];

        intarray[0] = 10;
        intarray[1] = 9;
        intarray[2] = 8;
        intarray[3] = 7;

        for (int i = 0; i < intarray.length; i++){
            System.out.print(intarray[i]+" ");
        }
        System.out.println();

        int [] intarray2 = {1,2,3,4};

        int first = intarray2[0];
        int second = intarray2[1];
        int third = intarray2[2];
        int fourth = intarray2[3];

        System.out.print(first+" ");
        System.out.print(second+" ");
        System.out.print(third+" ");
        System.out.print(fourth+" ");

        System.out.println();

        for (int i = 0; i < intarray2.length; i++){
            if(intarray2[i] == 1){
                System.out.println("1 발견!");
            } else if(intarray2[i] == 2){
                System.out.println("2 발견!");
            } else {
                System.out.println("1과 2가 아닙니다.");
            }
        }

        boolean[] booleansarray = new boolean[4];
        booleansarray[0] = true;
        booleansarray[1] = false;
        booleansarray[2] = false;
        booleansarray[3] = true;

        for (int i = 0; i < booleansarray.length; i++){
            if(booleansarray[i] == true){
                System.out.print("참 ");
            } else {
                System.out.print("거짓 ");
            }
        }
        System.out.println();

        boolean [] booleansarray2 = {true, false, true, false};
        for (int i = 0; i < booleansarray2.length; i++){
            if(booleansarray2[i] == true){
                System.out.print(booleansarray2[i] + " ");
            } else {
                System.out.print(booleansarray2[i] + " ");
            }
        }

    }

}
