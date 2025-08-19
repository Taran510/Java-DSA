package Assignment;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();

        //Print the factorial breakdown
        System.out.print(num + " ! = ");
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
            if (i != num)
                System.out.print(" * ");
        }
        System.out.print(" = " + factorial(num));
    }
}
