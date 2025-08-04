class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) return -1;
        int low = 1, high = 0;
        for (int day : bloomDay) high = Math.max(high, day);
        while (low < high) {
            int mid = (low + high) / 2;
            if (canMake(bloomDay, m, k, mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}

public class Q1482 {
    
}
