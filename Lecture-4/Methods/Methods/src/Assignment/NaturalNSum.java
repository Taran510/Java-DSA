package Assignment;

import java.util.Scanner;

public class NaturalNSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = in.nextInt();
        Sum(n);
    }

     static void Sum(int n) {
//        int sum = n * (n + 1) / 2;
         int sum = 0;
         for (int i = 1; i <= n; i++) {
             sum = sum + i;
         }
         System.out.println("Sum of First " + n + " Natural Numbers: " + sum);
    }
}
