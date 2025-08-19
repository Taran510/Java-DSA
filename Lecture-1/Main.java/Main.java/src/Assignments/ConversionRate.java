package Assignments;

import java.util.Scanner;

public class ConversionRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the currency in Rupees : ");
        double rupees = input.nextDouble();
        double connversionRate = 83;   // 1 USD = 83 INR
        double usd = rupees / connversionRate;

        System.out.println("The currency in USD is : $" + usd);
    }
}
