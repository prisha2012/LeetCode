class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2, need = 1, curr = 0;
            for (int w : weights) {
                if (curr + w > mid) {
                    need++;
                    curr = 0;
                }
                curr += w;
            }
            if (need <= days)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}

public class Q1011 {
    
}
