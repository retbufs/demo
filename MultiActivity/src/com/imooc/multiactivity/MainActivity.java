package com.imooc.multiactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button other_btn;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		other_btn = (Button) findViewById(R.id.other_activity);
		
		other_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//常见Intent对象
				Intent  intent = new Intent();
				//调用setClass 方法，设置要启动的activity
				intent.setClass(MainActivity.this, OtherActivity.class);
				//启动当前intent对象
				startActivity(intent);
				
				
			}
		});
		
	}
}
