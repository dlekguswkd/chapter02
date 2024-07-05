package com.javaex.ex04;

//클래스명
public class point {
	
	//필드
	
	private int x; //이 두개가 this. x, y를 뜻함
	private int y;
	
	//생성자
	/*이두개는 구별이 안됨
	public point() {
		
	}
	public point(int x) {
		this.x=x;
	}
	public point(int y) {
		this.y=y;
	}
	*/
	
	//메소드
	//x 저장(x값 넣기)
	public void setX(int x) {
		this.x=x;
	}
	
	//x 읽기
	public int getX() {
		return x;
	}
	
	//y 저장
	public void setY(int y) {
		this.y=y;
	}
	
	//y 읽기
	public int getY() {
		return y;
	}
	
	//정보출력
	public void draw() {
		System.out.println("점[x="+ x +", y="+ y +"]을 그렸습니다." );
	}

}
