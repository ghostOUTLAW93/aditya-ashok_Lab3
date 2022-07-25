package com.aditya.balancingbracket.service;
import java.util.Stack;

public class CheckBalancingBrackets {

	public boolean checkBalancedBrackets(String exp) {

		Stack<Character> stack = new Stack<Character>();

		for(int i = 0; i < exp.length(); i ++) {

			char x = exp.charAt(i);

			if(x == '(' || x == '{' || x == '[') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;

			char xPrev;

			switch(x) {

			case ')': 
				xPrev = stack.pop();
				if(xPrev == '{' || xPrev == '[')
					return false;
				break;

			case '}': 
				xPrev = stack.pop();
				if(xPrev == '(' || xPrev == '[')
					return false;
				break;

			case ']': 
				xPrev = stack.pop();
				if(xPrev == '(' || xPrev == '{')
					return false;
				break;

			}			
		}

		return(stack.isEmpty());
	}
}
