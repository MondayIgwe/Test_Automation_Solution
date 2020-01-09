package java_Advanced;

import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Stack_Class extends java_Advanced.Vector {

	public static void main(String[] args) {
		
		try 
		{
			Stack stack = new Stack();
			
			System.out.println("stack: "+stack);
			showPush(stack, 2);
			showPush(stack, 3);
			showPop(stack);
			showPop(stack);
			showPop(stack);	
		}catch (EmptyStackException ex) {
			System.out.print("Stack is empty and it "+ex.getMessage());
		}
		
	}
	
	static void showPush(Stack stack, int a) {
		stack.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: "+stack);	
	}

	static void showPop(Stack stack) {
		System.out.println("pop ->");
		Integer a = (Integer) stack.pop();
		System.out.println(a);
		System.out.println("stack:" + stack);
	}
	
	static void checkTrue(Stack stack) {
		boolean check = stack.add(new String("Lsg"));
		stack.addElement(new Integer(1));
		
		if(stack.empty()) {
			System.out.println("Stack is Empty "+check);
		}else {
			System.out.println(check+ " Stack is Not empty ");
			System.out.println(stack.peek());
		}
		
	}
}
