package IntermediateAssignment;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        System.out.print("Enter r : ");
        int r = in.nextInt();

        int ncr = factorial(n) / ( factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);

        System.out.println("NCR = " + ncr);
        System.out.println("NPR = " + npr);
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
