import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> freq = new HashMap<>();
        for(int n : nums) freq.put(n, freq.getOrDefault(n,0)+1);

       PriorityQueue<Map.Entry<Integer,Integer>> max=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
       max.addAll(freq.entrySet());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = max.poll().getKey();
        }
        return res;
    }
} {
    
}
