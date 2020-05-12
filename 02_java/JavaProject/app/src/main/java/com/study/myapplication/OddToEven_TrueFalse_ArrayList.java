package com.study.myapplication;

import java.util.ArrayList;

public class OddToEven_TrueFalse_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            integerArrayList.add(i);
        }

        ArrayList<Boolean> evenTrue_oddFalse = new ArrayList<>();

        for(int i = 0; i < integerArrayList.size(); i++){
            if( integerArrayList.get(i) % 2 == 0){
                evenTrue_oddFalse.add(true);
            } else {
                evenTrue_oddFalse.add(false);
            }
        }
        System.out.println(evenTrue_oddFalse);
    }

}
