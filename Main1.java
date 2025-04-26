package com.Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
	
	public static void main(String[]args)
	{
		Scanner in =new Scanner(System.in);
		//System.out.println("Hello world");
		
		int [] Arr=new int[5];
		
		for (int i=0;i<Arr.length;i++)
		{
			System.out.println("Enter the number ");
			Arr[i]=in.nextInt();
		}
		System.out.print(Arrays.toString(Arr));
	}

}
