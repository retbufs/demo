package com.imooc.libarybook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TextView.OnEditorActionListener;

public class MainActivity extends Activity {
	// 年龄 +18
	private static final int AGE_MIN = 12;
	private EditText reader, outTime;
	private TextView view_age, time_view, view_book_author, view_redAge, view_books_name;
	private CheckBox history, suspense, lister;
	private boolean isHistory, isSuspense, isLister;
	private Persion persion;
	private int readAge;
	private RadioGroup gender;
	private RadioButton man, woman;
	private SeekBar seek_age;
	private ImageView image_view;
	private Button next, find;
	private List<Books> books;
	private List<Books> get_books;
	private int count = 0;
	private onRadioCheckedChangListener onRadioListener;
	private SeekBarListener seekBarListener;
	private onCheckedChangeListener onCheckChangeListener;
	private OnButtonClickListener onButtonListener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_libary);
		initView();
		initData();
		initListener();
		System.out.println(books);
	}

	// 初始化界面信息
	private void initView() {
		reader = (EditText) findViewById(R.id.reader);
		// 时间对象
		outTime = (EditText) findViewById(R.id.outTime);
		gender = (RadioGroup) findViewById(R.id.gender);
		man = (RadioButton) findViewById(R.id.man);
		woman = (RadioButton) findViewById(R.id.woman);
		// checkBox
		history = (CheckBox) findViewById(R.id.history);
		suspense = (CheckBox) findViewById(R.id.suspense);
		lister = (CheckBox) findViewById(R.id.liter);
		seek_age = (SeekBar) findViewById(R.id.age);
		image_view = (ImageView) findViewById(R.id.iamge_view);
		next = (Button) findViewById(R.id.next_btn);
		find = (Button) findViewById(R.id.find_btn);
		view_age = (TextView) findViewById(R.id.view_age);
		time_view = (TextView) findViewById(R.id.inTime);
//		view_book_author = (TextView) findViewById(R.id.view_book_author);
		view_redAge = (TextView) findViewById(R.id.view_redAge);
		view_books_name = (TextView) findViewById(R.id.view_books_name);

	}

	private void initData() {
		get_books = new ArrayList<Books>();
		books = new ArrayList<Books>();
		persion = new Persion();
		// 设置年龄默认为12
		persion.setAge(AGE_MIN);
		books.add(new Books(dateFormat("2018-12-05"), "人生感悟", R.drawable.aa, false, false, true, 22));
		books.add(new Books(dateFormat("2018-03-12"), "边城", R.drawable.bb, false, false, true, 20));
		books.add(new Books(dateFormat("2018-04-22"), "光辉岁月", R.drawable.dd, true, false, false, 25));
		books.add(new Books(dateFormat("2018-06-28"), "宋词三百首", R.drawable.ee, true, false, false, 12));
		books.add(new Books(dateFormat("2018-07-12"), "中国古代文学", R.drawable.f, true, false, true, 16));
		books.add(new Books(dateFormat("2018-10-12"), "无花果", R.drawable.ff, true, false, true, 31));
		books.add(new Books(dateFormat("2018-06-15"), "古镇记忆", R.drawable.hh, false, true, false, 40));
		books.add(new Books(dateFormat("2018-05-25"), "斗罗大陆", R.drawable.gg, false, false, false, 18));
	}

	/**
	 * 监听
	 */
	private void initListener() {
		seekBarListener = new SeekBarListener();
		seek_age.setOnSeekBarChangeListener(seekBarListener);
		onCheckChangeListener = new onCheckedChangeListener();
		onButtonListener = new OnButtonClickListener();
		onRadioListener = new onRadioCheckedChangListener();

		find.setOnClickListener(onButtonListener);
		next.setOnClickListener(onButtonListener);
		gender.setOnCheckedChangeListener(onRadioListener);
		history.setOnCheckedChangeListener(onCheckChangeListener);
		lister.setOnCheckedChangeListener(onCheckChangeListener);
		suspense.setOnCheckedChangeListener(onCheckChangeListener);

	}
	// 性别

	class onRadioCheckedChangListener implements android.widget.RadioGroup.OnCheckedChangeListener {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch (checkedId) {
			case R.id.man:
				persion.setSex("男");
				break;
			case R.id.woman:
				persion.setSex("女");
				break;
			}

		}

	}

	// 爱好
	class onCheckedChangeListener implements OnCheckedChangeListener {

		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			// 清空上一次查询
			get_books.clear();
			switch (buttonView.getId()) {
			case R.id.history:
				if (isChecked) {
					isHistory = true;
				} else {
					isHistory = false;
				}
				break;
			case R.id.suspense:
				if (isChecked) {
					isSuspense = true;
				} else {
					isSuspense = false;
				}
				break;
			case R.id.liter:
				if (isChecked) {
					isLister = true;
				} else {
					isLister = false;
				}
				Toast.makeText(MainActivity.this, "历史：" + isHistory + "悬疑:" + isSuspense + "文艺:" + isLister, 2000)
						.show();
				break;
			}
		}
	}

	// 获取年龄
	class SeekBarListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// 默认设置最低年龄为12岁
			readAge = MainActivity.AGE_MIN + seekBar.getProgress();
//			readAge = seekBar.getProgress();
			view_age.setHint(" " + readAge);
			persion.setAge(readAge);
			Toast.makeText(MainActivity.this, "当前年龄为：" + readAge, 2000).show();
		}

	}

	// 转换时间
	private Date dateFormat(String time) {
		SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-hh");
		Date date = null;
		try {
			date = slf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	// 按钮
	class OnButtonClickListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			System.out.println("mei:*****************");
			switch (v.getId()) {
			case R.id.find_btn:
				get_books.clear();
				String readName = reader.getText().toString();
				String inputTime = outTime.getText().toString();

				if (readName.isEmpty() && readName.equals("")) {
					Toast.makeText(MainActivity.this, "读者名称不能为空", Toast.LENGTH_SHORT).show();
					break;
				}
				if (inputTime.isEmpty() && inputTime.equals("")) {
					Toast.makeText(MainActivity.this, "日期不能为空", Toast.LENGTH_SHORT).show();
					break;
				}

				Date date = dateFormat(inputTime);
				// 默认最晚还时间
				Date defDate = dateFormat("2018-12-30");
				if (date.after(defDate)) {
					Toast.makeText(MainActivity.this, "借书日期：晚于还书日期", Toast.LENGTH_SHORT).show();
					finish();
					break;
				} else {
					findBooks(date);
					// 恢复为初始值
					count = 0;
					if (get_books.isEmpty()) {
						Toast.makeText(MainActivity.this, "没有符合的书籍", Toast.LENGTH_SHORT).show();
						break;
					}
					// 处理书籍问题：
					persion.setUsename(readName);
					// 取出getBook的书籍
//					Toast.makeText(MainActivity.this, "进入了这里---" + persion, Toast.LENGTH_SHORT).show();
					persion.setBook(get_books.get(count));
					image_view.setImageResource(persion.getBook().getBook_ico());
					view_redAge.setText(" " + persion.getBook().getAge());
					view_books_name.setText(persion.getBook().getBook_name());
					Toast.makeText(MainActivity.this, "" + persion, Toast.LENGTH_SHORT).show();
					count++;
					break;
				}
			case R.id.next_btn:
				getBooks();

				if (persion.getBook() == null) {
					Toast.makeText(MainActivity.this, "没有更多书籍信息了", Toast.LENGTH_SHORT).show();
					break;
				}
				Toast.makeText(MainActivity.this, "" + persion, Toast.LENGTH_SHORT).show();
				image_view.setImageResource(persion.getBook().getBook_ico());
				view_redAge.setText(" " + persion.getBook().getAge());
				view_books_name.setText(persion.getBook().getBook_name());

				break;
			}
		}

		private void getBooks() {
			if (count < get_books.size()) {
				persion.setBook(get_books.get(count));
				count++;
			} else {
				persion.setBook(null);
			}
		}

		private void findBooks(Date date) {
			System.out.println(date);
			for (int i = 0; i < books.size(); i++) {
				Books book = books.get(i);
				if (book.getInTime().getTime() <= date.getTime() && (book.isHistory() == isHistory
						&& book.isSupense() == isSuspense && book.isLiter() == isLister) && book.getAge() <= readAge) {
					get_books.add(book);
				}
			}
		}
	}
}
