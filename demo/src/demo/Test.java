package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		Iterator it = list.iterator();
//		System.out.println(it.next());
		String s1 = "123";
		System.out.println(s1.concat("abc"));
		double a = 1.23D;
		System.out.println(a);
		System.out.println(28 % 10);
		char b = '\u234F';
		// https://class.imooc.com/exam/13/getuserexam?t=1

		SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = slf.parse("2014-12-23");
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		// yyyy-MM-dd
//			Calendar cal =Calendar.getInstance();
//			cal.setTime(da);
//		    System.out.println(da);

	}

}