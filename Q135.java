class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int count[]=new int[n];
        Arrays.fill(count,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
               count[i]=count[i-1]+1;
            }
            }
             for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
               count[i]=Math.max(count[i],count[i+1]+1);
            }
            }
            int candies=0;
            for(int c:count){
                candies+=c;
            }
        
        return candies;
    }
}
public class Q135 {
    
}
