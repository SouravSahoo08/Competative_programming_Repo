package codeVita;

import java.util.Scanner;

public class Sequencing_Position {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		sc.close();
		System.out.println(findCharacterAt(pos));

	}

	static String str = "a";

	private static char findCharacterAt(int pos) {

		if (pos == 1)
			return 'a';

		int count = 1;

		while (pos > count) {
			count = count + replaceChar();
			if (pos <= count) {
				char c = check(count, pos);
				if (c != 0) {
					return c;
				}
			}

		}

		return 0;
	}

	private static char check(int cnt, int pos) {
		for (int i = str.length() - 1; i >= 0; i--) {
			if (cnt == pos)
				return str.charAt(i);
			cnt--;
		}
		return 0;
	}

	private static int replaceChar() {
		if (str == "a") {
			str = "ab";
			return str.length();
		}
		String substr = str.substring(str.length() / 2);

		for (int i = 0; i < substr.length(); i++) {
			if (substr.charAt(i) == 'a')
				str += "ab";
			else if (substr.charAt(i) == 'b')
				str += "cd";
			else if (substr.charAt(i) == 'c')
				str += "cd";
			else if (substr.charAt(i) == 'd')
				str += "ab";
		}
		
		return str.length();
	}

}
