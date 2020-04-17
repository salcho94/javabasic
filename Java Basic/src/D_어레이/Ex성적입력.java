package D_어레이;

import java.util.*;

public class Ex성적입력 {

	public static void main(String[] args) {
		//학생 점수를 입력받아 평균과 총점을 출력해주세요
		//입력형식이 80/88/77
		//출력 형식은  총점:   평균 :
		//		int[]score= new int[3];
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("학생의 점수를 입력하시오");
		//	    for(int i=0;i<3;i++) {
		//			score[i]=sc.nextInt();
		//		}
		//		int total=0;
		//		for(int k =0;k<score.length;k++) {
		//			total+=score[k];
		//		}
		//		int avr=total/3; 
		//	
		//		System.out.println("총점:"+total);
		//		System.out.println("평균:"+avr);
		//		오류답안
		int[]score= new int[3];
		System.out.println("성적을 입력하시오 )88/99/77)");
		Scanner sc=new Scanner(System.in);
		String temp=sc.nextLine();
		StringTokenizer st = new StringTokenizer(temp,"/");
		for(int i=0;st.hasMoreTokens();i++) {
			String token= st.nextToken();
			score[i]=Integer.parseInt(token);

		}int total=0;
		for(int k =0;k<score.length;k++) {
			total+=score[k];
		}
		int avr=total/3; 

		System.out.println("총점:"+total);	
		System.out.println("평균:"+avr);
	}




}