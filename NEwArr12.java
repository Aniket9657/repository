package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NEwArr12 {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the size ");
		int size = in.nextInt();
		
		System.out.println("Enter the number ");

		for(int i =0 ; i<size;i++)
		{
			int n = in.nextInt();
			list.add(n);
		}
		
		
		for (int i =0;i<list.size();i++)
		{
			System.out.println("The object at index  "+i+" is " +list.get(i));
		}
		
		for (Integer i : list)
		{
			System.out.println(i);
		}
		
		Iterator<Integer> iterator=list.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
	}

}
