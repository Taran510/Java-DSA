//package Tania;
//
//public class EvenDigits {
//    public static void main(String[] args) {
//        int[] nums = {12, 345, 2, 6, 7896, 36985, 1452, 987463};
////        System.out.println(findNumbers(nums));
//
//        System.out.println(digit(-1450560));
//    }
//    static int findNumbers(int[] nums){
//        int count = 0;
//        for (int num : nums){
//            if (even(num)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // Function to check whether a number contains even digits or not
//    static boolean even(int num){
//        int numberOfDigits = digit(num);
//        /*
//            if (numberOfDigits % 2 == 0){
//                return true;
//            }
//            return false;
//         */
//        return numberOfDigits % 2 == 0;
//    }
//
//    static int digits2(int num){
//        return (int) (Math.log10(num)) + 1;
//    }
//
//    static int digit(int num){
//
//        if (num < 0){
//            num = num * -1;
//        }
//
//        if (num == 0){
//            return 1;
//        }
//
//        int count = 0 ;
//        while (num > 0){
//            count++;
//            num = num / 10;
//        }
//        return count;
//    }
//
//}







package Tania;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 14, 2, 654, 75698, 13, 369852, 4562};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])){
                count ++;
            }
        }

        return count;
    }

//        for (int num : nums) {
//            if (even(num)) {
//                count++;
//            }
//        }
//        return count;
//    }

    static boolean even(int nums){
        int numberOfdigits = digit(nums);
        if (numberOfdigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digit(int nums) {
        if (nums < 0){
             return -1;
        }

        if (nums == 0){
            return 1;
        }

        int count = 0;
        while (nums > 0){
            count++;
            nums = nums / 10;
        }
        return count;
    }
}




























