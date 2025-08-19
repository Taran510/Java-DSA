package BasicAssignment;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int input;

        do {
            System.out.print("Enter a Number (0 to Stop) : ");
            input = in.nextInt();
            sum = sum + input;
        }while (input != 0);
        System.out.println("Total Sum: " + sum);
    }
}

