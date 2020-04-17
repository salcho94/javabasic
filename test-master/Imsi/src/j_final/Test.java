package j_final;

final class Parent{//부모 클래스
	final String field = "부모님꺼";
	final public void jib (){
		System.out.println("부모님이 만드신거");
	}
} 
class Child extends Parent{//자식 클래스, 부모의 멤버변수 맘대로 사용 가능 


	Child(){
		//super.field = "내꼬";
	}
	//public void jib () {
	//System.out.println("패가망신");
}

}


public class Test {
	public static void main(String[] args) {
		Child p = new Child();
		System.out.println(p.field);
		p.jib();
	}
}
