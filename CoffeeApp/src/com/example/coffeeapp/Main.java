package com.example.coffeeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main extends Activity {
	//Field to hold order data
	private Orders orders;
	private Drink currentDrink;
	
	//Fields for UI objects
	private Button buttonHot;
	private Button buttonCoffee;
	private Button buttonFrap;
	private Button buttonExpresso;
	private Button buttonTall;
	private Button buttonGrande;
	private Button buttonVenti;
	private Spinner spinnerFlavor;
	private Spinner spinnerDairy;
	private Button buttonAddDrink;
	private Button buttonResetOrder;
	private TextView textDrinksAdded;
	private TextView textCurrentDrink;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	//initialize orders
		orders = new Orders();
		currentDrink = new Drink();
		
		//Bind to XML
		buttonHot=(Button)findViewById(R.id.buttonHot);
		buttonCoffee=(Button)findViewById(R.id.buttonCoffee);
		buttonFrap=(Button)findViewById(R.id.buttonFrap);
		buttonExpresso=(Button)findViewById(R.id.buttonExpresso);
		buttonTall=(Button)findViewById(R.id.buttonTall);
		buttonGrande=(Button)findViewById(R.id.buttonGrande);
		buttonVenti=(Button)findViewById(R.id.buttonVenti);
		spinnerFlavor=(Spinner)findViewById(R.id.spinnerFlavor);
		spinnerDairy=(Spinner)findViewById(R.id.spinnerDairy);
		buttonAddDrink=(Button)findViewById(R.id.buttonAddDrink);
		buttonResetOrder=(Button)findViewById(R.id.buttonResetOrder);
		textDrinksAdded=(TextView)findViewById(R.id.textDrinksAdded);
		textCurrentDrink=(TextView)findViewById(R.id.textCurrentDrink);
		
	
	
	
	
	
	
	
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
}
