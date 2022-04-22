package codeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleGame {

	static int[][] winningPositions = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
			{ 0, 4, 8 }, { 2, 4, 6 } };

	public static void main(String[] args) throws IOException {
		String[] board = new String[9];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] row1 = br.readLine().split("");
		String[] row2 = br.readLine().split("");
		String[] row3 = br.readLine().split("");

		for (int i = 0; i < row1.length; i++) {
			board[i] = row1[i];
		}
		for (int i = 0; i < row2.length; i++) {
			board[row1.length + i] = row2[i];
		}
		for (int i = 0; i < row3.length; i++) {
			board[row1.length + row2.length + i] = row3[i];
		}

		if (check(board)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	static boolean check(String board[]) {
		int noOfX = 0, noOfO = 0;
		for (int i = 0; i < 9; i++) {
			if (board[i].equals("X")) {
				noOfX++;
			}
			if (board[i].equals("O")) {
				noOfO++;
			}
		}
		if (noOfX == noOfO || noOfX == noOfO + 1) {
			if (isWin(board, "O")) {
				if (isWin(board, "X")) {
					return false;
				}
				return (noOfX == noOfO);
			}
			if (isWin(board, "X") && noOfX != noOfO + 1) {
				return false;
			}

			return true;
		}
		return false;
	}

	private static boolean isWin(String[] board, String symb) {
		for (int i = 0; i < 8; i++) {
			if (board[winningPositions[i][0]].equals(symb) && board[winningPositions[i][1]].equals(symb)
					&& board[winningPositions[i][2]].equals(symb)) {
				return true;
			}
		}
		return false;
	}

}
