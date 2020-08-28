package com.capgemini.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListSecond {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> copyOnWirteList = new CopyOnWriteArrayList<Integer>();

		copyOnWirteList.add(10);
		copyOnWirteList.add(20);
		copyOnWirteList.add(30);
		copyOnWirteList.add(40);
		copyOnWirteList.add(50);

		System.out.print("CopyOnWriteArrayList : " + " ");
		System.out.println(copyOnWirteList);

		Iterator<Integer> iterator = copyOnWirteList.iterator();

		System.out.println("Synchronized ArrayList:");
		while (iterator.hasNext())
			System.out.println(iterator.next() + " ");
	}
}
