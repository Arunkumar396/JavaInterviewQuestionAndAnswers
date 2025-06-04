package arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
	
		int [] arr = {1,2,4,5};
		
		int sum1 = 0;
		int sum2 = 0;
		int missingNumber = 0;
		
		// sum of element in array
		for(int i=0; i<arr.length; i++) {
			
			sum1 = sum1 + arr[i];			
		}
		// sum of range in element in array
		for(int i=1; i<=5; i++) {
			
			sum2 = sum2 + i;
		}		
		missingNumber = sum2 - sum1;
		System.out.println("Missing number :- "+ missingNumber);
	}
}
