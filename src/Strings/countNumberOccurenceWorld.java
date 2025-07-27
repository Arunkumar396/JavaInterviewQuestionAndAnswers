package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class countNumberOccurenceWorld {

	public static void main(String[] args) {
		
		String s = "i love java i love java";
		
		String [] str = s.split(" ");
		
		Map <String, Integer> omap = new HashMap<>();
		
		for(String sc : str) {
			
			if(omap.containsKey(sc)) {
				
				omap.put(sc, omap.get(sc)+1);
				
			}else {
				omap.put(sc,1);
			}			
		}
		String c = "";
		int count = 0;
		for(Map.Entry<String, Integer>   entry : omap.entrySet()){
		                		  
		  	if(entry.getValue() > 0) {
		  		c = entry.getKey();
		  		count  = entry.getValue();
		  	}		 		
		System.out.println(c +"=="+count); 		
     }	
	}
}
