package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class MergerTwoList {

	public static void main(String[] args) {
		
		List <String> olist1 = new ArrayList<>(Arrays.asList("Apple", "Ball", "cat"));

		List <String> olist2 = new ArrayList<>(Arrays.asList("Apple", "balun", "good"));

		Set <String> olsit = new HashSet<>();
		
		olsit.addAll(olist1);
		olsit.addAll(olist2);
		
		System.out.println(olsit);
		
	}

}
