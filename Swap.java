package com.Collection;

import java.util.Arrays;

public class Swap {
	public static void main (String[]args)
	{
		int [] arr = {1,3,23,9,18};
		swap(arr,1,3);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Max(arr));
	}
     static void swap(int [] arr ,int index , int index1  )
{
	int temp = arr[index];
	arr[index] = arr[index1];
	arr[index1]=temp;
}
     
     
     
     public static int Max(int[] arr )
     {
    	 int max =0;
    	 for (int i=0; i<arr.length;i++)
    	 {
    		 if (arr[i]>max)
    		 {
    			 max=arr[i];
    			 
    		 }
    	 }
    	 return max;
    	 
     }
}
