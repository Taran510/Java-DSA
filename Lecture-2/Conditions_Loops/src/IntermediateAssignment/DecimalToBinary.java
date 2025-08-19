package IntermediateAssignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int decimal = in.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary Value: " + binary);
    }
}
