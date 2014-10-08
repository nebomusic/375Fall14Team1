package com.example.coffeeapp;

public class Drink {
	private boolean hot;//hot or cold
	private String type;//type of drink
	private String flavor;//mocha...
	private String topping;//drizzle...
	private String dairy;//milk, soy
	private int size;// ounces
	private String instructions;//Special instructions
	private Date date;// Date and time ordered
	private boolean served; // was this drink served
	
	
	
	//Constructor
	public Drink(){
		
		
	}//end Constructor 1
	
	//Constructor 2 with fields
	public Drink(boolean h, String t, String f, String tp, String d,
			int sz, String ins){
		hot = h;
		type = t;
		flavor = f;
		topping = t;
		dairy = d;
		size = sz;
		
		
		
	}

}
