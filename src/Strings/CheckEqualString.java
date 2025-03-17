package Strings;

import java.util.Arrays;

public class CheckEqualString {

	public static void main(String[] args) {
		// find out both the strings are same (a="welcome" b="emowecl")

		String a = "wellcome";
		String b = "emowecll";

		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();

		if (a.length() == b.length()) {

			Arrays.sort(charA);
			Arrays.sort(charB);

			if (Arrays.equals(charA, charB)) {
				System.out.println("Both String are same");
			} else {
				System.out.println("Both String are not same");
			}

		} else {
			System.out.println("Both String length are not same");
		}

	}

}
