package Assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the Principal : ");
         double principal = input.nextDouble();
         System.out.print("Enter the Time : ");
         double time = input.nextDouble();
         System.out.print("Enter the Rate : ");
         double rate = input.nextDouble();

         double SimpleInterest = (principal * time * rate) / 100;
         System.out.println("The Simple Interest is :" + SimpleInterest);
    }
}
