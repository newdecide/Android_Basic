package com.study.myapplication.arrayList;

import java.util.ArrayList;

public class ZeroToNine_Even_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            integerArrayList.add(i);
        }

        howManyEven(integerArrayList);
    }

    public static int howManyEven(ArrayList<Integer> arrayList){
        int result = 0;
        System.out.print("짝수 값: ");
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0) {
                result++;
                System.out.print(arrayList.get(i)+" ");
            }
        }
        System.out.println();
        return result;
    }
}
