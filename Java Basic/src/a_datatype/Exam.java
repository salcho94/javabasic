package a_datatype;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		

	//나이와 키를 입력받아서 출력}
		
     Scanner input=new Scanner(System.in);
		System.out.println("나이->");
		int  age = input.nextInt();
		System.out.println("키->");
		double Key = input.nextDouble();
		System.out.println("이름입력->");
		input.nextLine();
		String name = input.nextLine();
		
		
		System.out.println("나이:" +age+"키:"+Key+"이름:" + name);
		
				
		
	}
}
  
    