package Strings;

public class ReverseTheWord {
	
	public static void main(String[] args) {
		// Reverse each words in a given string without using .reverse() method
		
		String str = "My Country India";
	    String revWord = "";
	    
		String [] revword = str.split(" ");  
		for(String word : revword) {
			String rev = "";
			for(int i=word.length()-1; i>=0; i--) {
				rev += word.charAt(i);
			}
			      revWord += rev+ " ";
		}
		
		System.out.println(revWord);
		
	}

}
