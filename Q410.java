class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(canSplit(nums,k,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    private boolean canSplit(int[] nums,int k,int maxsum){
        int count=1,currentSum=0;
        for(int num:nums){
            if(currentSum+num>maxsum){
                count++;
                currentSum=num;
                if(count>k) return false;
            }
            else{
                currentSum+=num;
            }
        }
        return true;
    }
}
public class Q410 {
    
}
