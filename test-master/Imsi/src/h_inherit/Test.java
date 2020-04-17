package h_inherit;
/*
 * 함수명 동일하게주는경우
 * 1. overloading :동일한 함수명을 사용 인자의 자료형과 갯수가 달라야함
 * 
 * 2. overriding :*상속관계*에서 부모자식간에 인자와 반환값까지 동일한 함수들
 * 
 */
public class Test {

	public static void main(String[] args) {
		//각각의 클래스를 생성
//		Umma u = new Umma();
//		u.gene();
//		u.job();
		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//		
//		//*
//		d.job();
		//2.변수는 부모변수 객체는 자식개체 
		//비교연산자-instanceof
		//3. 객체임을 확인
//		Ddal d = new Ddal();
//		if(d instanceof Ddal) {
//			System.out.println("딸이야");
//		}
//		if(d instanceof Ddal) {
//			System.out.println("엄마야");
//		}
		
		//4.형변환 
		//(casting):기본형/상속관계의 클래스는 가능
		//String a = new String("Hello");X
		//int i = (int)a;X
		
		Umma a = new Umma();// 엄마만참조
		//Ddal b =(Ddal)a;// 존재하지도 않는 메모리를 건드렸어 에러남
		
		
		Ddal c = new Ddal();
		Umma d = (Umma)c;// up-casting
		Ddal e = (Ddal)d;// Down-casting
		
	}

}
