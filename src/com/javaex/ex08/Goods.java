package com.javaex.ex08;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	//기본생성자
	public Goods() {	//자동으로 생김
	}					//다른생성자를 만들면 자동으로 생기지 않음
	//다 생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
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
	
	//메소드 일반
	//toString
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	//정보출력
	public void showInfo() {
		System.out.println("--------------------");
		System.out.println("상품이름: "+name);
		System.out.println("가격: "+price);
		System.out.println("--------------------");
		
	}

}
