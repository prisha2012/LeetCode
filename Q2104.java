class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long totalMax = 0, totalMin = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] < nums[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                totalMax += (long) nums[mid] * (i - mid) * (mid - left);
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                totalMin += (long) nums[mid] * (i - mid) * (mid - left);
            }
            stack.push(i);
        }

        return totalMax - totalMin;
    }
}

public class Q2104 {
    
}
