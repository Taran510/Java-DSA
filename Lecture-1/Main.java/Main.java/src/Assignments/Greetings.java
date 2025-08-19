package Assignments;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter a name :");
         System.out.println("Good Morning " + input.nextLine() + "! Have a Good Day");
    }
}
