package Strings;

public class MakeAllWordsFirstLetterCapital {

	public static void main(String[] args) {
		
// welcome to SG testing institute, extract 'SG testing Institute' & make first letter of every word is UpperCase

		String inPut = "welcome to SG testing institute";
		
		     String output1 = inPut.substring(11);
		     String[] output2 =   output1.split(" ");		     
		     StringBuilder result = new StringBuilder();
		     for(String word : output2) {
		    	 	    	 
		    	result.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");		    	 
		     }		         
		   System.out.println(result.toString());
	   }
   }
