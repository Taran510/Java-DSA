package IntermediateAssignment;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Subjects: ");
        int n = in.nextInt();
        double sum = 0;

        for (int i = 1;  i <= n ; i++) {
            System.out.print("Enter marks for Subject " + i + " : ");
            sum = sum + in.nextDouble();
        }

        double average = sum / n;

        System.out.println("Average Marks: " +average);
    }
}
