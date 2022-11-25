package com.cg.oisoos;

import java.io.Serializable;

public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String desc;
	private int number;
	private int price;
	
	public Course(int id, String name, String desc, int number, int price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.number = number;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", desc=" + desc + ", number=" + number + ", price=" + price
				+ "]";
	}
}
