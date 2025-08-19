package Assignment;

import java.util.Scanner;

public class Palindrome {
    static int palindrome(int num){
        int original = num;
        int rev = 0;

        while (num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (original == rev){
            System.out.println(original + " is an Palindrome Number.");
        } else {
            System.out.println(original + " is NOT an Palindrome Number.");
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        palindrome(n);
    }
}