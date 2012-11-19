package com.example.mathfredzy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity
{
	private Button btnLearningCenter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		btnLearningCenter = (Button) findViewById(R.id.btn_learning_center);
		btnLearningCenter.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				
				Intent newintent = new Intent(HomeActivity.this,MainActivity.class);
				newintent.putExtra("EXTRAS","Parul");
				startActivity(newintent);
			}
			
		});
	}
	
}
