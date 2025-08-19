package IntermediateAssignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int original = num;
        int reversed = 0;

        while (num > 0){
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }

        if (original == reversed){
            System.out.println(original + " is an Palindrome Number.");
        } else {
            System.out.println(original + " is NOT an Palindrome Number.");
        }
    }
}
