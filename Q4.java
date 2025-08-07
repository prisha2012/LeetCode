class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] nums=new int[m+n];
        int i=0;
        for(int num:nums1){
            nums[i++]=num;
        }
           for(int num:nums2){
            nums[i++]=num;
        }
        Arrays.sort(nums);

        int l=nums.length;

        if(l%2==1){
            return nums[l/2];
        }
        else{
            return (nums[l/2-1]+nums[l/2])/2.0;
        }
    }
}
public class Q4 {
    
}
