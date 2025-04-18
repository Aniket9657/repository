package com.Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimentional_Array {
	public static void main(String[]args)
	{
		
		Scanner in = new Scanner(System.in);
		/*
		 * 
		 *       1 2 3 4
		 *       2 3 5 7
		 *       9 4 3 4       
		 */    
		
		
		//int[][] arr = new int [3][3];
		int[][] arr2d = 
			{
					{1, 2, 3},//0th index
					{2, 3}, // 1st index
					{7, 5, 3, 3} // 2nd index -> arr2d[2] = {7, 5, 3, 3}
						
					
				
		    };
		
		
		System.out.println(arr2d[2]); //  reference 
		System.out.println(Arrays.toString(arr2d[2]));//{7, 5, 3, 3}
		System.out.println(arr2d[2][2]);// 3
		
		
		int [][] arr = new int [3][3] ;
		// input
		for (int row =0; row < arr.length;row++)
		{
			for (int col = 0; col < arr[row].length;col++)
			{
				arr[row][col] = in.nextInt();
			}
		}
	// output
		
	/*
	 * for (int row =0; row < arr.length;row++) { for (int col = 0; col <
	 * arr[row].length;col++) { System.out.print(arr[row][col]+ " "); }
	 * System.out.println(); }
	 * 
	 * 
	 * for (int row =0; row<arr.length; row++) {
	 * System.out.println(Arrays.toString(arr[row]));
	 * 
	 * }
	 */
		for (int [] a : arr)
		{
			System.out.println(Arrays.toString(a));
		}
		
		
	}
	

}
