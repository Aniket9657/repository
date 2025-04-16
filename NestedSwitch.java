package com.Collection;

import java.util.Scanner;

public class NestedSwitch { 
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int  id  = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Department");
		
		String Department = sc.next();
		
		
		switch(id) {
		case 1:
			System.out.println("Aniket Sonwane");
			break;
		case 2:
			System.out.println("Pratik Aggrawal");
			break;
		case 3:
			System.out.println("Employee no 3");
			switch (Department) {
			case "IT":
				System.out.println("IT Department");
				break;
				
			case "Management" :
				System.out.println("Management Department");
				break;
				
				default:
					System.out.println("No department entered");
					
			}
			default :
				System.out.println("Enter correct id");
		}
		
		
		
		
		
	}

}
