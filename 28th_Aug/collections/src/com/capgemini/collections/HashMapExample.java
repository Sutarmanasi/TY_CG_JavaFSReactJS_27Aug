package com.capgemini.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(101, "Manasi");
		hashMap.put(102, "Gayatri");
		hashMap.put(103, "Apurva");
		hashMap.put(104, "Atharv");

		System.out.println("Hash Map : " + hashMap);
	}
}
