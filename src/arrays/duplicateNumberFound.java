package arrays;

public class duplicateNumberFound {

	public static void main(String[] args) {
		
		int num = 12474;
		int count = 0;
		int digit = 0;
		
		while(num > 0) {
			
			digit = num % 10;
			
			if(digit==4) {
				count++;
			}
			
			num /= 10;
			
		}
		
		System.out.print(count);

	}

	
}
