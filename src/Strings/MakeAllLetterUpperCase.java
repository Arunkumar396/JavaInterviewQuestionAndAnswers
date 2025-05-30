package Strings;

public class MakeAllLetterUpperCase {

	public static void main(String[] args) {
		
		String s = "Welcome";	
		String result = "";
		
		
	    char [] ch =  s.toCharArray();
	    
	      for(char c : ch) {
	    	  
	       if(c >= 'a' && c<='z') {
	    	   
	    	result  += (char)(c-32);
	    	   
	       }else {
	    	 
	    	   result  += c;
	    	   
	       }
	    	  
	      }
	      
	      System.out.println(result);

	}

}
