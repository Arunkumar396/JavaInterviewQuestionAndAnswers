package Strings;

public class DisplayStringAsUpperCaseAndLowerCaseAlternatively {

	public static void main(String[] args) {

		// WAP to display the given String as upper case & lower case alternatively

		String str1 = "WellCome To iNdia";
		String output = "";

		String str = str1.replace(" ", "");

		for (int i = 0; i < str.length(); i++) {

			if ((i % 2) == 0) {
				output += String.valueOf(str.charAt(i)).toUpperCase();
			} else {
				output += String.valueOf(str.charAt(i)).toLowerCase();
			}

		}

		System.out.println(output);

	}

}
