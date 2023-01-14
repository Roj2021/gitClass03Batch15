package com.syntax.review1;

public class DataTypes {

    public static void main(String[] args) {

        /* Data Types in java 1. Primitives 2. Non Primitive

        Primitive data types: byte, short, float, int, long, double, boolean, char

         numeric:
            Whole numbers: byte, short, int, int, long
            decimal numbers: float, double

            none numeric
            boolean: ture, false
            char: Single character

         */
        // dataType nameOfTheVariable= Value;
        byte num = 127;
        short num1 = 10;
        int num2 = 1; // most used
        long num3 = 1000000999999l;

        //data types for decimal values
        float number = 10.99f;
        double number2 = 100.89;

        //data type to represent single character
        char money = '$';
        char gender = 'M';

        //to represent yes or no
        boolean needBreak = true;
        boolean understandingJava = true;


        System.out.println(num1);// printing value inside variable num1=10
        System.out.println("num1");//printing a String value=num1

        //create a variable and store value into it
        boolean hungry=false;
        System.out.println(hungry);


    }
}
