package IntermediateAssignment;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double price = in.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = in.nextDouble();

        double discountAmount = price * discount / 100;
        double finalPrice = price - discountAmount;

        System.out.println("Discounted Price: " + finalPrice);
    }
}
