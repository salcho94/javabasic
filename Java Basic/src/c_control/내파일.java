package c_control;

import java.util.Scanner;

public class 내파일 {
	//
	//	public static void main(String[] args) {
	//		문자열처리하기
	//
	//		문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
	//		N이 대문자이면 문자 N부터  Z까지 출력하라
	//		그 밖의 문자가 입력되면 Error 를 출력하라
	//
	//		입력  출력
	//		System.out.println("문자 하나 입력");
	//		Scanner input = new Scanner(System.in);
	//		char N = input.nextLine().charAt(0);//"A"
	//		//입력한 문자가 대문자라면?
	//		if('A'<=N && N<='Z') {
	//		for(char ch=N ;ch<='Z'; ch++) {
	//			System.out.print(ch);
	//		}
	//		}
	//		//그렇지않고 입력한 문자가 소문자 라면
	//		else if('a'<=N && N <='z') {
	//			for(char ch='a';ch<=N;ch++) {
	//				System.out.println(ch);
	//			}
	//		}
	//		
	//		//그외 라면
	//		else {
	//			System.out.println("err");
	//			
	//		}
	//		
	//		
	//	}}	
	//	*  문제가 어려운 것이 아니라 구글입사시험이라는 편견이 있었다.
	//	 *
	//	 * 문제  : 8의 숫자 세기(구글입사문제)
	//	 *
	//	 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
	//	 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
	//	 (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
	//	 결과 : 4000

	public static void main( String [] args ) {
		int a =0;
		for(int i=0;i<=9999;i++) {
			int  temp =i; 
			boolean b =true ;
			while(b) {
				if(temp%10 == 8) a++;
				if(temp<10)b=false;
				temp/=10;
			}

		}
		System.out.println(a);    

	}
}



