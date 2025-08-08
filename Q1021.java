class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sr=new StringBuilder();
        int depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(depth>0) sr.append(ch);
                depth++;
            }
            else{
                depth--;
                if(depth>0) sr.append(ch);
            }
        }
        return sr.toString();
    }
}
public class Q1021 {
    
}
