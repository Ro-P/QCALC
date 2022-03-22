package com.crio.qcalc;

public class StandardCalculator {

    private int result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    

    public int getResult(){
        return result;
    }
    

    public void clearResult(){
        this.result = 0;
    }

    public void printResult(){
        System.out.println("Standard Calculator Result :"+result);
    }

     //add
    public void  add(int num1, int num2){
        result = num1+num2;
        //return sum;
    }

     //Subtract
    public void subtract(int num1, int num2){
         //int difference;
         result = num1 - num2;
        //return difference;
    }

     //Multiply
    public void multiply(int num1, int num2){
        //int product;
        result = num1 * num2;
       // return product;
    }

     //Divide
     public void divide(int num1, int num2){
     //  int quotient;
     result = num1/num2;
     //   return quotient;
     }



     }
