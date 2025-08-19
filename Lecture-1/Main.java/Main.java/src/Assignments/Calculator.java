package Assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.print("Enter first number : ");
          int num1 = input.nextInt();
          System.out.print("Enter Second number : ");
          int num2 = input.nextInt();
          System.out.print("Enter an operator : ");
          String operator = input.next();

          if (operator.equals("+")) {
               int sum = num1 + num2;
               System.out.println("The sum is: " + sum);
          } else if (operator.equals("-") ) {
               int diff = num1 - num2;
               System.out.println("The difference is: " + diff);
          } else  if (operator.equals("*") ) {
               int mul = num1 * num2;
               System.out.println("The multiply of two numbers: " + mul);
          } else  if (operator.equals("/") ) {
               int result = num2 != 0 ? num1 / num2 : 0 ;
               System.out.println("The division is : " + result);
          } else {
               System.out.println("This is not a suitable operator");
          }
    }
}
