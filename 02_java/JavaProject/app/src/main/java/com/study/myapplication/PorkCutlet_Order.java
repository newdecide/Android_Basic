package com.study.myapplication;

public class PorkCutlet_Order {
    public static void main(String[] args) {
        PorkCutlet nomalPorkCutlet = new PorkCutlet(2, "일반돈까스", "튀기기","주문 완료했습니다.");
        PorkCutlet kingPorkCutlet = new PorkCutlet(1, "왕돈까스", true, "튀기기","주문 완료했습니다.");

        System.out.println("메뉴는 " + nomalPorkCutlet.name +"와 "+kingPorkCutlet.name+ "가 있습니다.");
        System.out.println();

        nomalPorkCutlet.isOrder();
        nomalPorkCutlet.TakeAnOrder();
        nomalPorkCutlet.goFry();
        nomalPorkCutlet.comeOut();
        System.out.println();

        kingPorkCutlet.isOrder();
        kingPorkCutlet.TakeAnOrder();
        kingPorkCutlet.goFry();
        kingPorkCutlet.comeOut();

    }
}
