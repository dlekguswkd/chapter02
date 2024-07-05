package com.javaex.ex03;

//클래스명
public class Goods {
	
	//필드 ->보호한다(캡슐화)
	private String name;
	private int price;
	
	//생성자
	
	//메소드-------
	//이름저장
	public void setName(String name) {
		this.name = name;
	}
	
	//이름읽기
	public String getName() {
		return name;
	}
	
	//가격저장
	public void setPrice(int price) {
		this.price = price;
	}
	
	//가격읽기
	public int getPrice() {
		return price;
	}
	
	//정보출력문
	public void showInfo() {
		System.out.println("상품이름 : "+ name);
		System.out.println("가격 : "+ price);
		System.out.println("--------------");
	}

}
