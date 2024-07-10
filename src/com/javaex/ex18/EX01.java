package com.javaex.ex18;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num =sc.nextInt();
		
		/*
		 if (num==0) {
		 	System.out.println("0으로 나눌수 없습니다.");
		 }else {
		 	double result=100/num;
		 }
		 */
		
		try {
			//예외상황이 발생할수있을때
			double result=100/num;
			//정상적일때 해라
			System.out.println(result);
			
		}catch(ArithmeticException e) {  //정상적일때 오지않음 /0으로 나눌때 e->error준말로 보통 e로 많이씀
			System.out.println(e.toString());
			System.out.println("0으로 나눌수 없습니다.");
			
		}finally {
			System.out.println("공통인영역");
		}
		System.out.println("프로그램종료");
		
		sc.close();

	}

}
