class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(current, current * maxSoFar);
            minSoFar = Math.min(current, current * minSoFar);

            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }
}

public class Q152 {
    
}
