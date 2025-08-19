package Assignment;

import java.util.Scanner;

public class Circle {
    static double circumference(double r){
        double circumference = 2 * Math.PI * r;
        return circumference;
    }

    static double area(double r){
        double area = Math.PI * r * r;
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double r = in.nextInt();
        System.out.println("Circumference of the Circle is: " + circumference(r));
        System.out.println("Area of the Circle is: " + area(r));
    }
}
