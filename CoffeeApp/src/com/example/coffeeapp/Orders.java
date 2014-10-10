package com.example.coffeeapp;

import java.util.ArrayList;
import java.util.List;

public class Orders {
	
	private List<Drink> drinks; 
	
	//Constructor 
	public Orders(){
		drinks = new ArrayList<Drink>(0); 
	}
	//Accessor
	public List<Drink> getDrinks(){
		return drinks; 
	}
	//Add a drink to the List
	public void addDrink(Drink d){
		drinks.add(d); 
	}
	//Get the total number of drinks served
	public int getNumServed(){
		int total = 0; 
		for (int d =0; d<drinks.size(); d++){
			if (drinks.get(d).getServed() == true){
				total++; 
			}
		}
		return total; 
	}
	//Get an individual order
	public Drink getDrink(int i){
		return drinks.get(i); 
	}
	//Get the Drinks ordered
	public int getNumDrinks(){
		return drinks.size(); 
	}
}//end class
