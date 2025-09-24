import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
            if (set.size() > 3) set.remove(Collections.min(set));
        }
        if (set.size() == 3) return Collections.min(set);
        return Collections.max(set);
    }
}

public class Q414 {
    
}
