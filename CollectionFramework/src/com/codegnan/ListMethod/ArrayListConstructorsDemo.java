package com.codegnan.ListMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ArrayListConstructorsDemo {

	public static void main(String[] args) {
		Collection collection =new HashSet();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		System.out.println(collection);
		
		ArrayList arrayList=new ArrayList(collection);
		System.out.println(arrayList);

	}

}
