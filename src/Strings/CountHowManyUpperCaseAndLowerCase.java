package Strings;

public class CountHowManyUpperCaseAndLowerCase {

	public static void main(String[] args) {
		
		// Find out in a given string how many upper case and how many lower case characters are present

             String str = "Wellcome To India";
             int upperCaseCount = 0;
             int lowerCaseCount = 0;
             
             char[] charArray =  str.toCharArray();
             
             for(char c : charArray) {
            	 
            	 if(Character.isUpperCase(c)) {
            		 upperCaseCount++;
            	 }else {
            		 lowerCaseCount++;
            	 }
             }
             
             System.out.println("upperCaseCount:-"+upperCaseCount);
             System.out.println("lowerCaseCount:-"+lowerCaseCount);
	}

}
