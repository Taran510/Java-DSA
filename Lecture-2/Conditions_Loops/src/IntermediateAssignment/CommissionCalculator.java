package IntermediateAssignment;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sales Amount: ");
        double sales = in.nextDouble();
        System.out.print("Enter Commission rate (%): ");
        double rate = in.nextDouble();

        double commission = (rate / 100 ) * sales;
        System.out.println("Commission: " + commission);
    }
}
