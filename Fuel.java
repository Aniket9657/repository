package com.Collection;

import java.util.Scanner;

public class Fuel {
	public static void main(String[]args ) {
		 Scanner Sc = new Scanner(System.in);
		 System.out.println("Enter the Fuel =  ");
		 Double Fuel = Sc.nextDouble();
		 System.out.println("Enter the Distance =");
		 Double Dist = Sc.nextDouble();
		 MilageIn(Fuel,Dist);
		 MilageAm(Fuel,Dist);
		 
	}
	public static double MilageIn(double Fuel,double Dist) {
		double milage = 0;
		if (Fuel<0 && Dist<0) {
			System.out.println("Negative value are not allowed ");
			
		}
		else {
			 milage=Dist/Fuel;
			
			System.out.println("MILAGE IS "+milage+" Kilometre Per Litre");
		}
		return milage;
	}
		
	
	
	public static double MilageAm(double Fuel,double Dist) {
		double milage = 0;
		if (Fuel<0 && Dist<0) {
			System.out.println("Negative value are not allowed ");
			
		}
		else {
			 milage=Dist*0.6214/Fuel*0.2642;
			
			System.out.println("MILAGE IS "+milage+" Miles Per Gallons ");
		}
		return milage;
		
	}
}


