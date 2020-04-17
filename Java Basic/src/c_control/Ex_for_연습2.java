package c_control;

import java.util.Scanner;

public class Ex_for_연습2 {

	public static void main(String[] args) {
		//		//1~ N까지의 숫자를 다음처럼 출력하
		//		 
		//		int num=15;
		//		for(int i=1;i<=num;i++) {
		//				System.out.print(i+ "\t");
		//		if(i%5==0)
		//				System.out.println();
		//		}
		//		

		//		문자열처리하기
		//
		//		문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
		//		N이 대문자이면 문자 N부터  Z까지 출력하라
		//		그 밖의 문자가 입력되면 Error 를 출력하라
		//
		//		입력  출력
		//		f       abcdef
		//		X       XYZ
		//		6       Error

		//		Scanner sc = new Scanner(System.in);
		//		char N = sc.nextLine().charAt(0);
		//		if('A'<=N && N<='Z') { //A-Z 대문자이면
		//		for(char ch = N; N<='Z'; N++ ) { // 입력 N 부터 Z까지
		//		System.out.print(N); // N을 출력후 N++
		//		}
		//		}
		//		else if('a'<=N && N<='z') { //a-z 소문자이면
		//		for(char ch = 'a'; ch<=N; ch++ ) { //ch='a'부터 입력 N까지
		//		System.out.print(ch); //ch출력후 ch++
		//		}
		//		}
		//		else //대문자 소문자도 아니면
		//		{
		//		System.out.println("error"); //error 출력
		//		}





		for(int i=0;i<26;i++) {
			for(char ch='A'; ch<='Z'-i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
		
		
//		for(int i=0;i<26;i++) 
//		{
//			for(char ch=(char) ('A'+i); ch<='Z';ch++) 
//			{
//				System.out.print(ch);
//			}
//			System.out.println();

//		    
//		}

//		for(int i=0;i<26;i++) {
//			for(char ch='A'; ch<='Z';ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();

}
	}
}


