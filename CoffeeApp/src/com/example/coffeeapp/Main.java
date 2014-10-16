package com.example.coffeeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main extends Activity {
	//Field to hold order data
	private Orders orders;
	private Drink currentDrink;
	
	//Fields for UI objects
	private Button btnHot;
	private Button btnCoffee;
	private Button btnFrap;
	private Button btnExpresso;
	private Button btnTall;
	private Button btnGrande;
	private Button btnVenti;
	private Spinner spinnerFlavor;
	private Spinner spinnerDairy;
	private Button btnAddDrink;
	private Button btnResetOrder;
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
		btnHot=(Button)findViewById(R.id.btnHot);
		btnCoffee=(Button)findViewById(R.id.btnCoffee);
		btnFrap=(Button)findViewById(R.id.btnFrap);
		btnExpresso=(Button)findViewById(R.id.btnExpresso);
		btnTall=(Button)findViewById(R.id.btnTall);
		btnGrande=(Button)findViewById(R.id.btnGrande);
		btnVenti=(Button)findViewById(R.id.btnVenti);
		spinnerFlavor=(Spinner)findViewById(R.id.spinnerFlavor);
		spinnerDairy=(Spinner)findViewById(R.id.spinnerDairy);
		btnAddDrink=(Button)findViewById(R.id.btnAddDrink);
		btnResetOrder=(Button)findViewById(R.id.btnResetOrder);
		textDrinksAdded=(TextView)findViewById(R.id.textDrinksAdded);
		textCurrentDrink=(TextView)findViewById(R.id.textCurrentDrink);
		
		// Populate the Spinner for Flavor
		ArrayAdapter<CharSequence>flavorAdapter = ArrayAdapter.createFromResource(this,
				R.array.flavor_array,android.R.layout.simple_spinner_dropdown_item);
		//Specify the layout to use when the list of choices appears
		flavorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		//Apply to the Spinner
		spinnerFlavor.setAdapter(flavorAdapter);
		
		//Populate the Spinner for Dairy
		ArrayAdapter<CharSequence>dairyAdapter = ArrayAdapter.createFromResource(this,
				R.array.dairy_array, android.R.layout.simple_spinner_dropdown_item);
		dairyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
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
	//function for hot/cold Button
	pub
}
