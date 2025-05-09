package com.Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args)
	{
		// 0 1 1 2 3 5 8 13 21 
		// how 
		
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please Enter the Length");
		
		int Length= in.nextInt();
	      System.out.println(Arrays.toString(Fibo(Length)));
		
		}
	
	
	
	public static int [] Fibo(int Length)
	{
		int [] Fib = new int [Length];
		for (int i=0;i<Length-1;i++)
		{
			int n1=0;
			int n2=1;
			int sum = 0;
			Fib[i]=n1;
			sum=n1+n2;
			n1=n2;
			n2=sum;
				
			
		}
		return Fib;
		
		
	}

}
