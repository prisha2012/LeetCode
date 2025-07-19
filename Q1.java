class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return null;  
        HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int c=target-nums[i];
                if(map.containsKey(c)){
                    return new int[]{map.get(c),i};

                }
                map.put(nums[i],i);
            }
            return null;
    }
}

public class Q1 {
    
}
