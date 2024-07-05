package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {


		Person p01 = new Person("정우성", 45);
		//System.out.println(p01.toString());
		
		p01.showInfo();
		
		Student s01=new Student();
		s01.setSchoolName("제주");
		s01.setName("이효리");
		s01.setAge(45);
		s01.showInfo();
		
		Student s02=new Student("이효리", 34, "제주");
		s01.showInfo();   //똑같은 이름 썼을때 부모쪽은 안나오고 자식쪽만 나옴
		/*showInfo 이름 다르게 했을때
		s01.showInfo();  //부모쪽에 있는 showInfo
		s01.showInfo2();  //자식쪽에 있는 showInfo2
		*/
		
	}

}
