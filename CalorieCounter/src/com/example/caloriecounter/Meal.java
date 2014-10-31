package com.example.caloriecounter;

public class Meal {
	//fields 
	private String name; 
	private int servingSize; 
	private int calPerServing; 
	private String day; 
	private String type; 
	
	public Meal(String n, int servingS, int calPServing, String day,String t){
		name =n; 
		servingSize=servingS; 
		calPerServing = calPServing; 
		this.day=day; 
		type=t; 
	}
	
	
	public String getName(){
		return name; 
	}
	public int getServingSize(){
		return servingSize; 
	}
	public int getCalPerServing(){
		return calPerServing; 
	}
	public String getDay(){
		return day; 
	}
	public int getTotalCalories(){
		return calPerServing*servingSize; 
	}
	
	public String getType(){
		return type; 
	}
	
	public String toString(){
		return "Day "+day+ "Name: "+name+"/n"+ "Type: "+type+"/n"+"Calories: "+ getTotalCalories()+"/n"; 
	}

}
