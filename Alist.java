package com.Collection;
import java.util.ArrayList;
import java.util.List;

public class Alist {
	public static void main (String[]args) {
		List<String> lis =new ArrayList<>();
		ArrayList<String> list=new ArrayList<>();
		list	.add("apple");
		lis.add( "Apple");
		System.out.println(lis);
		System.out.println(list);
		//for (int i=0;i<=lis.size();i++) {
			//lis.add("apple");
		}
	}


//ConcurrentModificationException because you are modifying the list (lis) while iterating over it using a for loop. Specifically, you're adding an element to the list inside the loop, causing the size of the list to keep increasing, 