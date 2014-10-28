package com.example.caloriecounter;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class WeeklyHistory extends Activity {

	private Button mainMenuBtn; 
	private Button clearBtn; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weekly_history);
		mainMenuBtn = (Button)findViewById(R.id.mainMenuBtn); 
		clearBtn = (Button)findViewById(R.id.clearHistoryBtn); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.weekly_history, menu);
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
	
	public void mainMenuBtnClicked(View v){
		Intent menu = new Intent(this, MainActivity.class);
		startActivity(menu); 
	}
	
	public void clearBtnClicked(View v){
		
	}
}
