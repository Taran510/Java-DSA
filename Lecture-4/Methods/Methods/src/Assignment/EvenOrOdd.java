package Assignment;

import java.util.Scanner;

public class EvenOrOdd {
    static int CheckOddEven (int a) {
        if (a % 2 == 0) {
            System.out.println( a + " is Even");
        } else {
            System.out.println( a + " is Odd");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = in.nextInt();
        CheckOddEven(a);
    }
}
