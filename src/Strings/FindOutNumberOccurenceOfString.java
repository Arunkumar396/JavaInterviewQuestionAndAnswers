package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindOutNumberOccurenceOfString {

	public static void main(String[] args) {
	
		String str = "Well Come To my home";
		
	    char[] strArray = str.toCharArray(); 
	  
	    Map<Character, Integer> charCount = new HashMap<>();
   	    
	    for(char c : strArray) {
	    	
	      if(!String.valueOf(c).isBlank()) {
	    	  
	      if(charCount.containsKey(c)) {
	    	  
	    	  charCount.put(c, charCount.get(c)+1);
	      }else {
	    	  charCount.put(c, 1);
	      }
	    	
	    }

	  }
	    
	    char maxChar = strArray[0];
	    int maxcount = 0;
	 for(Map.Entry<Character, Integer> enteryset : charCount.entrySet()) {
		 
		  if(enteryset.getValue() > 0) {
			  maxChar  = enteryset.getKey();
			  maxcount = enteryset.getValue();
		  }
		 
	 }
	 System.out.println(charCount);
	 System.out.println("max char:-"+maxChar+" max char count:-"+maxcount);
	    
	}
	

}
