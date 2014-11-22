package yicheng.android.foodtrucktestapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivtiy extends Activity{
	Button fb_login_button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.login_activity_layout);
		
		fb_login_button = (Button) findViewById(R.id.fb_login_button);
		
		
	}

}
