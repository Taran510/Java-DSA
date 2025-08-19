package tania;

public class Loops {
    public static void main(String[] args) {
        // loop:
        /*
            Syntax of for loop:

            for (initialization; condition; increment/decrement){
                // body
            }
         */
        // Q: Print numbers from 1 to 5

//        for (int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }

        //print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the value of n : ");
//        int n = in.nextInt();
//
//        for (int i = 1 ; i <= n; i++){
//            System.out.print(i + " ");
//        }

        // While loop

        /* Syntax
            while (condition) {
                // body
            }
         */

        int num = 1;
        while (num <= 5){
//            System.out.println(num);
            num +=1; // num++;
        }

        // do - while

        /*
            Syntax :
                do {
                    // body
                } while (condition) {
                    // body
                }
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
