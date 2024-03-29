package com.example.ui_basetest;

public class Foods {
	// 菜品名称
	private String name;
	// 图片
	private int drawable;
	// 味道
	private boolean isHot;
	private boolean isFish;
	private boolean isSour;
	// 价格
	private float price;

	/**
	 * 
	 * @param name
	 * @param price
	 * @param drawable
	 * @param isHot
	 * @param isFish
	 * @param isSour
	 */
	public Foods(String name, float price, int drawable, boolean isHot, boolean isFish, boolean isSour) {
		super();
		this.name = name;
		this.drawable = drawable;
		this.isHot = isHot;
		this.isFish = isFish;
		this.isSour = isSour;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDrawable() {
		return drawable;
	}

	public void setDrawable(int drawable) {
		this.drawable = drawable;
	}

	public boolean isHot() {
		return isHot;
	}

	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}

	public boolean isFish() {
		return isFish;
	}

	public void setFish(boolean isFish) {
		this.isFish = isFish;
	}

	public boolean isSour() {
		return isSour;
	}

	public void setSour(boolean isSour) {
		this.isSour = isSour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Foods [name=" + name + ", drawable=" + drawable + ", isHot=" + isHot + ", isFish=" + isFish
				+ ", isSour=" + isSour + ", price=" + price + "]";
	}

}
