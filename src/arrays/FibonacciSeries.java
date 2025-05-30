package arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int b=0, c=1;
		
		int n = 10;
		
		for(int i=0; i<n; i++) {
			
			int a = b + c;
			    b = c;
			    c = a;    
			 System.out.print(a+",");
		}

	}

}
