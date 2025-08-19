package IntermediateAssignment;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int n = in.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + " : ");
            sum = sum + in.nextDouble();
        }

        double average = sum / n;
        System.out.println("Average: " + average);
    }
}
