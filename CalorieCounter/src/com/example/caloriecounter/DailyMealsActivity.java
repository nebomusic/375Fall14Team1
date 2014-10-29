package com.example.caloriecounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DailyMealsActivity extends Activity {
	private Spinner spinnerMeal;
	private Spinner spinnerSavemeal;
	private Button buttonSave;
	private Button buttonMain;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_meals);
		buttonSave = (Button)findViewById(R.id.buttonSave);
		buttonMain = (Button)findViewById(R.id.buttonMain);
		spinnerMeal = (Spinner)findViewById(R.id.spinnerMeal);
		spinnerSavemeal = (Spinner)findViewById(R.id.spinnerSavedMeal);
		
		// Spinner with Meal type (breakfast, lunch, dinner)
		ArrayAdapter<CharSequence>mealAdapter = ArrayAdapter.createFromResource(this, R.array.meal_array,
				android.R.layout.simple_spinner_dropdown_item);
		mealAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerMeal.setAdapter(mealAdapter);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_meals, menu);
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
	public void handleClick(View v){
		Intent Intent = new Intent (this,MainActivity.class);
		startActivity(Intent);
	}
}
