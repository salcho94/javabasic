package e_static;

public class Book {
	private static int count;//0을넣고시작지금 이순간 만나서 메모리에 올라간다
	// static 이붙는순간에 새로운 메모리 생성한다.
	public Book(){//new 가있을때마다 불려진다 생성자 함수
		count++;
		System.out.println("책 한개 생성");
	}
	public static int getCount() {
		return count;
	}// 다른 클래스로 값을 넘기기 위해서 만들었다
	//static클래스명 접근을 원해서
}
