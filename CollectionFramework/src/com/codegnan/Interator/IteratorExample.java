package com.codegnan.Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add("EEE");
		list.add("FFF");
		System.out.println(list);
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println(element);
			if(element.equalsIgnoreCase("bbb")) {
				iterator.remove();
			}
		}
		System.out.println(list);
	}

}
