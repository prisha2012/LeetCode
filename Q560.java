class Solution {
    public int subarraySum(int[] nums, int k) {
      int count=0;
      int sum=0;
      Map<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      for(int num:nums){
        sum+=num;
        if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
        }
     map.put(sum, map.getOrDefault(sum, 0) + 1);
      }
      return count;  
    }
}
public class Q560 {
    
}
