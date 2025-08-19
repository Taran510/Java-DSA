package Assignment;

import java.util.Scanner;

public class GradeCalculator {
    static String Grade(int num){
        if(num >= 91 && num <= 100) return "A+";
        else if (num >= 81) return "A";
        else if (num >= 71) return "B+";
        else if (num >= 61) return "B";
        else if (num >= 51) return "C";
        else if (num >= 41) return "D";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Marks(0-100): ");
        int marks = in.nextInt();
        System.out.println("Grade is: " + Grade(marks));
    }
}
