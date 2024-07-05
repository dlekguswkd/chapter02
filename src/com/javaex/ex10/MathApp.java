package com.javaex.ex10;

public class MathApp {
	
	//static 조사한다

	public static void main(String[] args) {
		
		/*
		이렇게 하지말고 앞에 static으로 만들어놨으니까
		Math math= new Math();
		System.out.println(math.plus(2, 4));
		*/
		
		int sum = Math.plus(5, 100);
		System.out.println(sum);
		
		System.out.println(Math.circle(5));
	}

}
