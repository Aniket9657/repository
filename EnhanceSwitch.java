package com.Collection;

import java.util.Scanner;

public class EnhanceSwitch {
	
	public static void main(String [] args)
	{
		Scanner Sc = new Scanner (System.in);
		
		System.out.println("Enter the Fruit name ");
		String Fruit = Sc.nextLine();
		
		switch(Fruit)
		{
		case "Mango" -> System.out.println("King of Fruits");
		case "Apple" -> System.out.println(" Red Sweet Fruit");
		case "Orange" ->System.out.println("Round Fruit");
		default ->  System.out.println(" Please enter the Valid Fruit");
		}
		
	}

}
