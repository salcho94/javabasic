package c_array;

import java.util.Scanner;

public class Main {

	/**
	 * 			배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) {//배열을위한 클래스를위한 객체생성 반드시 2개해줘야함
		Scanner in = new Scanner(System.in);
		
		Student [] s = new Student[3];		// 학생 수 3은 배열의 갯수를 의미한다.
		for(int i=0; i<s.length ; i++) {
			s[i] = new Student();//클래스만을 위한new
			//각각 학생의 이름과 국영수 점수를 입력받아 이름과 총점 평균 출력
			System.out.println("이름입력:");
			s[i].setName(in.next());
			System.out.println("국어입력:");
			s[i].setKor(in.nextInt());
			System.out.println("영어입력:");
			s[i].setEng(in.nextInt());
			System.out.println("수학입력:");
			s[i].setMath(in.nextInt());
			
			System.out.println((i+1)+"번째학생->"+ s[i].getName());
			System.out.println("총점:"+ s[i].calTotal()+"/"+"평균"+s[i].calAverage());


		}


	}

}
