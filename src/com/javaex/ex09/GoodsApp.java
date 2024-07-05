package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		//static조사 Goods counter 
		
		
		//필드
		
		//생성자
		
		//메소드 gs
		
		//메소드 일반
		Goods computer=new Goods("LG그램" , 1000000);
		System.out.println(computer.toString());
		
		System.out.println(computer.getCount());
		
		
		Goods cup=new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		System.out.println(computer.getCount());
		
		Goods camera=new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		System.out.println(computer.getCount());
		System.out.println(cup.getCount());
		
		System.out.println(Goods.count);

		showEnd();
	}
		public static void showEnd() {
			System.out.println("---------------");
			System.out.println("--프로그램 종료--");
			System.out.println("---------------");
		
	}

}
