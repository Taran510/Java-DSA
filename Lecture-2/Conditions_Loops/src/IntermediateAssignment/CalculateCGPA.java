package IntermediateAssignment;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Subjects: ");
        int n = in.nextInt();
        double sum = 0;

        for (int i = 1;  i <= n ; i++) {
            System.out.print("Enter grade point for Subject " + i + " : ");
            sum = sum + in.nextDouble();
        }

        double cgpa = sum / n;

        System.out.println("CGPA: " +cgpa);
    }
}
