package Others;

public class SubstringClass {

	public static void main(String[] args) {

		String str = "My name is Sourav. \"developing Something\" \"\" new";
		generateSubstrings(str);

	}

	private static void generateSubstrings(String str) {

		str = str.trim();

		char[][] cStr = new char[20][40];
		int k = 0, j = 0;
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (s != ' ') {

				// for quoted substrings
				if (s == '"') {
					i += 1;
					while (str.charAt(i) != '"') {
						cStr[k][j] = str.charAt(i);
						j++;
						i++;
					}
				} else {
					cStr[k][j] = s;
					j++;
				}
			} else {
				k++;
				j = 0;
			}
		}

		printSubstrings(cStr);
	}

	private static void printSubstrings(char[][] cStr) {
		for (int i = 0; i < 20; i++) {

			for (char x : cStr[i]) {
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
