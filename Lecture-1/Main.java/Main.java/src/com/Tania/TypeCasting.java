package com.Tania;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //Type Casting
//        int num = (int)(25.36);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int num = 'A';
//        System.out.println(num);

//        Java follows unicode
//        System.out.println("hhfhjdh");
//
//        Rules for Types Promotion:
//        All the byte, short and character values are promoted to integer
//        If Any one of the operand is long, the whole operation is prompted to long. If it is float, entire will be converted into float.

//        System.out.println(3 *14.365236521452);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.79f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c)  + " " + (d - s));
        System.out.println(result);
    }
}
