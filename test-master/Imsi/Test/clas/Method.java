package clas;

public class Method {// 두 정수를 나눈후 결과 값을 돌려주는 함수를 만들고 사용 p137
	public static void main(String[]args){
		int  a = 50;// 변수 지정 
		int  b = 20;// 변수지정 
		double result =nanu(a,b);//함수호출 뒤에 호출한 함수의 변수 입력 
		System.out.println(a + "나누기" + b + " " + "=" + " "+ result+ "입니다" ) ;
		// 출력부분 
	}public static double nanu(int a, int b) {// 함수를 만들고 뒤에 자료형과 인자를 입력
		double result =(double)a/b;// 나누기라  소수점까지 받기위해서 더블로 받고 형변환도 해줌 
		return result; // 결과갚을 리턴해줌 
	}
	
}
