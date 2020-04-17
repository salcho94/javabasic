package b_operator;

/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		/*
		// [1]
		System.out.println("a=" +a +",b="+b);
		System.out.println("a=" +a+1 +",b="+b+1); 
		System.out.println("a=" +(a+1)+ ",b="+(b+1) ); 
		// [2]
		++a; //a=a+1;
		
		--b;  //b=b-1;
		
		System.out.println("a="+ a +",b="+b);
		System.out.println("a="+(++a)+",b="+(--b));
		*/
		// [3]
//		int result = ++a;
//		System.out.println("결과:"+result);
//		
//		int result2 = b--;
//		System.out.println("결과:"+result2);
		//[4]
		System.out.println("a="+ ++a + ",b="+ --b);
		System.out.println("a="+ a++ + ",b="+ b--);// 값은 똑같이나오지만 숫자가
		System.out.println("a="+ a + ",b="+ b);
	}
	

}
