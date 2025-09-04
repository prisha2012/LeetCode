class MinStack {
    
  private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        mainStack.push(val);
        int curr=minStack.peek();
        minStack.push(Math.min(val,curr));
    }
    
    public void pop() {
           mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
                return mainStack.peek();
    }
    
    public int getMin() {
          return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */