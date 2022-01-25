package com.james.jenkinspipelines;


public class Main {


    public static void main(String[] args) {

        System.out.println("Sum: " + sumOfNumbers(5,8));
        System.out.println("Subtract: " + subtractOfNumbers(5,8));
        System.out.println("Multiply: " + multiplyOfNumbers(5,8));
        System.out.println("Divide: " + divideOfNumbers(50,8));



    }

    public static int sumOfNumbers(int num1, int num2){
            return num1 + num2;
    }

    public static int subtractOfNumbers(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplyOfNumbers(int num1, int num2){
        return num1 * num2;
    }

    public static double divideOfNumbers(int num1, int num2){
        return num1 / num2;
    }



}
