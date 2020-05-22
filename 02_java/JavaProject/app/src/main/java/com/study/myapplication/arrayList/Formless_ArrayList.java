package com.study.myapplication.arrayList;

import java.util.ArrayList;

public class Formless_ArrayList {
    public static void main(String[] args) {
        ArrayList FormlessArrayList = new ArrayList();
        FormlessArrayList.add(19);
        FormlessArrayList.add(20);
        FormlessArrayList.add(true);
        FormlessArrayList.add("리스트");
        System.out.println(FormlessArrayList);

        FormlessArrayList.remove(3);
        System.out.println(FormlessArrayList);
    }
}
