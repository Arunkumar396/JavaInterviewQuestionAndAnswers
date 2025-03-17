package arrays;

public class MaxLengthString {

	public static void main(String[] args) {
		
		 String[] str = {"Apple", "Mango", "fruitr", "Orange"};
		 
		 int maxLength = 0;
		 
		 for(String s : str) {
			 
			 if(s.length() > maxLength) {
				 
				 maxLength = s.length();
				 
			 }
			
		 }
		
		 System.out.println("Max Length of String:-"+maxLength);
	}

}
