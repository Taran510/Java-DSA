package tania;

import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: Take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter First Number:");
        num1 = in.nextInt();
        System.out.println("Enter Second Number:");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is:" + sum);
    }
}