package IntermediateAssignment;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = in.nextInt();
        System.out.print("Enter Component: ");
        int component = in.nextInt();

        double result = Math.pow(base, component);
        System.out.println("Result: " + result);
    }
}
