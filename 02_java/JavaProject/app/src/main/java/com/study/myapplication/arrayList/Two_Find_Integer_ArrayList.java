package com.study.myapplication.arrayList;

import java.util.ArrayList;

public class Two_Find_Integer_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        intArrayList.add(2);
        intArrayList.add(3);

        System.out.println(intArrayList);

        for (int i = 0; i < intArrayList.size(); i++){
            if (intArrayList.get(i) == 2){
                System.out.println("2를 찾았다");
            }
        }



    }
}
