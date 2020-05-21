package com.study.myapplication.accessmodifier;

public class Saving_User {
    public static void main(String[] args) {
        Saving saving = new Saving();

        int savingMoney = saving.checkSavingMoney();
        System.out.println("저축한 금액은 : " + savingMoney + "원 입니다.");

        saving.withdrawMoney(5000);

    }
}
