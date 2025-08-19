package IntermediateAssignment;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int sum = 0;

        while (num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of Digits : " + sum);
    }
}
