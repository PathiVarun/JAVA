package com.codegnan.CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class DictionaryOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[5];
		System.out.println("Enter the elements into array : ");
		for (int i = 0; i < 5; i++) {
			s[i] = sc.nextLine();
		}
		ArrayList<String> wordList = new ArrayList<>();

		for (String word : s) {
			wordList.add(word);
		}

		Collections.sort(wordList);
		System.out.println("Dictionary order : ");
		for (String word : wordList) {
			System.out.println(word);
		}

	}
}
