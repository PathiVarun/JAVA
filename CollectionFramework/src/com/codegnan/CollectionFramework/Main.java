package com.codegnan.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		
		/*
		HashSet hashSet=new HashSet();
		
		System.out.println("Adding a elements one by one : ");
		hashSet.add("AAA");
		hashSet.add("BBB");
		hashSet.add("CCC");
		hashSet.add("DDD");
		System.out.println(hashSet);
		System.out.println(hashSet.add("AAA"));	// because already available so it returns false.
		System.out.println(hashSet.add("aaa"));
		System.out.println();
		
		//To add of group of elements
		System.out.println("Adding group of elements at a time : ");
		Collection collection=new HashSet();
		System.out.println(collection);
		System.out.println(collection.addAll(hashSet));
		System.out.println(collection);
		System.out.println(collection.addAll(hashSet));
		System.out.println(collection);
		*/
		
		Collection collection1=new ArrayList();
		collection1.add("AAA");
		collection1.add("BBB");
		collection1.add("CCC");
		collection1.add("DDD");
		/*System.out.println(collection1);
		System.out.println(collection1.remove("BBB"));
		System.out.println(collection1);*/
		
		collection1.add("EEE");
		collection1.add("FFF");
		collection1.add("GGG");
		//System.out.println(collection1);
		
		Collection collection2=new ArrayList();
		collection2.add("BBB");
		collection2.add("CCC");
		collection2.add("DDD");
		//System.out.println(collection2);
		
		
		
		
		/*System.out.println(collection1.removeAll(collection2));
		System.out.println(collection1);
		System.out.println(collection1.removeAll(collection2));
		System.out.println(collection1);
		
		
		System.out.println(collection1.contains("AAA"));
		System.out.println(collection1.contains("YYY"));
		System.out.println(collection1.containsAll(collection2));*/
		
		
		
		/*System.out.println(collection1.retainAll(collection2));
		System.out.println(collection1);
		System.out.println(collection1.isEmpty());
		System.out.println(collection1.size());
		collection1.clear();
		System.out.println(collection1.isEmpty());
		System.out.println(collection1.size());
		*/
		
		System.out.println(collection1);
		
		//Converting ArrayList into Array we will use toArray() method .
		Object[] elements=collection1.toArray();
		
		for(Object obj:elements) {
			System.out.println(obj);
		}

		

	}

}
