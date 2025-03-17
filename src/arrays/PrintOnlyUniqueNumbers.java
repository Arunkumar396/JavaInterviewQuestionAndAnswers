package arrays;

public class PrintOnlyUniqueNumbers {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 3, 4};
        
           for(int i=0; i<array.length; i++) {
        	   
        	   boolean isQuniq = true;
        	   
        	   for(int j=0; j<array.length; j++) {
        		   
        		   if(i!=j && array[i]==array[j]) {
        			   
        			   isQuniq = false;
        			   break;
        			   
        		   }
        	   }
        	   
        	   if(isQuniq) {
        		System.out.println("Uniq Number:-"+array[i]);   
        	   }
           }
    }
}
