package com.crio.qcalc;

public class StandardCalculator {

    private double result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    

    public double getResult(){
        return result;
    }
    

    public void clearResult(){
        this.result = 0;
    }

    public void printResult(){
        System.out.println("Standard Calculator Result :"+result);
    }


    public void add(double num1, double num2){

        double result = num1 + num2;
        if((result == Double.MAX_VALUE)|| (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    

    public void subtract(double num1, double num2){
        
       double result = num1 - num2;
       if((result == -Double.MAX_VALUE)||(result == Double.NEGATIVE_INFINITY)){
           throw new ArithmeticException("Double Overflow");
       }
        this.result = result;
    }


    public void multiply(double num1, double num2){
         result = num1*num2;
    }


    public void divide(double num1, double num2){
        result = num1/num2;
    }


     //add
    public void  add(int num1, int num2){
        add((double)num1, (double)num2);
       // result = num1+num2;
        //return sum;
    }

     //Subtract
    public void subtract(int num1, int num2){
         //int difference;
         subtract((double)num1, (double)num2);
        // result = num1 - num2;
        //return difference;
    }

     //Multiply
    public void multiply(int num1, int num2){
        //int product;
        multiply((double)num1, (double)num2);
        // result = num1 * num2;
       // return product;
    }

     //Divide
     public void divide(int num1, int num2){
     //  int quotient;
     divide((double)num1, (double)num2);
     //result = num1/num2;
     //   return quotient;
     }



     }
