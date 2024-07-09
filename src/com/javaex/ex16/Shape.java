package com.javaex.ex16;

public abstract class Shape {
	
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
		@Override		public String toString() {
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
		//draw()
		public abstract void draw();		//오버라이딩 전용 abstract 예약어 사용, 내용을 표현하는곳이 없다
		
		//abstract 메소드를 가지고 있는 클라스는 메모리에 올릴수 없다
		//따라서 클래스에도 abstract 예약어 사용
		//상속전용
		
		//area() 면적구하기
		public abstract double area();
		
}


