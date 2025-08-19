package BasicAssignment;

import java.util.Scanner;

public class AreaAssignment {
    public static void main(String[] args) {
        // Area of a Circle
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Radius :");
//        double radius = in.nextDouble();
//        double area = Math.PI * radius * radius;
//        System.out.println("Area of Circle is :" + area);

        // Area of Triangle

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Base of Triangle :");
//        double base = in.nextDouble();
//        System.out.println("Enter the Height of Triangle :");
//        double height = in.nextDouble();
//        double area = 0.5 * base * height;
//        System.out.println("The Area of a Triangle is :" + area);

        // Area of Rectangle

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Length of Rectangle :");
//        double length = in.nextDouble();
//        System.out.println("Enter the Width of Rectangle :");
//        double width = in.nextDouble();
//        double area = length * width;
//        System.out.println("The Area of Rectangle is : " + area);

        // Area of Isosceles Triangle

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Base of Isosceles Triangle :");
//        double base = in.nextDouble();
//        System.out.println("Enter the Height of Isosceles Triangle :");
//        double height = in.nextDouble();
//        double area = 0.5 * base * height;
//        System.out.println("The Area of a Isosceles Triangle is :" + area);

        // Area of Parallelogram

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Base :");
//        double base = in.nextDouble();
//        System.out.println("Enter the Height :");
//        double height = in.nextDouble();
//        double area = base * height;
//        System.out.println("Area of Parallelogram is :" + area);

        // Area of Rhombus

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the diagonal 1 :");
//        double d1 = in.nextDouble();
//        System.out.println("Enter the diagonal 2 :");
//        double d2 = in.nextDouble();
//        double area = 0.5 * d1 * d2;
//        System.out.println("Area of Rhombus is :" + area);

        // Area of Equilateral Triangle

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side :");
        double side = in.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilateral Triangle is : " + area);

    }
}
