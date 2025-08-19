package Assignment;

import java.util.Scanner;

public class MInMax {
    static int max(int a, int b, int c){
        int max = a;
        if(b < max){
            max = b;
        }
        if (c < max){
            max = c;
        }
        return max;
//        return Math.max(a, Math.max(b,c))
    }

    static int min(int a, int b, int c){
        int min = a;
        if(b > min){
            min = b;
        }
        if (c > min){
            min = c;
        }
        return min;
//        return Math.min(a, Math.min(b,c))
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("Maximum: " + max(a,b,c));
        System.out.println("Minimum: " + min(a,b,c));
    }
}