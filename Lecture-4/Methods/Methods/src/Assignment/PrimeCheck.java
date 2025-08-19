package Assignment;

import java.util.Scanner;

public class PrimeCheck {
    static void Prime(int num){
        if(num <= 1){
            System.out.println(num + " is Neither Prime nor Composite.");
            return;
        }
        int c = 2;
        while (c * c <= num){
            if(num % c == 0){
                System.out.println(num + " is Not Prime.");
                return;
            }
            c++;
        }
        System.out.println(num + " is Prime.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = in.nextInt();
        Prime(a);
    }
}
