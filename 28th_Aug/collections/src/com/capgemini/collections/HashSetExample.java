package com.capgemini.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Manasi");
		hashSet.add("Gayatri");
		hashSet.add("Apurva");
		hashSet.add("Apurva");

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
