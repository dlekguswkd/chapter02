package com.javaex.ex15;


public class ShapeApp {

	public static void main(String[] args) {
		
		//상속의 목적
		//부모의 코드 자식이 공통사용
		//-> 코드를 안짜도 된다
		//>>>>>코드가 수정될때 테스트 조금해도 된다
		
		Shape s00= new Shape();
		
		//사각형
		Rectangle r01 = new Rectangle(3, 5, "빨강", "노랑");
		System.out.println(r01.toString());
		
		//원
		Circle c01 = new Circle(10, "파랑", "노랑");
		System.out.println(c01.toString());
		
		//삼각형
		Triangle t01 = new Triangle(13, 15, "보라", "주황");
		System.out.println(t01.toString());
		
		
		Shape[] sArray=new Shape[3];
		
		//섞어쓰기
		//사각형 ---> 도형
		Shape s01 =new Rectangle(3, 5, "빨강", "노랑");
		
		//원 ---> 도형
		Shape s02 =new Circle(17, "빨강", "파랑");
		
		//삼각형 --> 도형
		Shape s03=new Triangle(10,20, "파랑", "파랑");
		
		//1개의 배열로 관리
		sArray[0]=s01;		//사각형 ---> 도형
		sArray[1]=s02;		//원 ---> 도형
		sArray[2]=s03;		//삼각형 --> 도형
		
		System.out.println("---------------------------");
		//섞어쓸때 이름이 같은게 있으면 자식에 메소드가 부모의 메소드로 덮여쓰임 -> 메소드 오버라이딩
		//동일한 이름일때만 오버라이딩
		System.out.println(sArray[0].toString());  // 부모의 메소드가 아닌 자식의 메소드가 나옴
		
		System.out.println("---------------------------");
		
		for (int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].toString());
		}
		
		System.out.println("==--=====-------======--==");
		for (int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//자식에 있는 메소드 따로 쓸때
		System.out.println(((Circle)s02).getRadius());
		System.out.println(((Rectangle)s01).getHeight());
		
	}

}
