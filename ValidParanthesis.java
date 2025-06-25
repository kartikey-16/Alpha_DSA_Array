package in.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

	public boolean isValidParanthesis(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else if(!stack.empty() && ch == ')' && stack.peek() == '(')
			{
				stack.pop();
			}else if(!stack.empty() && ch == '}' && stack.peek() == '{')
			{
				stack.pop();
			}else if(!stack.empty() && ch == ']' && stack.peek() == '[')
			{
				stack.pop();
			}
			else
			{
				return false;
			}
		}
		return stack.empty();
	}
	
	public static void main(String[] args)
	{
		ValidParanthesis validParanthesis = new ValidParanthesis();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string of brackets to check it is valid patrtanthesis or not");
		String s = sc.next();
		
		System.out.println("Opening and closing of paranthesis " + s + " is: "+ validParanthesis.isValidParanthesis(s));
		sc.close();
	}
}
