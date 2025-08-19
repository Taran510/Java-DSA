package Assignment;

import java.util.Scanner;

public class SumMethod {
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();
        System.out.println("Sum is : " + sum(a,b));
    }
}
