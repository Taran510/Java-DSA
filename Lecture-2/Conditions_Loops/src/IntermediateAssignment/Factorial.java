package IntermediateAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
