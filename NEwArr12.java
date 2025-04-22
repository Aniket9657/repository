package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class NEwArr12 {
	public static void main(String[]args)
	{
		ArrayList<Integer> list = new ArrayList<>(6);
		

		list.add(1);
		list.add(2);
		list.add(3);
		
		list.add(4);
		
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
