package com.codegnan.ListMethod;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList fruits=new ArrayList();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Manago");
		fruits.add("Grapes");
		fruits.add(null);
		fruits.add(null);
		fruits.add(null);
		fruits.add(null);
		fruits.add(10);//heterogenous elements
		fruits.add(50);
		System.out.println(fruits);
		fruits.add(new Integer(30));
		System.out.println(fruits);
		
		
	}

}
