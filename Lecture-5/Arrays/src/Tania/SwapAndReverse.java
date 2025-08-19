package Tania;

import java.util.Arrays;

public class SwapAndReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        swap(arr, 1, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
