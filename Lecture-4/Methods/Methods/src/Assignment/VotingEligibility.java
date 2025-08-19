package Assignment;

import java.util.Scanner;

public class VotingEligibility {
    static int isEligible(int age){
        if (age >= 18){
            System.out.println("You Are Eligible.");
        } else {
            System.out.println("You Are Not Eligible.");
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = in.nextInt();
        isEligible(age);
    }
}