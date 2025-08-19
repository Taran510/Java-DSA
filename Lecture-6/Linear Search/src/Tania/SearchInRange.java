package Tania;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {2, 25, 36, 41, 65, 20};
        int target = 41;
        int ans = LinearSearch(nums, target, 2, 4);
        System.out.println(ans);

    }

    static int LinearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // This line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
