package arrays;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
	
		int [] a = { 1,2,4,5,6};
		int [] b = {1,3,4,5,6};
		
		int [] c = new int[a.length + b.length];
		
		for(int i=0; i<a.length; i++) {
			
			       c[i]  = a[i];
		}
		
		for(int i=0; i<a.length; i++) {
			
		       c[a.length + i]  = a[i];
	}
		System.out.println(Arrays.toString(c));

	}

}
