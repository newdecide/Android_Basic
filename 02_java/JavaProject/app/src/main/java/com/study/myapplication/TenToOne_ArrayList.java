package com.study.myapplication;

import java.util.ArrayList;

public class TenToOne_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> tenToonearray = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            tenToonearray.add(11 - i);
        }

        System.out.println(tenToonearray);
    }
}
