package com.capgemini.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListFirst {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();

		arrayList.add("Manasi");
		arrayList.add("Gayatri");
		arrayList.add("Apurva");
		arrayList.add("Atharv");

		arrayList = Collections.synchronizedList(arrayList);

		synchronized (arrayList) {
			Iterator<String> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
}
