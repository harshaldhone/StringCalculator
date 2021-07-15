package com.stringcalculator;


public class StringCalculator {
    public static void main(String[] args) {
        try{

            System.out.println(Add("a,b"));
        }catch (Exception e){
            System.out.println("Exception"+e);
        }
    }
    public static int Add(String s)  {

        if(s.isEmpty()){
            return 0;
        }
        else if(s.startsWith("//")){
            return addExp(s.substring(3),s.substring(2,3));
        }
        else if(s.contains(",")){
            return addExp(s,",");
        }
        else {
            return toInt(s);
        }
    }

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
    }

    private static int toInt(String numText) throws NumberFormatException{
        return Integer.parseInt(numText);
    }

}
