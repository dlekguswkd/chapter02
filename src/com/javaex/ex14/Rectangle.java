package com.javaex.ex14;

public class Rectangle { //사각형
	
	//필드
	private int width;		//가로
	private int height;		//세로
	private String fillColor;	//면 색깔
	private String lineColor;	//선 색깔
	
	
	//생성자 2개
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {
		super();
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

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
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	//사각형을 시각화하는 복잡한 로직작동
	public void draw() {
		System.out.println("=====사각형을 그렸습니다========");
		System.out.println("가로:"+width);
		System.out.println("세로:"+height);
		System.out.println("면색:"+fillColor);
		System.out.println("선색:"+lineColor);
		System.out.println("====================");
	}

}
