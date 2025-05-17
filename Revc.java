package com.Collection;

public class Revc {
	public static void main(String[]args)
	{
	
	String S ="thiS" ;
	StringBuilder rev = new StringBuilder();
	for (int i=S.length()-1;i>=0;i--)
	{
		rev.append(S.charAt(i));
		
	}
	
	System.out.println(rev.toString());
	

	}
}
