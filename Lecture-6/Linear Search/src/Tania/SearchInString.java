package Tania;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Tania";
        char taget = 'i';
      //  System.out.println(Search(name, taget));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean Search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }

    static boolean Search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
