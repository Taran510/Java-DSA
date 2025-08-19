package Assignment.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationsArray {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
        int[] arr = {0, 2, 1, 5, 3, 4};
//        int[] arr = {0, 4, 2, 3, 1};
         arr = buildArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
