class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int sum1=0,max=0,r=0,l=0,window=0;
        while(r<customers.length){
            if(grumpy[r]==1){
                sum1+=customers[r];
            }
            window++;

            if(window>minutes){
                if(grumpy[l]==1){
                    sum1-=customers[l];
                }
                l++;
                window--;
            }
            max=Math.max(sum1,max);
            r++;
        }
        return max+sum;
    }
}
public class Q1052 {
    
}
