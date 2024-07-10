package com.javaex.ex18;

public class Ex03 {

	public static void main(String[] args) {
		
		Point p01=new Point(2,5);
		p01.draw();
		
		
		try {
			Point p02= null;		//주소가 없는경우 
			p02.draw();

		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			
		}	//finally  생략 (공통인부분)
		
		System.out.println("프로그램 종료");
	}

}
