package Assignments;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        double num2 = sc.nextInt();
        System.out.print("Enter an operator(+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;

        if(operator == '+'){
            result = num1 + num2;
            System.out.println("The Result is "+ result);
        } else if(operator == '-'){
            result = num1 - num2;
            System.out.println("The Result is "+ result);
        } else if(operator == '*'){
            result = num1 * num2;
            System.out.println("The Result is "+ result);
        } else if(operator == '/'){
            result = num2 != 0 ? num1 / num2 :  0;
            System.out.println("The Result is "+ result);
        } else {
            System.out.println("Choose these operator (+, -, *, /):");
        }
    }
}
