package IntermediateAssignment;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Investment Amount: ");
        double amount = in.nextDouble();
        System.out.print("Enter Annual Interest Rate(%): ");
        double rate = in.nextDouble();
        System.out.print("Enter Number of Years: ");
        int years = in.nextInt();

        double futureInvestment = amount * Math.pow(1 + (rate / 100), years);
        System.out.println("Future Investment value is :" + futureInvestment);
    }
}
