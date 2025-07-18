class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxcount=0;
        for(int i:nums){
            if(i==1){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else{
                count=0;
            }
        }
        return maxcount;
    }
}
public class Q485 {
    
}
