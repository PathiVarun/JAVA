package com.codegnan.Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=20;i++) {
			list.add(i);
		}
		
		/*list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);*/
		
		System.out.println(list);
		Iterator<Integer> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			int element=iterator.next();
			
			if(element%2!=0) {
				//System.out.println(element); //It will print all Even numbers
				iterator.remove();
			}
		}
		System.out.println(list);
		

	}

}
