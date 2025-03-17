package Strings;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number = 123;
		
		while(number > 0) {
			
			int rev = number % 10;
			System.out.print(rev);
			number = number / 10;
		}

	}

}
