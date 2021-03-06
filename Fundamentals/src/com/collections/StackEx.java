package com.collections;

import java.util.ArrayList;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.add("D");
		s.add("E");
		s.push("F");
		System.out.println(s);
		System.out.println("peek "+s.peek());		//To return the top element without removing 
		System.out.println("pop "+s.pop());		//Will remove the top of element and return the next top of stack
		System.out.println(s);
		System.out.println("Search "+s.search("A"));	//Returns ele offset otherwise -1
		System.out.println("Search "+s.search("T"));
		
/*offset 1|___E___|4	index
	     2|___D___|3
	     3|___C___|2
	     4|___B___|1
	     5|___A___|0*/
	}

}
