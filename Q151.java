class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] ab=s.split("\\s+");
        StringBuilder st=new StringBuilder();
        for(int i=ab.length-1;i>=0;i--){
            st.append(ab[i]);
            if(i!=0){
                st.append(" ");
            }
        }
        return st.toString();
    }
}
public class Q151 {
    
}
