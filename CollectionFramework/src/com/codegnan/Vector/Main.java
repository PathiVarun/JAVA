package com.codegnan.Vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;


public class Main {

	public static void main(String[] args) {
		Collection collection=new ArrayList();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		System.out.println(collection);

		Vector vector=new Vector(collection);
		System.out.println(vector);
		

	}

}
