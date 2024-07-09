package com.javaex.ex16;

public class Circle extends Shape{
	
		//필드
		private int radius;
		
		//생성자
		public Circle() {
			super();
		}

		public Circle(int radius,String fillColor, String lineColor) {
			super();
			super.fillColor=fillColor;
			super.lineColor=lineColor;
			this.radius = radius;
		}

		//메소드 gs
		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		//메소드 일반
		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
		} 
	
		//오버라이드 메소드는 꼭 만들어야한다
		public void draw() {
			System.out.println("=====원을 그렸습니다========");
			System.out.println("반지름:"+radius);
			System.out.println("면색:"+fillColor);
			System.out.println("선색:"+lineColor);
			System.out.println("====================");
		}
		
		//면적구하기
		public double area() {
			return 3.14*radius*radius;
		}

		

}
