class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        
        for(char a:s.toCharArray()){
            if(a=='('||a=='{'||a == '['){
                st.push(a);
            }
            else{
                 if (st.isEmpty()) return false; 
                int top=st.pop();
                if((a == ')' && top != '(') ||
                    (a == '}' && top != '{') ||
                    (a == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
public class Q20 {
    
}
