package com.Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Str5 {
	
	public static void main(String[]args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int num = Sc.nextInt();
		
		int [] Numbers = {1,2,3,4,5,6,7,8,5,5,5,5,7};
		int [] Num=Remove(num,Numbers);
		System.out.println("New Array is  "+Arrays.toString(Num));
		
		
	}
	
	public static int[] Remove(int num,int[]Numbers) {
		
		for (int i=0;i<Numbers.length-1;i++) {
			if (Numbers[i]==num) {
				Numbers[i]=0;
			}
		}
		return Numbers;
		
	}

}
