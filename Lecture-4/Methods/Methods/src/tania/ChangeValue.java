package tania;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {1, 3, 5, 4, 2};
        //Pass by the copy of reference
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        nums[0]= 99; // If you make a change to the object via this reference variable, same object will be change.
    }
}
// In java , we don't have pointers