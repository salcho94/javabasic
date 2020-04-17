package h_inherit3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {// 메인 함수가 존재할때 출력이 가능함 ~!
		  
		  Item i  = null;
		  
		  Scanner input = new Scanner(System.in);
		  System.out.println("상품선택(1. Book  2.Dvd   3.Cd)");
		  int sel = input.nextInt();
		  switch(sel) {
		  //부모변수에 자식생성 가능함 (상속관계)
		  case 1: i = new Book("0001","자바","홍길동","코스모"); break;
		  case 2: i = new Dvd("002","킹덤","주지훈","김은희"); break;
		  case 3: i = new CD("00001","아는노래","지코"); break;
		  }
		  // 출력*****
		  //2. overriding
		  i.output(); 
	}

}
