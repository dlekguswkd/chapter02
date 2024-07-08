package com.javaex.ex15;

public class Shape {

	//필드
	protected String fillColor;	//면색
	protected String lineColor;	//선색
	
	//생성자
	public Shape() {
		super();
	}
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 gs
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	/*
	public void draw() {
		System.out.println("=====도형을 그렸습니다========");
		System.out.println("면색:"+fillColor);
		System.out.println("선색:"+lineColor);
		System.out.println("====================");
	}
	*/
	
	//덮어쓰기
	public void draw() {
		
	}
	
}
