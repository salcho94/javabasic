package Alone;

public class shop {
		long orderNumber;
		String id;
		String day;
		String name;
		String code;
		String address;
		
		public void func1() {//메인 함수를 지정하여서 한곳에 적용가능하다
			System.out.println( "주문번호 : " + this.orderNumber);
			System.out.println( "이름 :" + this.name );
		}
}
