class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int i=0,j=m-1;
        while(i<=j){
            int mid=(i+j)/2;
            int max=0;
            for(int a=0;a<n;a++){
                if(mat[a][mid]>mat[max][mid]){
                    max=a;
                }
            }

            boolean left=mid-1>=0 && mat[max][mid-1]>mat[max][mid];
             boolean right=mid+1<m && mat[max][mid+1]>mat[max][mid];

             if(!left && !right) return new int[]{max,mid};
             else if(right) i=mid+1;
             else j=mid-1;
        }
        return new int[]{-1, -1};
    }
}
public class Q1901 {
    
}
