public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index=1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
} 
public class Q26{
    public static void main(String[] args) {
        
    }
}