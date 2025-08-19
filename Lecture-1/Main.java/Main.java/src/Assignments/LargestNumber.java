package Assignments;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("The largest number is :" + num1);
        } else {
            System.out.println("The largest number is :" + num2);
        }
    }
}
