package javaTest;

public class Two {
	public static void main(String[]args) {
		예금주 b1 = new 예금주();

		예금주 b2 = new 예금주();


		 

		b1.setName("김동덕");

		b1.setAccountNo("1234-5678");

		b1.setBalance(100);

		b1.setRate(0.0);


		 

		b2.setName("홍길동");

		b2.setAccountNo("9999-2531");

		b2.setBalance(2000);

		b2.setRate(2.15);


		 

		System.out.println("첫 번째 은행 계좌의 정보입니다.");

		System.out.println(b1.toString() + "\n");


		System.out.println("두 번째 은행 계좌의 정보입니다.");

		System.out.println(b2.toString());
	}
}
