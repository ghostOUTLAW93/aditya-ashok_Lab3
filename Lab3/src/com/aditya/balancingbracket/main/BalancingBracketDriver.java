package com.aditya.balancingbracket.main;
import com.aditya.balancingbracket.service.CheckBalancingBrackets;

public class BalancingBracketDriver {

	public static void main(String[] args) {

		CheckBalancingBrackets checkBrackets = new CheckBalancingBrackets();

		String expression = "({}))";

		if(checkBrackets.checkBalancedBrackets(expression))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String do not contain Balanced Bracket");

	}

}
