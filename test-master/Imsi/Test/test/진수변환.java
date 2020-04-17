package test;

import java.util.Scanner;

public class 진수변환 {

	public static void main(String[] args) {
		for(int i=0 ;;i++) {
			System.out.println();
			System.out.println();
			
			
			System.out.println("10진수 입력 ㄱ");
			Scanner a = new Scanner(System.in);
			int k = a.nextInt();
			
			System.out.println("입력한10진수!"+k);
			
			int[]arr = new int[50];
			
			arr[0] = k;
			String a2 = Integer.toBinaryString(arr[0]);
		    
		    System.out.println("10진수를 2진수로 변환한 숫자 : "+a2);
			
			
		}

	}

}
