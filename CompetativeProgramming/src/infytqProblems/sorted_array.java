package infytqProblems;

import java.util.ArrayList;

public class sorted_array {
	
	 public static void merge(int[] a, int m, int[] b, int n) {
	        int[] c = new int[m+n];
	        int i =0,j=0,k=0;
	        while(i<m && j<n && k<m+n){
	            if(a[i]<=b[j]){
	                c[k]=a[i];
	                i++;
	            }else{
	                c[k]=b[j];
	                j++;
	            }
	            k++;
	        }
	        
	        while(i<m && k<m+n){
	            c[k] = a[i];
	            i++;
	            k++;
	        }
	        while(j<n && k<m+n){
	            c[k] = b[j];
	            j++;
	            k++;
	        }
	        
	        for(int x : c)
	        	System.out.print(x+" ");
	    }
	
	 public static int lengthOfLongestSubstring(String s) {
	        if(s.length()==0)
	            return 0;
	        
	        ArrayList<Character> str = new ArrayList<>();
	        int i=0,max =0,count =0;
	        while(i<s.length()){
	            if(str.contains(s.charAt(i))) {
	            	max = Math.max(max, count);
	            	System.out.println(max);
	            	count =0;
	            	str.clear();
	            	--i;
	            }
	            else {
	                str.add(s.charAt(i));
	                count=str.size();
	                System.out.println(str);
	            }
	            i++;
	        }
	        max = Math.max(max, count);
	        System.out.println("------------------------");
	        System.out.println(str);
	        return max;
	    }
	 
	public static void main(String[] args) {
		/*
		 * int[] a = {1,2,3,0,0,0}; int[] b = {2,5,6}; merge(a,3,b,3);
		 */
		
		//System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
		/*
		 * ArrayList<Character> str = new ArrayList<>(); str.add('a'); str.add('a');
		 * str.add('a'); str.add('a'); System.out.println(str.size());
		 */
		
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		int top =0;
		System.out.println(arr[top-1]);
		
	}

}
