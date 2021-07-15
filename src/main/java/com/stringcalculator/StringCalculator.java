package com.stringcalculator;

import java.util.List;

public class StringCalculator {
    public static void main(String[] args) {
        try{
            System.out.println(Add("0"));
        }catch (Exception e){
            System.out.println("Exception"+e);
        }
    }
    public static int Add(String s){

        int sum=0;
        if(s.isEmpty()){
            return 0;
        }
        else if(s.contains(",")){
            String[] tokens = s.split(",");
            for(String strTmp:tokens){
                sum=sum+toInt(strTmp);
            }
            return sum;
        }
        else {
            return toInt(s);
        }

    }

    private static int toInt(String numText) throws NumberFormatException{
        return Integer.parseInt(numText);
    }
}
