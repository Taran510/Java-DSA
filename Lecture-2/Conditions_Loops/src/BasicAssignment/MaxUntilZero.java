package BasicAssignment;

import java.util.Scanner;

public class MaxUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int input;

        do {
            System.out.print("Enter an Integer (0 to Stop): ");
            input = in.nextInt();
            if (input > max && input != 0){
                max = input;
            }
        } while (input != 0);

        System.out.println("Largest Number Entered : " + max);
    }
}