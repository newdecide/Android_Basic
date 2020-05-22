package com.study.myapplication.arrayList;

import java.util.ArrayList;

public class OneToTen_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> oneTotenarray = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            oneTotenarray.add(i);
        }

        System.out.println(oneTotenarray);
    }
}
