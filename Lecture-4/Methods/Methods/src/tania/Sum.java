package tania;

import java.lang.String;
import java.util.Scanner;

public class Sum {
    public static void main (String[] args) {
//        int ans = sum2();
//        System.out.println("The sum is:" + ans);

        int ans = sum3(6, 5);
        System.out.println(ans);
    }

    // pass the value of numbers you are calling the method in main()

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    //Return the value

    static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter First Number:");
        num1 = in.nextInt();
        System.out.println("Enter Second Number:");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter First Number:");
        num1 = in.nextInt();
        System.out.println("Enter Second Number:");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is:" + sum);
    }

    /*
        Syntax of a Methods:
            access modifier (we'll look in OOP) return_type name() {
                // body
                return statement
            }
     */
}
