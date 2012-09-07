package com.viewpagertest;

import com.viewpagertest.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeScreenActivity extends Activity {
	
	//Context context = getApplicationContext();
	//String inProgressToastText = "Functionality not implemented, choose something else n00b";
	//int toastDuration = Toast.LENGTH_SHORT;
	//Toast inProgressToast = Toast.makeText(context, inProgressToastText, toastDuration);
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		
	}
	
	
	
	public void addTimeClick(View v) {
		Intent addTimeIntent = new Intent(HomeScreenActivity.this, AddTimeActivity.class);
		HomeScreenActivity.this.startActivity(addTimeIntent);
	}
	public void addOnCallClick(View v) {
		//TODO: In progress
		//inProgressToast.show();
	}
	public void myTimeClick(View v) {
		//TODO: In progress
		//inProgressToast.show();
	}
	public void myCalendarClick(View v) {
		//TODO: In progress
		//inProgressToast.show();
	}
	public void myReportsClick(View v) {
		//TODO: In progress
		//inProgressToast.show();
	}
	public void logoutClick(View v) {
		//TODO: In progress
		//inProgressToast.show();
	}
	
}
