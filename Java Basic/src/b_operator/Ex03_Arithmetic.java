package b_operator;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

 //나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
//		int num1,num2,sum,sub,mul,div;
//		Scanner input = new Scanner(System.in);
//		System.out.println("첫번째 정수 입력");
//		num1 = input.nextInt();
//		System.out.println("두번째 정수 입력");
//		num2 = input.nextInt();
//		sum = num1 + num2;
//		sub = num1 - num2;
//		mul = num1 * num2;
//		div = num1 / num2;
//		System.out.println("두 정수의 덧셈 결과 "+ sum);
//		System.out.println("두 정수의 뺄셈 결과"+ sub);
//		System.out.println("두 정수의 곱하기 결과"+ mul);
//		System.out.println("두 정수의 나누기 결과"+ div);
				
		
		
			int su=0;//나머지 연산자 활용 -홀/짝수 구하기
			Scanner input = new Scanner(System.in);//Scanner 선언
			System.out.println("정수를 입력하세요");//화면에 정수를 입력하세요
			su= input.nextInt();//입력받은 정수를 su변수에 저장
			
			//입력받은 수가 홀/짝수 구하기
			if ( su%2==0 ) {
				System.out.println("짝수");
			}else {System.out.println("홀수");
			}
			
			// 입력받은 수가 3의 배수인지 아닌지 확인 
			if ( su%3==0 ) {
				System.out.println("3의 배수다");
			}else {System.out.println("3의 배수 아니다");
			}
			
			}
			
		
		
	}


