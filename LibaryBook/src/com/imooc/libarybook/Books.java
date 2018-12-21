package com.imooc.libarybook;

import java.util.Date;

public class Books {
	private Date inTime;  //归还时间
//	private Date outTime;  //借出时间
	//书名
	private String book_name;
	//
	private int book_ico;
	//书籍类型
	private boolean isHistory;
	private boolean isSupense;
	private boolean isLiter;
	//适应年龄
	private int age;
	
	/**
	 * 
	 * @param inTime
	 * @param outTime
	 * @param book_name
	 * @param book_ico
	 * @param isHistory
	 * @param isSupense
	 * @param isLiter
	 * @param age
	 */
	public Books(Date inTime, String book_name, int book_ico, boolean isHistory, boolean isSupense,
			boolean isLiter, int age) {
		super();
		this.inTime = inTime;
//		this.outTime = outTime;
		this.book_name = book_name;
		this.book_ico = book_ico;
		this.isHistory = isHistory;
		this.isSupense = isSupense;
		this.isLiter = isLiter;
		this.age = age;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
//	public Date getOutTime() {
//		return outTime;
//	}
//	public void setOutTime(Date outTime) {
//		this.outTime = outTime;
//	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_ico() {
		return book_ico;
	}
	public void setBook_ico(int book_ico) {
		this.book_ico = book_ico;
	}
	public boolean isHistory() {
		return isHistory;
	}
	public void setHistory(boolean isHistory) {
		this.isHistory = isHistory;
	}
	public boolean isSupense() {
		return isSupense;
	}
	public void setSupense(boolean isSupense) {
		this.isSupense = isSupense;
	}
	public boolean isLiter() {
		return isLiter;
	}
	public void setLiter(boolean isLiter) {
		this.isLiter = isLiter;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Books [inTime=" + inTime  + ", book_name=" + book_name + ", book_ico="
				+ book_ico + ", isHistory=" + isHistory + ", isSupense=" + isSupense + ", isLiter=" + isLiter + ", age="
				+ age + "]";
	}
	

	
	
}
