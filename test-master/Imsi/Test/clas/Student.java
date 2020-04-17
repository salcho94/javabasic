package clas;
//학생 클래스 구현
public class Student {// 아래의 변수들이 클래스를 구성하는 멤버변수이다.
	String name;//이름
	int age;//나이
	String address;//주소
	int StudentID;//학번	
	int gread;//학년
	// 학생의 이름과 주소를 출력하는 메서드 만들기

	void show(){//void 메소드 지정 
		System.out.println(name + " "+ address);// 메서드 안에 학생클래스의 멤버변수 입력  후 출력
	}
	


}
