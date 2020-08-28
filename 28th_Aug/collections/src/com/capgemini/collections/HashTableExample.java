package com.capgemini.collections;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {

		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(101, "Manasi");
		hashTable.put(102, "Gayatri");
		hashTable.put(103, "Apurva");
		hashTable.put(104, "Atharv");

		System.out.println("Hash Table : " + hashTable);

	}
}
