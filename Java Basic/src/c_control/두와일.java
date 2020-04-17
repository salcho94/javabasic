package c_control;

import java.util.Scanner;

public class 두와일 {

public static void main(String[] args) {
	String result ="";
	do{
		Scanner input=new Scanner(System.in);
		System.out.println("숫자 입력하시오");
		int i=input.nextInt();
	
	for(int su=1;su<=9;su++) {
		System.out.printf("%d * %d= %d\n",i,su,i*su);
	    }
		System.out.println("구구단 다시 할까요?");
		result = input.next();
	}while ( result.equals("Y") | result.equals("y"));   
	
	
	

}
}