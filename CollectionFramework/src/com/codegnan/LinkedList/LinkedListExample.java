package com.codegnan.LinkedList;

import java.util.LinkedList;



public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("AAA");
		linkedList.add("BBB");
		linkedList.add("CCC");
		linkedList.add("DDD");
		System.out.println(linkedList);
		linkedList.add("EEE");
		linkedList.add("FFF");
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.removeLast());
		linkedList.addFirst("GGG");
		System.out.println(linkedList);

	}

}
