package com.viewpagertest;

import com.viewpagertest.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class AddTimeActivity extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtimepageviewadapter);
        
        AddTimePagerAdapter adapter = new AddTimePagerAdapter();
        ViewPager pager = (ViewPager) findViewById(R.id.addtimepager);
        pager.setAdapter(adapter);
        pager.setCurrentItem(0);
	}
	/**
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		super.onStart();
		// TODO Put your code here
	}
}
