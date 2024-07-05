package com.javaex.ex09;

public class Goods {
	
	//필드
	private String name;
	private int price;
	public static int count;  //건들이면 안되서 private로 했다가 나중에 몇번했나 나오게하려면 public으로 해야 나옴
	
	//생성자
	public Goods() {
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
		count++;
	}

	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	
}
