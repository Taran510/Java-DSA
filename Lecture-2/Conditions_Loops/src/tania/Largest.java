package tania;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max= a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        int max = 0;
//        if( b < a && c < a){
//            max = a;
//        } else if (b < c) {
//            max = c;
//        } else {
//            max = b;
//        }
        int max = Math.max(c, Math.max(a,b));
        System.out.println("The Large Number is :" + max );
    }
}
