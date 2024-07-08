package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		//사각형 배열만들기
		Rectangle[] rArray=new Rectangle[3];
		//원 배열 만들기
		Circle[] cArray=new Circle[3];	

		// 사각형
		Rectangle r01=new Rectangle(3, 5, "빨강", "노랑");
		Rectangle r02=new Rectangle(10, 12, "노랑", "검정");
		Rectangle r03=new Rectangle(15, 2, "파랑", "빨강");
		
		//r01.draw();
		//r02.draw();
		//r03.draw();
		
		//배열에 사각형 넣기 (사각형 배열에 주소 넣기)
		rArray[0]=r01;
		rArray[1]=r02;
		rArray[2]=r03;
		
		//배열로 사각형 출력하기
		for (int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		// 원
		Circle c01=new Circle(5, "빨강", "노랑");
		Circle c02=new Circle(10, "검정", "파랑");
		Circle c03=new Circle(25, "주황", "파랑");
		
		//c01.draw();
		//c02.draw();
		//c03.draw();
		
		//배열에 원 넣기 (원 배열에 원의 주소 넣기)
		cArray[0]=c01;
		cArray[1]=c02;
		cArray[2]=c03;
		
		//배열로 원 출력하기
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		///////////////////////////////////////////
		
		//삼각형
			
	}

}
