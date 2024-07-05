package com.javaex.ex11;

public class Student extends Person{
	
	//필드
	private String schoolName;

	//생성자
	public Student() {
		//super();
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {
		//super.name=name;  //name을  private으로 해놔서 안되는거임
		
		/* 방법1.부모의 기본생성자 사용	//person()   student(3) 나옴
		super(); //생략될수있지만 부모쪽부터 하고 옴
		super.setName(name);  //부모쪽의 이름 가져오기
		super.setAge(age);
		세줄이 밑에 한줄을 뜻함
		*/
		
		//방법2.부모의 다른생성자 (두개짜리)사용 person(2)  student(3) 나옴
		super(name, age);
			
		/*방법3. 부모의 필드의 접근제어자를 protected 놓는다
		부모필드에 있는 public String name을 protected String name으로 바꿔줘야함
		super.name=name;
		super.age=age;
		*/
		this.schoolName=schoolName;
		System.out.println("Student(3)");
	}
	
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	/* 이름을 부모쪽과 다르게 썼을때
	public void showInfo2() {
		System.out.println("-----------");
		System.out.println("이름: "+super.getName()); //private이라서 (super.)name 사용불가
		System.out.println("나이: "+super.getAge()); 	//private이라서 (super.)age 사용불가
		System.out.println("학교: "+schoolName);
		System.out.println("-----------");
	}
	*/
	//굳이 이름을 같게 만드는 이유 부모쪽에 정의된걸 사용하지 못하게하기위해서
	public void showInfo() {				//이름을 부모쪽과 똑같은걸 썼을때 (재정의)
		System.out.println("-----------");
		System.out.println("이름: "+super.getName()); //private이라서 (super.)name 사용불가
		System.out.println("나이: "+super.getAge()); 	//private이라서 (super.)age 사용불가
		System.out.println("학교: "+schoolName);
		System.out.println("-----------");
	}
	
}
