package my.com.leetcode;

import java.util.Stack;

class MinStackI {

    /** initialize your data structure here. */
	Stack<Integer> sStack= new Stack<Integer>();
	Stack<Integer> minStack= new Stack<Integer>();
	
   
    
    public void push(int x) {
    	if(minStack.isEmpty() || x<=minStack.peek())
    		minStack.push(x);
    	
        sStack.push(x);
    }
    
    public void pop() {
    	
    	if(minStack.peek()==sStack.peek())
    		minStack.pop();
        sStack.pop();
    }
    
    public int top() {
    	return sStack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStackI obj = new MinStackI();
		  obj.push(0);
		  obj.push(1);
		  obj.push(2);
		  obj.push(3);
		  obj.pop();
		  int param_3 = obj.top();
		  int param_4 = obj.getMin();
		  
		  System.out.println(param_3);
		  System.out.println(param_4);

	}

}
