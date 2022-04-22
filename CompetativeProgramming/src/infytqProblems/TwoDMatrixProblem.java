package infytqProblems;

import java.util.*;

public class TwoDMatrixProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // String[] s =
		// sc.next().trim().split(",");

		String[] input = new String[m];

		for (int i = 0; i < m; i++) {
			// int j=0;
			input[i] = sc.next().trim();
		}
		int n =input[0].length();
		int[][] a = new int[m][n];
		String[] ele = null;
		// for(String x : input) System.out.println(x);
		for (int i = 0; i < m; i++) {
			ele = input[i].split(",");
			for(int j = 0; j<ele.length;j++) {
				a[i][j] = Integer.parseInt(ele[j]);
			}
		}

		System.out.println("=======================================");

		for(int i=0 ;i<m ; i++) {
			for(int j =0;j<ele.length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		/*
		 * int[][] a = new int[][] { { 3, 4, 8 }, { 5, 6, 9 }, { 7, 5, 4 } };
		 * System.out.println(solution(a, 3, 3));
		 */

	}

	static int solution(int[][] a, int m, int n) {

		int[] temp = new int[m * n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					temp[k++] = a[i][j];
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					temp[k++] = a[i][j];
				}
			}
		}

		for (int x : temp)
			System.out.print(x);
		System.out.println();

		int sum = 0;
		ArrayList<Integer> sqnumarr = new ArrayList<>();
		for (int i = 0; i < temp.length; i++) {
			// System.out.println(sum);
			sum += temp[i];
			// System.out.println(sum);
			double sqrt = Math.sqrt(sum);
			// System.out.println(sqrt);
			if ((int) sqrt * sqrt == sum) {
				sqnumarr.add(sum);
				sum = 0;
			} /*
				 * else { sum=0; }
				 */
		}

		System.out.println(sqnumarr);
		int gre = -1;
		for (Integer x : sqnumarr) {
			gre = Math.max(gre, x);
		}

		return gre;
	}

}
