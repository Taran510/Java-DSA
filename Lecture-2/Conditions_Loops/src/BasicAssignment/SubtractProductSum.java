package BasicAssignment;

import java.util.Scanner;

public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit; // sum = sum + digit;
            product *= digit; // product = product * digit;
            n = n / 10; // n /= 10;
        }

        int result = product - sum;
        System.out.println("Product - Sum = " + result);
    }
}
