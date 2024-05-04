package com.example;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> fruits = new HashMap<>();
		fruits.put(1, "apple");
		fruits.put(2, "pine-apple");
		fruits.put(3, "banana");
		fruits.put(4, "orange");
		fruits.put(5, "pear");
		
		System.out.println("Fruits Map : " + fruits);
		fruits.put(6, "orange");
	
		System.out.println("Fruits Map after adding orange : " + fruits);
		fruits.put(5, "kiwi");
		
		System.out.println("Fruits Map for same index values : " + fruits);
	}

}
