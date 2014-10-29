package com.example.caloriecounter;

public class Meal {
	//fields 
	private String name; 
	private int servingSize; 
	private int calPerServing; 
	private String day; 
	
	public Meal(String n, int servingS, int calPServing, String day){
		name =n; 
		servingSize=servingS; 
		calPerServing = calPServing; 
		this.day=day; 
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

}
