package com.study.myapplication;

public class TrueFalse_Distinguish_Array {
    public static void main(String[] args) {
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
