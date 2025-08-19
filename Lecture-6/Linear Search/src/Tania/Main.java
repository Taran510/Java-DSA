package Tania;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 25, 36, 41, 65, 20};
        int target = 89;
//        int ans = LinearSearch(nums, target);
        boolean ans = LinearSearch3(nums, target);
        System.out.println(ans);

    }

    // Search the target and return the element

    static int LinearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int element: arr){
            if (element == target){
                return element;
            }
        }
        // This line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
    // Search in the arrays: return the index if item found
    // otherwise if item not found return -1

    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // This line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    // Search the target and return true or false

    static boolean LinearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        for (int element: arr){
            if (element == target){
                return true;
            }
        }
        // This line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

//    Linear Search
//    Time Complexity :
//    Best Case - O(1) (Constant)
//    Worst Case - O(N) (Linear time complexity)
}