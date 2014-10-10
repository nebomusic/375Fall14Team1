package com.example.coffeeapp;

import java.sql.Date;

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
		instructions = ins;
		served = false;
		
		
		
	}//end Constructor 2 
	
	//Field modifiers
	public void setHot(boolean h ){
		hot = h;
	}
	public void setType(String t){
		type = t;
	}
	public void setFlavor(String f){
		flavor = f;
	}
	public void setDiary(String d){
		dairy = d;
	}
	public void setSize(int sz){
		size = sz;
	}
	public void setInstructions(String i){
		instructions = i;
	}
	public void setDate(Date d){
		date = d;
	}
	
	//accessors
	public boolean getHot(){
		return hot;
	}
	public String getType(){
		return type;
	}
	public String getFlavor(){
		return flavor;
	}
	public String getTopping(){
		return topping;
	}
	public String getDairy(){
		return dairy;
	}
	public int getSize(){
		return size;
	}
	public Date getDate(){
		return date;
	}
	public boolean getServed(){
		return served;
	}
	public void setServed(boolean s){
		served = s;
	}
	

}// end Class Drink
