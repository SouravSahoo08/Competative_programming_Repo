package codeVita;

public class GFG {

	static boolean areRotations(String str1, String str2) {
		// There lengths must be same and str2 must be
		// a substring of str1 concatenated with str1.
		System.out.println(str1+str1);
		System.out.println((str1 + str1).indexOf(str2));
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "ACBD";

		if (areRotations(str1, str2))
			System.out.println("Strings are rotations of each other");
		else
			System.out.printf("Strings are not rotations of each other");
	}
}
