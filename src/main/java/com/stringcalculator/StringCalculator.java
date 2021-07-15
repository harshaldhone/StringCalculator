package com.stringcalculator;

import java.util.List;

public class StringCalculator {
    public static void main(String[] args) {
        try{

            System.out.println(Add("a,b"));
        }catch (Exception e){
            System.out.println("Exception"+e);
        }
    }
    public static int Add(String s)  {

        int sum=0;
        if(s.isEmpty()){
            return 0;
        }
        else if(s.contains(",")){
<<<<<<< HEAD
            return addExp(s,",");
=======
            String[] tokens = s.split(",");
            for(String strTmp:tokens){
                if(strTmp.contains("\n")){
                    String[] subTokens = strTmp.split("\n"); //Tokens of Token
                    for( String Tmp:subTokens){
                        sum=sum+toInt(Tmp);
                    }
                }
                else sum=sum+toInt(strTmp);
            }
            return sum;
>>>>>>> parent of 56e96c0... Test for Delimeters and Modify Add method, add function addExp
        }
        else {
            return toInt(s);
        }

<<<<<<< HEAD
    private static int addExp(String s, String Deli)  { //Deli is delimiter
        int sum=0,Num=0;
        String[] tokens = s.split(Deli);
        for(String strTmp:tokens){
            if(strTmp.contains("\n")){
                String[] subTokens = strTmp.split("\n"); //Tokens of Token
                for( String Tmp:subTokens){
                    Num=toInt(Tmp);
                    sum= sum+Num;
                }
            }
            else sum= sum+Num;
        }

            return sum;
=======
>>>>>>> parent of 56e96c0... Test for Delimeters and Modify Add method, add function addExp
    }

    private static int toInt(String numText) throws NumberFormatException{
        return Integer.parseInt(numText);
    }
}
