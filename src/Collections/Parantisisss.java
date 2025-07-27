package Collections;

public class Parantisisss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "[((()))}";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				count++;
			}
			
		else if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']') {
				count--;
			}
			
		}
		
		if(count==0) {
			System.out.println("parantis equal");
		}else{
			System.out.print("not equal");
		}
		
		}
		
	}
