package in.ineuron.recursive;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
        // Adding elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
	}

	private static void reverseStack(Stack<Integer> stack) {
		 if (!stack.isEmpty()) {
	            // Remove the top element
	            int top = stack.pop();
	            // Reverse the remaining stack
	            reverseStack(stack);
	            // Insert the removed element at the bottom
	            insertAtBottom(stack, top);
	        }
	}

	private static void insertAtBottom(Stack<Integer> stack, int item) {
		if(stack.isEmpty()) {
			stack.push(item);
		}
		else {
			int top=stack.pop();
			insertAtBottom(stack, item);
			stack.push(top);
		}
		
	}

}
