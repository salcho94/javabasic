package f_innerclass;
//클래스 안에 클래스 
//이 아이들은 $가 붙어요 오류 아님
class Outer
{//안쪽에있는 클래스는 멤버변수처럼 취급이된다$ 들어가도 하나의 클래스명이다.
//	static class Inner
	class Inner
	{
	//	static 
		void naJabara(){
			System.out.println("static");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) 
	{
		Outer o = new Outer();//메모리 생성
		Outer.Inner in = o.new Inner();//
//		Outer.Inner in = new Outer.Inner();
		in.naJabara();//지금이순간 이함수는 클래스명!
		//Outer.Inner.naJabara();
	}
}


