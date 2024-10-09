package org.example.models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Grocery {
	public static ArrayList<String> groceryList = new ArrayList<>();

	public Grocery() {
	}

	public static ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void startGrocery(){
		Scanner scanner = new Scanner(System.in);
		int value;
		do {
			System.out.println("Please enter a number between 0-2. (0: stop execution, 1: add items to list, 2: remove items from list");
			value = scanner.nextInt();
		}
		while(value < 0 || value > 2);
		if(value == 0) return;
		else if(value == 1) {
			System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
			String groceryAdded = scanner.nextLine();
			addItems(groceryAdded);

		} else {
			System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
			String groceryRemoved = scanner.nextLine();
			removeItems(groceryRemoved);
		}

	}
	public static void addItems(String input){
		String[]arr = input.split(",");
		for(String item: arr){
			if(!Grocery.checkItemIsInList(item)) groceryList.add(item);
		}
		printSorted();
	}

	public static void removeItems(String input){
		String[]arr = input.split(",");
		for(String item: arr){
			if(Grocery.checkItemIsInList(item)) groceryList.remove(item);
		}
		printSorted();
	}
	public static boolean checkItemIsInList(String product){
		return groceryList.contains(product);
	}
	public static void printSorted(){
		Collections.sort(groceryList);
		System.out.println(groceryList);
	}
	public static void uniqueValues(){
		ArrayList<String> uniqueList = new ArrayList<>();
			for(int i = 1; i < groceryList.size();i++){
				if(uniqueList.get(i).equals(groceryList.get(i))){
					continue;
				}
				else {
					uniqueList.add(groceryList.get(i));
				}
			}

	}
}
