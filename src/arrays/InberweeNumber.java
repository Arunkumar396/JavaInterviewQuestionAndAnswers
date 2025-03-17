package arrays;

public class InberweeNumber {

	public static void main(String[] args) {
		
		InbetweenNumber();

	}
	
	public static void InbetweenNumber() {
		
		int [] a = {1,2,3,4,5,6};
		
		int [] b = {2,3,7,8,9};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<b.length; j++) {
				
				if(a[i]==b[j]) {
				System.out.println("Common arrays :"+b[j]);
				}
			}
		}
	}
}
