package com.Collection;

import java.util.Arrays;

public class Swap {
	public static void main (String[]args)
	{
		int [] arr = {1,3,23,9,18};
		swap(arr,1,3);
		
		System.out.println(Arrays.toString(arr));
	}
     static void swap(int [] arr ,int index , int index1  )
{
	int temp = arr[index];
	arr[index] = arr[index1];
	arr[index1]=temp;
}
}
