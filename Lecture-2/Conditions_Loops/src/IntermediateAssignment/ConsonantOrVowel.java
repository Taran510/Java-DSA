package IntermediateAssignment;

import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = in.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
