package c_control;

import java.util.*;

public class Ma {
	public static void main(String[] args) {
	//1부터 3까지 출력만 할꺼에요 
//	for(int i=1;i<=3;i++) {
//		System.out.println(i);
//	}
	//3행2열 행렬을 가상하고 번호를 붙이기
//	for(int i=0; i<3 ; i++)  { //행= 가로 가 행이다 
//		for(int j=0 ; j<2 ; j++) //열 = 세로가 열이다
//		{
//		System.out.printf("< %d ,  %d>",i ,j);	
//		}
//		System.out.println();
//		
//	}
//	Scanner input=new Scanner(System.in);
//	System.out.println("첫번째 수 입력하시오");
//	int i=input.nextInt();
//	
//	for(int k=1; k<=6; k++) {
//		for(int j=1; j<=6; j++) {
//			if(i == k+j) {
//				System.out.println(k +" "+ j);}
//		문제 2)
//	 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
//	 
//	 입력
//	 10 20 30 55 66 77 88 99 100 15
//	 
//	 출력
//	 짝수 : 6개
//	 홀수 : 4개		
//	
//		package c_control;
//
//		import java.util.Scanner;
//		import java.util.StringTokenizer;
//
//		public class Ex05_while연습 {
//		   public static void main(String[] args) {
//		      Scanner scanner = new Scanner(System.in);
//		      String str ="";
//		      int oddNum=0, evenNum=0;
//		      str = scanner.nextLine();
//		      StringTokenizer st = new StringTokenizer(str);//문자열을 쪼개서 저장한다 str은 스캐너 변수 문자열이 공백이다
//		      while(st.hasMoreTokens())
//		      {
//		         int n= Integer.parseInt(st.nextToken());
//		         if(n%2==0)
//		            evenNum++;
//		         else
//		            oddNum++;
//		      }
//		      System.out.println("짝수 : " + evenNum);
//		      System.out.println("홀수 : " + oddNum);
//		   }
//		}	
		int cnt=0;
	      for(int i=1; i<=10000; i++)
	      {
	         int temp=i;
	         boolean b = true;
	         while(b)
	         {
	            if(temp%10 == 8) cnt++;
	            if(temp<10)b=false;
	            temp/=10;
	         }
	      }
	      System.out.println(cnt);
			
	}
}

	
	
		
		
	
	
	
	






