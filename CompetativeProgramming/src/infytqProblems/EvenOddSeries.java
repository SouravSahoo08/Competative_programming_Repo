package infytqProblems;

import java.util.ArrayList;
import java.util.Collections;


/*
 * Given a string and it contains the digits as well as non-digits.
 *  We have to find the largest even number from available digits after removing the duplicates. 
 *  If not possible, print -1.

		Input : 
		
		First Input : String
		
		Output : 
		
		Largest number
		
		Sample Testcases :
		
		I/P 1:
		
		%#32%#%2
		
		O/P 1:
		
		32
		
		I/P 2:
		
		%#2373#@
		
		O/P 2:
		
		732
 */

class EvenOddSol{
	static String result(String str) {
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=0; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))){
				int x = Integer.parseInt(str.charAt(i)+"");
				if(!num.contains(x)) {
					num.add(x);
				}
			}
		}
		
		Collections.sort(num,Collections.reverseOrder());
		int lst = num.size();
		if(num.get(lst-1) % 2 != 0) {
			int i;
			for(i = lst-2; i>=0; i--) {
				if(num.get(i)%2==0) {
					Collections.swap(num, i, lst-1);
					break;
				}
			}
			if (i==0) return "-1";
		}
		
		String res = "";
		for(Integer i : num)
			res += i;
		
		return res;
	}
}

public class EvenOddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(EvenOddSol.result("%#32%#%2\r\n" + 
				"\r\n" + 
				""));
	}

}
