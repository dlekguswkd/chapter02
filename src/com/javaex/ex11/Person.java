package com.javaex.ex11;

public class Person {
	
	//필드
	private String name;
	private int age;
	/* 자식만들걸 이미 알때
	protected String name;
	protected int age;
	 */
	
	
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//정보출력
	public void showInfo() {
		System.out.println("-----------");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("-----------");
	}

}
