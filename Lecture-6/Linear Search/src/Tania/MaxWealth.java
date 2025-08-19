package Tania;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
                {150, 256, 69}
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts){
        // person = rol
        // account = col;
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // When you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
