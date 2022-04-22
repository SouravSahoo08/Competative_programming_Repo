package infytqProblems;

import java.util.*;

class StringSolution {
	static void sol(String inStr) {
		String outStr = "";
		HashMap<Character, Integer> c = new HashMap<>();
		HashMap<Character, Integer> d = new HashMap<>();

		for (int i = 0; i < inStr.length(); i++) {
			char ch = inStr.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (c.containsKey(ch))
					c.put(ch, c.get(ch) + 1);
				else if(ch != ' ')
					c.put(ch, 1);
			}else if(Character.isDigit(ch)) {
				if(d.containsKey(ch))
					d.put(ch,d.get(ch)+1);
				else if(ch != ' ')
					d.put(ch, 1);
			}
		}
		
		int letter =0, digit =0;
		for(Map.Entry<Character, Integer> i : c.entrySet()) {
			letter = Math.max(letter, i.getValue());
		}
		for(Map.Entry<Character, Integer> i : d.entrySet()) {
			digit = Math.max(digit, i.getValue());
		}
		
		int splIndex = Math.abs(letter - digit);
		
		if(inStr.charAt(splIndex) != ' ') {
			
			for(int i = 0; i<inStr.length(); i++) {
				if(inStr.charAt(i) == ' ') {
					outStr += '$';
				}else if(inStr.charAt(i) != inStr.charAt(splIndex))
					outStr += inStr.charAt(i);
			}
			
		}else {
			for(int i = 0; i<inStr.length(); i++) {
				if(inStr.charAt(i) == ' ') {
					outStr += '$';
				}else
					outStr += inStr.charAt(i);
			}
		}
		
		System.out.println(outStr);
		
	}
}

public class SpecialStringUpdation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSolution.sol("Hi there");
	}

}
