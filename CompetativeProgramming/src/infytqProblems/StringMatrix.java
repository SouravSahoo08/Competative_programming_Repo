package infytqProblems;

import java.util.*;

public class StringMatrix {

	private static void solve(String[][] sMat, int m, int n) {
		String[][] outMatrix = new String[m][n];
		for (int i = 0; i < n; i++) {
			String dig = "";
			String al = "";
			String part = sMat[0][i];
			for (int j = 0; j < part.length(); j++) {
				if (Character.isDigit(part.charAt(j))) {
					dig += part.charAt(j);
				} else {
					al += part.charAt(j);
				}
			}

			int k;
			for (k = 0; k < n; k++) {
				String part1 = sMat[1][k];
				//int cnt = 0;
				if (dig.equals(part1)) {
					outMatrix[0][i] = dig;
					outMatrix[1][i] = al;
					//cnt = 1;
					break;
				}
				if (k == n - 1 /*&& cnt == 0*/) {
					outMatrix[0][i] = "NA";
					outMatrix[1][i] = "NA";

				}
			}

		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.print(outMatrix[i][j]);
				} else {
					System.out.print(outMatrix[i][j] + ",");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] sMat = new String[2][10];

		String[] input = new String[2];

		for (int i = 0; i < 2; i++) {
			input[i] = sc.next().trim();
		}

		String[] ele = null;
		for (int i = 0; i < 2; i++) {
			ele = input[i].split(",");
			for (int j = 0; j < ele.length; j++) {
				sMat[i][j] = ele[j];
			}
		}

		solve(sMat, 2, ele.length);

	}

}
