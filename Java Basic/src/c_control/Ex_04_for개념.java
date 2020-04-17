package c_control;

public class Ex_04_for개념 {

	public static void main(String[] args) {
	//for(초기치;조건식;증가치){
		//반복구문
//}
		//인삿말 5번 출력
//		for(int i=0; i<5 ;i++) {
//			System.out.println("안녕하세요");
//		}
		//1. 1~100까지의 합을구하시오
//		int hap = 0;
//		for(int i=1;i<101;i++){
//		  	hap+=i;
//	}//i변수는 for문을 벗어나면 사라진다.
// System.out.println("합은="+hap);
		//2.1~100까지 홀수의 합과 짝수의합 구하기
//		int even=0,odd=0;
//		for(int i=1;i<101;i++) {
//			if(i%2==0)
//				even+=i;
//			else 
//				odd+=i;
//			}
//			System.out.println("짝수의 합은"+even);
//			System.out.println("홀수의합은"+odd);
		//3.a부터z까지를 출력하세요 
		for(char ch='A';ch <='Z';ch++) {
			System.out.print(ch);
		}
		System.out.println();//줄바뀜 목적으로 일부로 대행해줌
		//4.a부터z까지출력(2개씩 건너뛰기)
		for(char ch='A';ch<='Z';ch+=2) {
			System.out.print(ch);
		}
		System.out.println();
		//5. Z부터A까지 출력
		for(char ch='Z';ch>='A';ch--) {
			System.out.print(ch);
		}
		
		
		
		
		
	}
}