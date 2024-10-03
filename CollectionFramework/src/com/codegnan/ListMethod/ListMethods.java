package com.codegnan.ListMethod;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add("CCC");
		
		System.out.println(list);
		list.add(0,"EEE");
		list.add(5,"FFF");
		
		System.out.println(list);
		
		System.out.println(list.remove(0));
		System.out.println(list);
		
		System.out.println(list.set(0, "ZZZ"));
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list.indexOf("CCC"));
		System.out.println(list.lastIndexOf("CCC"));
		
		List list1=new ArrayList();
		list1.add("XXX");
		list1.add("YYY");
		
		
		list1.addAll(2,list);
		System.out.println(list1);
		
	}

}
