package IntermediateAssignment;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total runs: ");
        double runs = in.nextDouble();
        System.out.print("Enter number of times out: ");
        double outs = in.nextDouble();

        double avg = runs / outs;

        System.out.println("Batting Average: " + avg);
    }
}
