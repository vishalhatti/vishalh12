package com.xworkz.tiffinBox;

public class TiffinBox {
	private String brandName;
	private String Color;
	private double price;
	
	public void haveLunch() {
		System.out.println("INVOKED LUNCH");
	}
	

	public TiffinBox(String brandName, String color, double price) {
		super();
		this.brandName = brandName;
		Color = color;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
