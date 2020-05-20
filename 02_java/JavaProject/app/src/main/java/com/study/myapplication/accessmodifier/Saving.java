package com.study.myapplication.accessmodifier;

public class Saving {
    private int savingMoney = 10000;

    public int checkSavingMoney(){
        return savingMoney;
    }

    public void withdrawMoney(int savingMoney){
        if(certificate() == true){
            if(otp() == true){
                System.out.println(savingMoney+"원이 "+"인출됐습니다.");
            }
        }
    }

    private boolean certificate() {
        return true;
    }

    private boolean otp(){
        return true;
    }
}
