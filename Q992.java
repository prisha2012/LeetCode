class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
      return atMost(nums,k)-atMost(nums,k-1);

    }
    private int atMost(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0,left=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;

            }
            count+=(-left+right+1);
        }
        return count;
    }
}