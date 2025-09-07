class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0;
        for (int n : nums) {
            min = Math.min(min, n);
            sum += n;
        }
        return sum - min * nums.length;
    }
}

public class Q453 {
    
}
