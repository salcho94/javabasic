package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr Ex=new CalculatorExpr();
		String result="";//초기화
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개입력");
		Ex.setNum1(sc.nextInt());
		Ex.setNum2(sc.nextInt());
		
		System.out.println("덧셈"+Ex.getAddition());
		System.out.println("뺄셈"+Ex.getSubtraction());
		System.out.println("곱셈"+Ex.getMultiplication());
		System.out.println("나눗셈"+Ex.getDivision());
		
		System.out.println("반복 하시겠습니까");
		result=sc.next();
	   }while(result.equals("Y")|result.equals("y"));
	}

}

