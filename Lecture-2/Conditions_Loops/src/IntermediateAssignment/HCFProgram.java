package IntermediateAssignment;

import java.util.Scanner;

public class HCFProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 1;

        for (int i = 1; i <= Math.min(a,b) ; i++) {
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }

        System.out.println("HCF : " + hcf);
    }
}
