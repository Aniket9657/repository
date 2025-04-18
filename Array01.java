package com.Collection;

import java.util.ArrayList;

public class Array01 
   {
	public static void main(String[]args)
	{
		
		
		// store 5 numbers 
    int[] Arr = new int [5];
    Arr[0]=1;
    Arr[1]=2;
    Arr[2]=3;
    Arr[3]=4;
    Arr[4]=1;
    // or Directly store 
    
    int [] arr1= {1,2,3,4,5};
    
    
    int [] Aray ;// Declaration of Array . Aray is getting defined in the stack 
    Aray = new int [5]; // initialization : actually here object is being created in the memory (heap)
      System.out.println(Aray[0]);
    
      
      // for String 
      
     // String[] arr= new String[5];
      
      
      
      
    
		
	
	ArrayList<Integer> L1 = new ArrayList<>();
	L1.add(1);
	L1.addFirst(0);
	L1.addLast(3);
	L1.addAll(L1);
	
	
	System.out.println(L1);
    }
	
	
	
	
	
	
}
