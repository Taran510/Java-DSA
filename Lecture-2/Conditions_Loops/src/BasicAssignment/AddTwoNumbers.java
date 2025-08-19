package BasicAssignment;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println("The Addition of Two Numbers : " + sum);
    }
}
