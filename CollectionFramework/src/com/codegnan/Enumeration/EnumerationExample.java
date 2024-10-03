package com.codegnan.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		Vector<String> fruits=new Vector<>();
		fruits.addElement("Mango1");
		fruits.addElement("Mango2");
		fruits.addElement("Mango3");
		fruits.addElement("Mango4");
		fruits.addElement("Mango5");
		System.out.println(fruits);
		
		Enumeration<String> enumeration=fruits.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
