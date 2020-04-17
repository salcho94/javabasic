
public class Main {
//위의 main 은클래스명 아래는 메소드명
	public static void main(String[] args) {
		
		String name="홍길자";
		int age =24;
		double height=190.99;
		method(name,age,height);
	}//메인함수에서 인자로 받아서 출력 
	static void method(String name,int age,double height) {
	
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
