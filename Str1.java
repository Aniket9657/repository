package com.Collection;

import java.util.Scanner;

public class Str1 {
	public static void main(String[]args) {
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter the Word = ");
		String Word = Sc.nextLine();
		ReverseStr(Word);
		
		
	}
	
	public static String ReverseStr(String Word) {
		String Rword="";
		for (int i=Word.length()-1;i>=0;i--)
		{
			Rword=Rword+Word.charAt(i);
			
			//System.out.println(" Reverse of the "+word+" is "+Rword);
		}
		
			if (Word.equals(Rword)) 
			{
				System.out.println(Word+" is a palingndrome");
				
			}
			else 
			{
				System.out.println(Word+" is  not a palingndrome");
				
			}
			return Rword;
			
		
		
		
				
	}
	
		
	}


