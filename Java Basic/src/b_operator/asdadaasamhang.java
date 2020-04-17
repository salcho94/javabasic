package b_operator;

import java.util.Scanner;

public class asdadaasamhang {

	public static void main(String[] args) {
		// 학생점수를 입력박아 80점 이상이면 "합격" 이라고 출력 그렇지 안으면 "불합격" 출력
		   // 삼항 연산자 이용 한다
		int score=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력");
		score=scanner.nextInt();
		String result=((score>=80)?"합격":"불합격");
		System.out.println("결과 :"+result);
	
		
	}

}
