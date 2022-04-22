package infytqProblems;

import java.util.Stack;

public class binary {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
			System.out.print(bin(i)+",");

	}
	
	static String bin(int num) {
		
		String str = "";
		int[] arr = new int[10];
		int i=0;
		while (num>0) {
			arr[i++] = num%2;
			num/=2;
		}
		
		for(int j = i-1; j>=0; j--) {
			str = str + arr[j];
		}
		
		return str;
		
	}

}
