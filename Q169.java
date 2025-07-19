class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int c=0;
        for(int i:nums){
            if(count==0){
                c=i;
            }
            if(i==c){
                count++;
            }
            else{
                count--;
            }
        }
        return c;
    }
}
public class Q169 {
    
}
