package c_control;

import java.util.Scanner;

public class 성적 {

	public static void main(String[] args) {
		// 국,영,수 점수 입역받아서 총점, 평균출력
		// 평균에 따른 학점(A~f)출력
		//
		int kor=0, eng=0, math=0;



		Scanner input = new Scanner(System.in);
		System.out.print("국어점수->");
		kor=input.nextInt();
		System.out.println("영어점수->");
		eng=input.nextInt();
		System.out.println("수학점수->");
		math=input.nextInt();


		int total	=kor+eng+math;
		System.out.println("총점"+total);

		double avg=(double)total/3.0;
		System.out.println("평균"+avg);	
		
		if(avg>=90) {
			System.out.println('A');
		}
		else if(avg>=80) {
			System.out.println('B');
		}
		else if(avg>=70) {
			System.out.println('C');
		}
		else if(avg>=60) {
			System.out.println('D');
		}
		else if(avg>=50) {
			System.out.println('E');
		}else 
			System.out.println('F');
		}

	}











