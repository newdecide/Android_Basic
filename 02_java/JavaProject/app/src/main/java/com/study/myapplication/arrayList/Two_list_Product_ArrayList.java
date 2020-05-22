package com.study.myapplication.arrayList;

import java.util.ArrayList;

public class Two_list_Product_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> oneTotenarray = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            oneTotenarray.add(i);
        }

        ArrayList<Integer> tenToonearray = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            tenToonearray.add(11 - i);
        }

        System.out.println("oneTotenarray: " + oneTotenarray);
        System.out.println("tenToonearray: " + tenToonearray);
        ArrayListProduct(oneTotenarray, tenToonearray);
    }

    public static void ArrayListProduct(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> productarray = new ArrayList<>();
        for (int i = 0; i < arrayList1.size(); i++) {
            int result = arrayList1.get(i) * arrayList2.get(i);
            productarray.add(result);
        }
        System.out.println("resultarray: "+ productarray);
    }
}
