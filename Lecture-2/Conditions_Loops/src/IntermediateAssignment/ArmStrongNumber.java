package IntermediateAssignment;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum +(digit*digit*digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an ArmStrong Number."); // 153, 370, 371, 407
        } else {
            System.out.println(original + " is NOT an ArmStrong Number.");
        }
    }
}