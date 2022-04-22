package infytqProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	void largeEvenNum(String s) {

		List<Integer> num = new ArrayList<>();
		boolean isEven = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isDigit(c)) {
				int digit = Integer.parseInt(c + "");
				if (!num.contains(digit)) {
					num.add(digit);
				}
				if (digit % 2 == 0) {
					isEven = true;
				}
			}
		}

		if (isEven == false) {
			System.out.println("-1");
			return;
		}

		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
		int lst = num.size() - 1;
		if (num.get(lst) % 2 != 0) {
			while (num.get(lst) % 2 != 0) {
				lst--;
			}
			swap(lst, num.size() - 1, num);
		}

		String res = "";
		for (int x : num) {
			res += x;
		}
		System.out.println(res);
	}

	private void swap(int cur, int l, List<Integer> num) {

		int temp = num.get(cur);
		num.set(cur, num.get(l));
		num.set(l, temp);

	}
}

public class LargestEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution sb = new Solution();
		sb.largeEvenNum("infosys@881$2569");

	}

}
