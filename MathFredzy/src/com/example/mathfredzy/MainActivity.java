package com.example.mathfredzy;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Bundle extras = getIntent().getExtras();
		String extrasNew = extras.getString("EXTRAS");
		System.out.println(extrasNew);
	}
}
