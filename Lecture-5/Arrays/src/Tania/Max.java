package Tania;

public class Max {
    public static void main(String[] args) {
        int[] arr = {25, 36, 12, 23, 14};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2,4));
    }

    static int max(int[] nums){
        if(nums.length == 0){
            return -1;
        }

        int maxVal = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > maxVal){
                maxVal = nums[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] nums, int start, int end){
        if (nums == null){
            return -1;
        }

        if(end > start){
            return -1;
        }

        int maxVal = nums[start];
        for (int i = start; i < end; i++) {
            if(nums[i] > maxVal){
                maxVal = nums[i];
            }
        }
        return maxVal;
    }
}
