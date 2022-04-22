package infytqProblems;

/*find the no. of sub arrays with odd sum*/ 

public class DistinctSubarray {

	static void oddSubArray(int[] a) {
		int len = a.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j=i; j<len;j++) {
				sum+=a[j];
				if(sum%2!=0) {
					System.out.println(sum);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		DistinctSubarray.oddSubArray(a);
	}

}
