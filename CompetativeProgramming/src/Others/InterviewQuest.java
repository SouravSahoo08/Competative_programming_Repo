package Others;

//import java.util.*;

public class InterviewQuest {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		int solution = solution(arr , 3);
		System.out.println(solution);
	}

	private static int solution(int[] arr,int k) {
		int i=0,j=0,count=0;
		while(j>=i) {
			int sum=0;
			for(int a=i;a<=j;a++) {
				sum += arr[a]; 
			}
			if(sum>k)
				i+=1;
			else if(sum<k)
				j+=1;
			else
				count+=1;
		}
		return count;
	}
}
