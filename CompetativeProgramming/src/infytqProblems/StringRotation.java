package infytqProblems;

/*
 	* You are provided two or more strings, where each string is associated with the number (seperated by :). 
 	* If sum of square of digits is even then rotate the string right by one position, 
 	* and if sum of square of digits is odd then rotate the string left by two position.
			
		Input :
		
		Accept multiple values in the form of String:Integer seperated by ‘,’
		
		Output :
		
		Rotated Strings.
		
		Sample Testcases :
		
		I/P 1 :										O/P 1 :
		
		abcde:234,pqrs:246							cdeab
		
													spqr

 */

class StringRotationSol {
	public static void Rotate(String str) {
		String[] strArr = str.split(",");
		for (String s : strArr) {
			String[] part = s.split(":");
			String strPart = part[0];
			String strNum = part[1];
			
			int sum=0;
			for(int i=0; i<strNum.length(); i++) {
				sum += (int) Math.pow(Integer.parseInt(strNum.charAt(i)+""), 2.0);
			}
			
			String res = "";
			if(sum %2 ==0) {
				// even, so rotate right by 1 position
				res = strPart.substring(strPart.length())+strPart.substring(0,strPart.length()-1);
			}else {
				// odd, so rotate left by 2 position
				res = strPart.substring(2)+strPart.substring(0,2);
			}
			System.out.println(res);			
		}
	}
}

public class StringRotation {

	public static void main(String[] args) {

		StringRotationSol.Rotate("abcde:234,pqrs:246");

	}

}
