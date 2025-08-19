package Assignments;

import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int x = n.nextInt();
        if (x % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
