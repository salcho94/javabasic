package e_static;
/**
 * 무엇인가를 공유 하고싶을 때 사용한다 스태틱영역에 따로 잡는다.
 * 단 하나로 공유:static-새로운 메모리생성한다 
 * -고로  객체명이 아닌 클래스명 접근 가능
 *
 */
public class Main {

	public static void main(String[] args) {
		

//		Book b1 = new Book();
//		Book b2 = new Book();
//		Book b3 = new Book();
		System.out.println("총갯수 "+Book.getCount());
		
		

	}

}
