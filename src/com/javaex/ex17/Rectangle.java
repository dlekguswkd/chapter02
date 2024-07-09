package com.javaex.ex17;

public class Rectangle extends Shape implements Drawable{
	
		//필드
		private int width;
		private int height;
		
		//생성자
		public Rectangle() {
			super();
		}
		
		public Rectangle(int width, int height, String fillColor, String lineColor) {
			/*
			부모가 private 일떄
			super();
			super.setFillColor(fillColor);
			super.setLineColor(lineColor);
			this.width = width;
			this.height = height;
			*/
			
			/*
			부모가 private 일떄
			super(fillColor, lineColor);
		 	this.width = width;
		 	this.height = height;
			 */
			
			//부모의 필드가 protected
			super();
			super.fillColor = fillColor;
			super.lineColor= lineColor;
			this.width = width;
		 	this.height = height;
			
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

		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
					+ lineColor + "]";
		}
		
		//오버라이드 메소드는 꼭 만들어야한다
		public void draw() {
			System.out.println("=====사각형을 그렸습니다========");
			System.out.println("가로:"+width);
			System.out.println("세로:"+height);
			System.out.println("면색:"+fillColor);
			System.out.println("선색:"+lineColor);
			System.out.println("====================");
		}
		
		//면적구하기
		public double area() {
			return width*height;
		}
	

}
