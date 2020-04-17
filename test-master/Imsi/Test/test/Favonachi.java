package test;


import java.util.Scanner;

public class Favonachi {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 int a = 1, b = 1, temp;
		 int i;
		 System.out.println("몇번째 항까지 출력할까요?");i =sc.nextInt();
		 for(;i>=1;i--) {
			 System.out.print(a + " ");
			 temp = a+b; a=b; b = temp;
		 }
		 System.out.println();
		 System.out.println();

	}

}
