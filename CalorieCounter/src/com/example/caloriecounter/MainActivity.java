package com.example.caloriecounter;


import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	int weeklyCalories; 
	private ArrayList<Meal> meals; 
	//holds the current meal 
	private Meal meal; 

	//holds the current day
	private Day day; 

	//olds the current week
	private Week week=new Week(); 

	//UI elements from the Daily Meals XML 
	private Button buttonSave; 
	private Button buttonMealsClear; 
	private Button buttonMealsMain; 

	private Spinner spinnerMealType; 
	private Spinner spinnerSavedMeals; 
	private Spinner spinnerDay; 

	private EditText textMax; 
	private EditText editServingSize; 
	private EditText editCPS; 
	private EditText editName; 

	private TextView textDailyTotal; 

	//UI elements from the Weekly History XML 
	private TextView backupTxtView; 
	
	private TextView weeklyTotalTxtView;

	private Button historyMainBtn; 
	private Button historyClearBtn; 

	//UI elements from the main menu
	private Button buttonHistory; 
	private Button buttonMeal; 




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		screenMain();
		meals = new ArrayList<Meal>(10); 
	}
	@Override
	protected void onResume(){
		super.onResume();
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void screenMeal(){
		setContentView(R.layout.activity_daily_meals); 
		buttonSave=(Button)findViewById(R.id.buttonSave); 
		buttonMealsClear=(Button)findViewById(R.id.buttonMealsClear); 
		buttonMealsMain=(Button)findViewById(R.id.buttonMealsMain); 

		spinnerMealType=(Spinner)findViewById(R.id.spinnerMealType); 
		spinnerSavedMeals=(Spinner)findViewById(R.id.spinnerSavedMeal); 
		spinnerDay=(Spinner)findViewById(R.id.spinnerDay); 

		textMax=(EditText)findViewById(R.id.textMax); 
		editServingSize=(EditText)findViewById(R.id.editServingSize); 
		editCPS=(EditText)findViewById(R.id.editCPS); 
		editName=(EditText)findViewById(R.id.editName); 

		ArrayAdapter<CharSequence>mealTypeAdapter = ArrayAdapter.createFromResource(this,
				R.array.meal_array,android.R.layout.simple_spinner_dropdown_item);
		mealTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerMealType.setAdapter(mealTypeAdapter);

		ArrayAdapter<CharSequence>dayAdapter = ArrayAdapter.createFromResource(this,
				R.array.day_array,android.R.layout.simple_spinner_dropdown_item);
		dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerDay.setAdapter(dayAdapter);
		
		ArrayAdapter<CharSequence>savedMealsAdapter = ArrayAdapter.createFromResource(this,
				R.array.mealNames_array,android.R.layout.simple_spinner_dropdown_item);
		savedMealsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerSavedMeals.setAdapter(savedMealsAdapter);
	}

	private void screenHistory(){
		setContentView(R.layout.activity_weekly_history); 
		
		backupTxtView = (TextView)findViewById(R.id.backupTxtView); 
		
		weeklyTotalTxtView=(TextView)findViewById(R.id.weeklyTotalTxtView);

		historyMainBtn=(Button)findViewById(R.id.historyMainBtn); 
		historyClearBtn=(Button)findViewById(R.id.historyClearBtn); 
	}

	private void screenMain(){
		setContentView(R.layout.activity_main);
		buttonHistory = (Button)findViewById(R.id.buttonHistory);
		buttonMeal = (Button)findViewById(R.id.buttonMeal);
	}

	public void buttonMealsMainClicked(View v){
		screenMain(); 
	}
	public void buttonHistoryMainClicked(View v){
		screenMain(); 
	}
	public void handleClick(View v){
		switch(v.getId()){
		case R.id.buttonHistory: 
			screenHistory(); 
			break; 
		case R.id.buttonMeal:
			screenMeal(); 
			break; 
		}
	}
	
	public void saveMealBtnClicked(View v){
		String n = editName.getText().toString(); 
		int servingSize = Integer.valueOf(editServingSize.getText().toString()); 
		int calPerServing = Integer.valueOf(editCPS.getText().toString()); 
		String day = spinnerDay.getSelectedItem().toString(); 
		String mealType=spinnerMealType.getSelectedItem().toString(); 
		
		//creates a new meal 
		meal = new Meal(n,servingSize,calPerServing,day,mealType); 
		int mealCal=meal.getTotalCalories(); 
		meals.add(meal); 
		weeklyCalories+=mealCal; 
		screenHistory(); 
		backupTxtView.setText(meals.toString()); 
		weeklyTotalTxtView.setText(String.valueOf(weeklyCalories)); 
		//textDailyTotal.setText(mealCal); 
	}
	public void clearHistoryBtnClicked(View v){
		backupTxtView.setText(""); 
		weeklyCalories = 0; 
		weeklyTotalTxtView.setText(""); 
	}
	public void buttonMealsClearClicked(View v){
		editServingSize.setText(""); 
		editCPS.setText(""); 
		editName.setText(""); 
		//textDailyTotal.setText(""); 
	}

}//end class
