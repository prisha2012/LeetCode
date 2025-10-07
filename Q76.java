class Solution {
    public String minWindow(String s, String t) {
       String result="";
       if(t.length()>s.length()) return result;
       int[] tcount= new int[128];
       for(char ch:t.toCharArray()){
            tcount[ch]++;
       } 
       char[] sh=s.toCharArray();
       int left=0,right=0;
       int found=0,n=t.length();
       int min=Integer.MAX_VALUE;
       while(right<s.length()){
        char c=sh[right];
        tcount[c]--;
        if(tcount[c]>=0){
            found++;
        }
        while(found==n){
            if(min>(right-left+1)){
                min=right-left+1;
                result=s.substring(left,right+1);
            }
                tcount[sh[left]]++;
                if(tcount[sh[left]]>0){
                    found--;
                }
                left++;
        }
        right++;
       }
        return result;
    }
}
public class Q76 {
    
}
