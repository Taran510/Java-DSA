package BasicAssignment;

import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Factors of " + n + " are : ");
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
