package infytqProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Palindrome p = new Palindrome();
		p.palindrome();
		// palindrome();
	}

	void palindrome() throws NumberFormatException, IOException {
		// Scanner sc = new Scanner(System.in);
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(b.readLine());// sc.nextInt();
		int rev = 0, org, rem;
		org = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if (rev == org)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
		// sc.close();
	}

}