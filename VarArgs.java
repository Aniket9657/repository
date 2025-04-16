package com.Collection;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[]args) {
		sum(1,2,3,4,4,66,6);
	
	}
	
	
	public static void sum(int...v)
	{
		
		System.out.println(Arrays.toString(v));
	}

}
