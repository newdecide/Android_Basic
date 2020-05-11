package com.study.myapplication;

import java.util.ArrayList;

public class ZeroToNine_Odd_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            integerArrayList.add(i);
        }

        howManyOdds(integerArrayList);
    }

    public static int howManyOdds(ArrayList<Integer> arrayList){
        int result = 0;
        System.out.print("홀수 값: ");
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 1) {
                result++;
                System.out.print(arrayList.get(i)+" ");
            }
        }
        System.out.println();
        return result;
    }
}
