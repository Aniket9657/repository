package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr1 {
	public static void main(String[]args) {
		Integer [] Array1= {3,2,1};
		Check(Array1);
		
		ArrayList<Integer> Arr = new ArrayList<>(Arrays.asList(Array1));
		Arr.add(4);
		System.out.println(Arr.toString());
		Arr.sort(null);
		System.out.println(Arr.toString());
		
		
		
 	}
	
	public static void Check(Integer[]Array1) {
		for(int i=0;i<Array1.length-1;i++) {
			if (Array1[i]<=Array1[i+1]) {
				System.out.println("Array is Sorted");
				return;
			}
			
		}
		System.out.println("Array is not Sorted");
		}
}
			
