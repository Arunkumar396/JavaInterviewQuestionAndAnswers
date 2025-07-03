package Strings;

public class countLengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "world sle alsl sassss ";
        s = s.trim(); 
        String[] words = s.split("\\s+"); 
        
        words[words.length - 1].length();
    

	}

}
