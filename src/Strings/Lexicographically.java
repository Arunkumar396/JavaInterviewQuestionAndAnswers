package Strings;

public class Lexicographically {

    public static void main(String[] args) {
           	
    	String s = "avakjasldlaskwel";
    	int k =3;
 
    	 String smallest = s.substring(0, k);
         String largest = s.substring(0, k);

         for (int i = 1; i <= s.length() - k; i++) {
             String sub = s.substring(i, i + k);
             if (sub.compareTo(smallest) < 0) {
                 smallest = sub;
             }
             if (sub.compareTo(largest) > 0) {
                 largest = sub;
             }
         }

         System.out.println(smallest + "\n" + largest);
     }
}