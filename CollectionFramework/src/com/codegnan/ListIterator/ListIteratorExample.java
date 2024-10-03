package com.codegnan.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("pineapple");
		System.out.println(fruits);
		
		ListIterator<String> fruitsNames=fruits.listIterator();
		System.out.println("Fruits in Forward Direction");
		while(fruitsNames.hasNext()) {
			System.out.println(fruitsNames.nextIndex()+"----->"+fruitsNames.next());
		}
		System.out.println();
		System.out.println("Fruits in Backward Direction");
		while(fruitsNames.hasPrevious()) {
			System.out.println(fruitsNames.previousIndex()+"------>"+fruitsNames.previous());
		}
		System.out.println();
		
		while(fruitsNames.hasNext()) {
			String names=fruitsNames.next();
			if(names.equalsIgnoreCase("Banana")) {
				fruitsNames.set("Grapes");
			}
			if(names.equalsIgnoreCase("mango")) {
				fruitsNames.add("Mosombi");
			}
			if(names.equalsIgnoreCase("PineApple")) {
				fruitsNames.remove();
			}
		}
		System.out.println();
		System.out.println(fruits);
	}

}
