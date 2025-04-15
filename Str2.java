package com.Collection;

import java.util.Scanner;

public class Str2 {
	public static void main(String[]args) {
		
		String S="qwerqwefqfrtyukmnhq";
		Scanner Sc = new Scanner(System.in);
				System.out.println("Enter the Character = ");
		
				char C= Sc.next().charAt(0);
				Frequency(C,S);
				//System.out.println("The Count of "+C +" is "+ freq);
				
		
	}
	public static int Frequency(char C,String S) {
		int count=0;
		for (int i=0;i<S.length();i++) 
		{
			char chr = S.charAt(i);
			
			if (chr==C)
			{
				count++;
				
			}
			
			
			
			
			
			
		}
		System.out.println("The Count of "+C +" is "+ count);
		return count;
		
	}

}
