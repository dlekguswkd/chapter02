package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		Goods computer= new Goods();
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		// System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		//cup.setName("머그컵"); 수정용으로 쓰려고 남겨두는 느낌
		//cup.setPrice(2000);  가격이나 이름이 변경될수있기 때문에 

		System.out.println(cup.toString());

	}

}
