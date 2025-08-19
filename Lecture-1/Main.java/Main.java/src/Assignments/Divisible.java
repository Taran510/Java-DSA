import java.util.Scanner;

public class Divisible {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a Number: ");
          int x = input.nextInt();

          for ( x = 0; x <= 50; x++){
          if(x % 2 == 0 && x % 3 == 0 && x % 4 == 0 && x % 5 == 0 ){
               System.out.println( x + ": This is divisible by all 2,3,4,5");
          } else if(x % 2 == 0 && x % 3 == 0 && x % 4 == 0 ){
               System.out.println( x + ": This is divisible by all 2,3,4");
          } else if( x % 2 == 0 && x % 3 == 0 && x % 5 == 0){
               System.out.println( x + ": This is divisible by all 2,3,5");
          } else if(x % 3 == 0  && x % 4 == 0 && x % 5 == 0){
               System.out.println( x + ": This is divisible by all 3,4,5");
          } else if(x % 2 == 0 && x % 3 == 0){
               System.out.println( x + ": This is divisible by both 2 and 3");
          } else if(x % 2 == 0 && x % 4 == 0){
               System.out.println( x + ": This is divisible by both 2 and 4");
          } else if(x % 3 == 0 && x % 4 == 0){
               System.out.println( x + ": This is divisible by both 3 and 4");
          } else if(x % 4 == 0 && x % 5 == 0){
               System.out.println( x + ": This is divisible by both 4 and 5");
          } else if(x % 2 == 0 && x % 5 == 0){
               System.out.println( x + ": This is divisible by both 2 and 5");
          } else if(x % 2 == 0){
               System.out.println( x + ": This is visible by 2");
          } else if(x % 3 == 0) {
               System.out.println( x + ": This is visible by 3");
          } else if(x % 4 == 0){
               System.out.println( x + ": This is visible by 4");
          } else if(x % 5 == 0) {
               System.out.println( x + ": This is visible by 5");
          } else {
               System.out.println( x + ": This is a prime number, not divisible by any number");
          }
          }
     }
}


