package com.Collection;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args)
	{
		// Create A fibonacci series for given limit
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the limit ");
		int Limit = in.nextInt();
		
				
		Fibona(Limit);
		
	}
	public static int[] Fibona(int Limit)
	{
		int[] Arr=new int [Limit];
		for (int i=0; i<Arr.length;i++)
		{
			Arr[i]=i;
		}
		
		return Arr;
		
		
		
		
	}

}
