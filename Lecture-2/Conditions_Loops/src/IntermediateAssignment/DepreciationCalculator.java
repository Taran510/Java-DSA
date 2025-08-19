package IntermediateAssignment;

import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double value = in.nextDouble();
        System.out.print("Enter Depreciation rate (%): ");
        double rate = in.nextDouble();
        System.out.print("Enter time in years: ");
        int time = in.nextInt();

        for (int i = 0; i < time ; i++) {
            value = (rate / 100) * value;
        }

        System.out.println("Depreciated value after " + time + " years: " + value);
    }
}
