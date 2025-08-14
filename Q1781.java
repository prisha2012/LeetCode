class Solution {
    public int beautySum(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[] cnt=new int[26];
            for(int j=i;j<n;j++){
                cnt[s.charAt(j)-'a']++;
                int mx=0,mn=Integer.MAX_VALUE;
                for(int v:cnt){
                    if(v>0){
                        mx=Math.max(mx,v);
                        mn=Math.min(mn,v);
                    }
                }
                ans+=mx-mn;
            }
        }
        return ans;
    }
}
public class Q1781 {
    
}
