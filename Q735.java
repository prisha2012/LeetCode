class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();   
        for(int nums:asteroids){
            boolean des=false;
            while(!st.isEmpty()&& nums<0&&st.peek()>0){
                if(st.peek()<-nums){
                st.pop();
                continue;
                }
                else if(st.peek()==-nums){
                    st.pop();
                }
                des=true;
                break;
            }
             if (!des) {
                st.push(nums);
            }       }
     int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}