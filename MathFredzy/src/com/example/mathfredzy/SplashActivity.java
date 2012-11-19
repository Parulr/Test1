package com.example.mathfredzy;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        new Handler().postDelayed(new Runnable(){

			@Override
			public void run() {
				Intent newintent = new Intent(SplashActivity.this,HomeActivity.class);
				newintent.putExtra("CALLED_FROM","SplashActivity");
				startActivity(newintent);
			}
        	
        }, 3000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash, menu);
        return true;
    }

    
}
