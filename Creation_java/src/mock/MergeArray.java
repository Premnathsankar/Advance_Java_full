package mock;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = {6,7,8,9,10};
		
		int[] merge = new int[arr1.length+arr2.length];
		
		int place = 0;
		
		for(int i = 0;i<arr1.length;i++) {
			
			merge[i] = arr1[i];
			place++;
		}
		
		for(int i = arr2.length-1;i>=0;i--) {
			
			merge[place] = arr2[i];
			place++;		
		}
		
		System.out.println(Arrays.toString(merge));
		

	}

}
