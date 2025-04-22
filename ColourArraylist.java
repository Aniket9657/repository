package com.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ColourArraylist {
	
	public static void main (String[] args)
	{
		Scanner in  =  new Scanner(System.in);
		
		
		ArrayList<String> Clist = new ArrayList<>(5 );
		
		
		System.out.println("Enter the number of colour needed");
	
		int n=in.nextInt();
		System.out.println("Enter the Colours");
		
		for (int i =0; i<n;i++)
		{
			String Colour =in.next();
			Clist.add(Colour);
		}
		
		
		System.out.println("colours in the list "+Clist);
		
		in.close();
		
	}

}
