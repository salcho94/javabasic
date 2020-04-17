package D_어레이;

import java.util.Scanner;
import java.util.StringTokenizer;

public class E성적2 {

	public static void main(String[] args) {
		//		입력할 학생수를 입력하세요. 4
		//
		//		4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
		//
		//
		//
		//		1째 학생의 성적을 입력 -> 88/77/66
		//		2째 학생의 성적을 입력 -> 50/40/70
		//		3째 학생의 성적을 입력 -> 44/33/22
		//		4째 학생의 성적을 입력 -> 55/50/70
		//
		//
		//
		//		우선은 각각의 점수만 출력하세요	
		//		//학생수를 입력받아오세요   입력은 스캐너 사용한다 . 
		Scanner input=new Scanner(System.in);
		System.out.println("학생수입력");
		int su=input.nextInt();
		input.nextLine();


		int[][]score=new int[su][3];//학생당 과목 3가지 선언

		//입력

		for(int i=0;i<su;i++) {
			System.out.println((i+1)+"번째 학생의 성적을입력하세요");
			String jumsu=input.nextLine();	
			StringTokenizer st =new	StringTokenizer(jumsu, "/");
			int tokensu =st.countTokens();
			for(int j=0;j<tokensu;j++) {
				String strscore = st. nextToken();
				score[i][j]= Integer.parseInt(strscore);

			}

		}
		for(int i=0;i<score.length;i++) {
			for(int j=0;i<score[i].length;j++) {
				System.out.println(score[i][j]+"");
			}
			System.out.println();
		}
		
	}



}
