package com.imooc.ui_button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Fourth extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_layout);
		
	}
	
	public void MyButtonClick(View v) {
		Toast.makeText(Fourth.this, "FourthActivity", Toast.LENGTH_SHORT).show();
	}

}
