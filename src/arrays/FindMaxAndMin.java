package arrays;

public class FindMaxAndMin {

	public static void main(String[] args) {

     int array[] = {1,2,4,7,5,9};
     
         int max = array[0];
     
        for(int i=0; i<array.length; i++) {
        	
        	  if(array[i] > max) {
        		  
              max = array[i];
        		  
        	  }
       
        }
        
        System.out.println("Largest Number :"+max);
	
              int smallest = Integer.MAX_VALUE;
              
        for(int i=0; i<array.length; i++) {
        	
        	if(array[i] < smallest) {
        		
        		smallest = array[i];
        	}
        }

        System.out.println("Smallest Number :"+smallest);    
        
        int secondSmallest = Integer.MAX_VALUE;
        
        for(int i=0; i<array.length; i++) {
        	if(array[i]!=smallest && array[i]<secondSmallest) {
        		secondSmallest  = array[i];
        	}
        }
        System.out.println("Second Smallest Number :"+secondSmallest);   
	}

}
