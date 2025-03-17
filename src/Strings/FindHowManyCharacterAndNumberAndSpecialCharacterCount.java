package Strings;

public class FindHowManyCharacterAndNumberAndSpecialCharacterCount {

	public static void main(String[] args) {
		
		// Find of how many character & numbers are present in the given string
		
		String str = "Wlecome123@#$";
	    String alpa = "";	
	    int alpacount = 0;
	    int num = 0;	
	    int numcount = 0;
	    String specl = "";	
	    int speclcount = 0;
	    
	    for(int i=0; i<str.length(); i++) {
	    	if(Character.isAlphabetic(str.charAt(i))) {
	    		alpa  +=  str.charAt(i);
	    		alpacount++;
	    	}else if(Character.isDigit(str.charAt(i))) {
	    		num  +=  str.charAt(i);
	    		numcount++;
	    }else {
	    	specl  +=  str.charAt(i);
	    	speclcount++;
	    }
	}
	    
	    System.out.println("Alpha :-"+alpa+ "Alpha Count:-"+alpacount);
	    System.out.println("Digit :-"+num+ " Digit Count:-"+numcount);
	    System.out.println("Special :-"+specl+ " Special Count:-"+speclcount);
}
	
}	
