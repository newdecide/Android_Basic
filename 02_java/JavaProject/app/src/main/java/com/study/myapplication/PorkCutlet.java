package com.study.myapplication;

public class PorkCutlet {
    int count;
    String name;
    Boolean king = false;
    String fry;
    String complete;


    public PorkCutlet(int count, String name, String fry, String complete){
        this.count = count;
        this.name = name;
        this.fry = fry;
        this.complete = complete;
    }

    public PorkCutlet(int count, String name, Boolean king, String fry, String complete){
        this.count = count;
        this.name = name;
        this.king = king;
        this.fry = fry;
        this.complete = complete;
    }

    public void goFry(){
            System.out.println("돈까스를 튀깁니다.");
    }

    public void TakeAnOrder(){
        if ( king == true){
            System.out.println("왕돈까스 주문을 받았습니다.");
        } else {
            System.out.println("일반돈까스 주문을 받았습니다.");
        }
    }

    public void isOrder(){
        if ( king == true){
            System.out.println("왕돈까스 주세요.");
        } else {
            System.out.println("일반돈까스 주세요.");
        }
    }

    public void comeOut(){
        if ( king == true){
            System.out.println("왕돈까스가 나왔습니다.");
        } else {
            System.out.println("일반돈까스가 나왔습니다.");
        }
    }
}
