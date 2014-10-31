package com.example.caloriecounter;

import java.util.ArrayList;

public class Week {
	//fields 
	ArrayList<Day> days; 
	
	//constructor 
	public Week(){
		days=new ArrayList<Day>();
		days.add(new Day("Monday")); 
		days.add(new Day("Tuesday")); 
		days.add(new Day("Wednesday")); 
		days.add(new Day("Thursday")); 
		days.add(new Day("Friday")); 
		days.add(new Day("Saturday")); 
		days.add(new Day("Sunday")); 
	}
	public ArrayList<Day> getDays(){
		return days; 
	}
	public int getWeeklyTotal(){
		int total =0; 
		for (int i=0; i<days.size(); i++){
			total +=days.get(i).getDailyTotal(); 
		}
		return total; 
	}
	
}
