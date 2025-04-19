package com.Collection;

import java.util.Arrays;

public class Chlng {
	
	
	public static void main(String[]args)

	{
		int [] arr = {1,2,3,4,5};
		// {1,0,2,0,3,0,4,0,5,0}
		
		int Arr[]= new int [2*arr.length];
		int j = 0;
		
		for (int i=0; i<arr.length;i++)
		{
			
				Arr[j++]=arr[i];
				Arr[j++]=0;
			}
			
		
		System.out.println(Arrays.toString(Arr));
		
		
	}
	    
	
	
}
