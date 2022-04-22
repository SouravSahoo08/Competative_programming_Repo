package codeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Faulty_Pendulum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no_of_forces = Integer.parseInt(br.readLine()); // no of forces
		String[] row1 = br.readLine().split(" "); // magnitude and direction
		String[] row2 = br.readLine().split(" "); // forces

		int magnitude = Integer.parseInt(row1[0]);
		int[] forces = new int[no_of_forces];
		for (int i = 0; i < no_of_forces; i++) {
			forces[i] = Integer.parseInt(row2[i]);
		}

		boolean isPossible = checkPossibility(no_of_forces, magnitude, forces);

		if (isPossible)
			System.out.println("Possible");
		else
			System.out.println("Not Possible");
	}

	private static boolean checkPossibility(int no_of_forces, int magnitude, int[] forces) {
		boolean isPossible = false;
		for (int i = 0; i < no_of_forces; i++) {
			magnitude = Math.abs(magnitude - forces[i]);

			if (magnitude == 0) {
				isPossible = true;
				break;
			}

		}
		return isPossible;
	}

}
