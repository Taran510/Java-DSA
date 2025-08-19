package Assignment;

import java.util.Scanner;

public class PrimeInRange {
    static boolean Prime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static void PrintPrime(int start, int end){
        for (int i = start; i <= end ; i++) {
            if(Prime(i)) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int a = in.nextInt();
        System.out.print("Enter Ending Number: ");
        int b = in.nextInt();
        System.out.print("Prime Numbers: ");
        PrintPrime(a, b);
    }
}


