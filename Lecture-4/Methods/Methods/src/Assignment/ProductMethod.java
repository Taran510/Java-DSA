package Assignment;

import java.util.Scanner;

public class ProductMethod {
    static int product(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();
        System.out.println("Product is : " + product(a,b));
    }
}
