package h_inherit4;

public class Test {

	public static void main(String[] args) {
					
		Item[] item = method();// 반드시 메모리에 적용
		for(int i=0;i<item.length;i++) {
			item[i].output();// 다형성
		}
	}
	
	static Item[] method() {
		//Item a = new Item; 추상클래스는 객체생성이 안됨 부모클래스 역할만 한다
		Book b = new Book("0001","자바","홍길동","코스모");
		CD c= new CD("002","아는노래","지코");
		Dvd d = new Dvd("003","킹덤","주지훈","김은희"); 
		
		Item[]i = new Item[3];// 배열을 사용하여 하나로 묶어서 사용한다.
		i[0] = b;
	    i[1] = c;
	    i[2] = d;
	    
	    return i;
	}
}
