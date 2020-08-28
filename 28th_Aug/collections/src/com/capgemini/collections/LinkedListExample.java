package com.capgemini.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Manasi");
		linkedList.add("Gayatri");
		linkedList.add("Apurva");

		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
