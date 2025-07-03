package Collections;

import java.util.Stack;

public class checkParantisis {
	
	public boolean parantisis(String s) {
		
		int n = s.length();
		
		if((n % 2) != 0) return false;
		Stack <Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
		
		 if(c =='(') stack.push(')');
		 else if (c == '{') stack.push('}');
		 else if (c == '[') stack.push(']');
		 else if (stack.isEmpty() || stack.pop()!= c) return false;

	 }
		return stack.isEmpty();
	}		

	public static void main(String[] args) {
		
		checkParantisis c = new checkParantisis();
		boolean result = c.parantisis("(())");
		if(result) {
		System.out.println("parantisis are equal");	
		}else {
			System.out.println("parantisis are not equal");		
		}
	}

}
