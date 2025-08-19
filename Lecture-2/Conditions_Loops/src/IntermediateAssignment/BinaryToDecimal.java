package IntermediateAssignment;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        String binary = in.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal Value: " + decimal);
    }
}
