package com.imooc.libarybook;

import java.util.Date;

public class Persion {
	private String usename;
	private Books book;
	private Date time;
	private String sex;
	private int age;
	
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Persion [usename=" + usename + ", book=" + book + ", time=" + time + 
				", sex=" + sex + ", age=" + age + "]";
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int readAge) {
		this.age = readAge;
	}

	
}
