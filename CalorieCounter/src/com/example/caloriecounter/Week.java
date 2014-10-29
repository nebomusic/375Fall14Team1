package com.example.caloriecounter;

import java.util.ArrayList;

public class Week {
	//fields 
	ArrayList<Day> days; 
	
	//constructor 
	public Week(){
		days=new ArrayList<Day>(); 
	}
	public void addDay(Day d){
		days.add(d); 
	}
	public int getWeeklyTotal(){
		int total =0; 
		for (int i=0; i<days.size(); i++){
			total +=days.get(i).getDailyTotal(); 
		}
		return total; 
	}
	
}
