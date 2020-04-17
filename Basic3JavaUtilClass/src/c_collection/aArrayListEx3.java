package c_collection;

import java.util.*;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> list=method();
		
		for(int i=0;i<list.size();i++) {// 오리지날 for문
			Student data = (Student)list.get(i);
			System.out.println(data);
		}
//		for(Student data:list)           /신규 for 문
//			System.out.println(data);
//		
		
	
	}
	static ArrayList<Student> method() {//return 되는 자료형 적어줘야함
		// 세명의 학생정보를 저장 :ArrayList 이용
		Student a = new Student("홍길동",15);
		Student b = new Student("홍",25);
		Student c = new Student("홍숙",35);
		ArrayList<Student> list = new ArrayList<Student>();//<> 선언시에만  신규for문사용이 가능
		list.add(a);
		list.add(b);
		list.add(c);
		return list;
		
		
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
