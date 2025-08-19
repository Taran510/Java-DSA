package Assignment;

import java.util.Scanner;

public class PythagoreanTriplet {

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        int x = Math.max(a, Math.max(b,c));
        int y,z;
        if (x == a){
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }
        return x * x == y * y + z * z;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("It is a Pythagorean Triplet.");
        } else {
            System.out.println("It is not a Pythagorean Triplet.");
        }
    }
}
