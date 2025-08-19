package IntermediateAssignment;

import java.util.Scanner;

public class LCMProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int lcm = (a * b) / gcd(a,b);

        System.out.println("LCM : " + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
