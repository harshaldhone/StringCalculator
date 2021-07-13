package com.stringcalculator;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("Hello World...!");
    }
    public static int Add(String s){

        if(s.isEmpty()){
            return 0;
        }
        else {
            return Integer.parseInt(s);
        }

    }
}
