package com.Collection;

public class ReVStr {
    public static void main(String[] args) {
     String S1=" This is ";
     String[] rev =S1.trim().split(" +");
     
     
     for (int i=rev.length-1;i >= 0;i--)
     {
    	System.out.print(rev[i]);
    	
     
     if ( i != 0)
     {
    	 System.out.print(" ");
     }
     
    }
     
    }  
}
