package com.Collection;

import java.util.Scanner;

public class Work 
{
	public static void main(String[]args)
	{
		
		 
		Scanner Sc = new Scanner(System.in);
		 System.out.println("Enter the fruit name");
		 String Fruit = Sc.nextLine();
		  switch (Fruit)
		  {
		  case "Mango":
			  System.out.println("King of Fruits");
			  break;
		  
		  case "Apple":
			  System.out.println("Sweet Red Fruit ");
			  break;
			  
			  
		  case "Banana":
			  System.out.println("Yellow Fruit");
			  break;
			  
		  }
		
	}

}
