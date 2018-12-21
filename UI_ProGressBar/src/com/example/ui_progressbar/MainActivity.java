package com.example.ui_progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	private ProgressBar progress;
	private Button btn_1, btn_2;
	private BtnOnClickListener btn_listener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progressbar_layout);
		initView();
	    btn_1.setOnClickListener(btn_listener);
	    btn_2.setOnClickListener(btn_listener);
       //设置精度条信息
	    //设置最大值
	    progress.setMax(100);
	    //设置首要进度
	    progress.setProgress(30);
	    //设置次要进度
	    progress.setSecondaryProgress(50);
	    
	}
   //初始化按钮信息
	private void initView() {
		btn_listener = new BtnOnClickListener();
		progress = (ProgressBar) findViewById(R.id.progress_bar);
		btn_1 = (Button) findViewById(R.id.btn_2);
		btn_2 = (Button) findViewById(R.id.btn_1);

	}

	//监听按钮
	class BtnOnClickListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_1:
				progress.incrementProgressBy(20);
				
				break;
			case R.id.btn_2:
				progress.incrementSecondaryProgressBy(40);
				break;
			}

		}

	}
}
