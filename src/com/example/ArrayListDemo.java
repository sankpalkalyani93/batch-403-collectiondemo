package com.example;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String [] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Orange");
		
		System.out.println("Fruits List : " + fruits);
	
		System.out.println("Fruits list contains Kiwi? " + fruits.contains("Kiwi"));
		System.out.println("Fruits list contains Pear? " + fruits.contains("Pear"));
		
		System.out.println("Is Fruits empty? " + fruits.isEmpty());
		
		fruits.remove(3);
		System.out.println("Fruits list after removal of 3 element : " + fruits);
		
		String[] fruitsArray = fruits.toArray(new String[fruits.size()]);
		for(int i = 0; i < fruitsArray.length; i++) {
			System.out.println("Fruit at " + i + "  index : " + fruitsArray[i]);
		}
	}
}
