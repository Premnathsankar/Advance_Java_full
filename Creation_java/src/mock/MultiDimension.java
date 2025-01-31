package mock;

import java.util.Arrays;

public class MultiDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] arr2 = new int[3][3];
		

		for(int i = 0;i<arr.length;i++) {
			int st = 0;
			for(int j= arr.length-1;j>=0;j--) {
				arr2[i][st] = arr[i][j];
				st++;	
				}
			}
		
		for(int i = 0;i<arr2.length;i++) {
			for(int j = 0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
