package codeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallindromeCount {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int strLen = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int noOfSet = Integer.parseInt(br.readLine());
		String[] setString = br.readLine().split(" ");
		int[] sets = new int[noOfSet];
		for (int i = 0; i < setString.length; i++) {
			sets[i] = Integer.parseInt(setString[i]);
		}

		int pallinCount = 0;
		for (int n : sets) {

			if (n == 1)
				pallinCount = strLen;
			else {
				for (int i = 0; i < strLen; i++) {
					String subStr = "";
					try {
						subStr = str.substring(i, i + n);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
						break;
					}

					boolean isPallin = checkPallin(subStr);
					if (isPallin)
						pallinCount += 1;
				}
			}

		}

		System.out.println(pallinCount);

	}

	private static boolean checkPallin(String subStr) {
		for (int i = 0, j = subStr.length() - 1; i < subStr.length() / 2; i++, j--) {
			if (subStr.charAt(i) != subStr.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
