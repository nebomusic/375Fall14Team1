package com.example.caloriecounter;

import java.util.ArrayList;

public class Day {
	//fields
	ArrayList<Meal> meals; 
	String dayName; 
	
	//constructor 
	public Day(String d){
		meals = new ArrayList<Meal>(); 
		dayName=d; 
	}
	public void addMeal(Meal m){
		meals.add(m); 
	}
	public ArrayList<Meal> getMeals(){
		return meals; 
	}
	public String getDay(){
		return dayName; 
	}
	public Meal getBreakfast(){
		return meals.get(0); 
	}
	public Meal getLunch(){
		return meals.get(1); 
	}
	public Meal getDinner(){
		return meals.get(2); 
	}
	public int getDailyTotal(){
		Meal bFast = getBreakfast(); 
		Meal lunch = getLunch(); 
		Meal dinner = getDinner(); 
		return bFast.getTotalCalories()+lunch.getTotalCalories()+dinner.getTotalCalories(); 
	}
}
