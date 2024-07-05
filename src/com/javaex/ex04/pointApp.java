package com.javaex.ex04;

public class pointApp {

	public static void main(String[] args) {
		
		point x =new point();
		x.setX(5);
		x.setY(5);
		
		point y =new point();
		y.setX(10);
		y.setY(23);
		

		x.draw();
		y.draw();
		
		/*
		point p03=new point(100); //x값만 세팅
		point p04=new point(500); //y값만 세팅
		*/
	}

}
