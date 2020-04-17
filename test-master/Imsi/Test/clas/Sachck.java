package clas;

public class Sachck {
	//사칙연산 함수 완성하기 사칙연산을 수행하는 함수르르 모두 구현하고 결과갚을 출력하시오 count4
	public static void main(String[] args) {
		int a = 45;//정수형 변수에 값 대입
		int b = 11;//정수형 변수에 값 대입 
		int result = add(a,b);// 더하기 함수를 호출한 결과 자료형과 같이 받아서 변수 두개입력후대입해줌 
		System.out.println(result);// 출력 더하기 함수의 결과
		result = go(a,b);// 곱하기 함수의 자료형과 값을 입력받아서 변수두개 입력후대입함
		System.out.println(result);//출력 곱하기 함수의 결과
		result = bagi(a,b);//빼기 함수의 자료형과값을 입력받아서 변수두개입력후 대입함
		System.out.println(result);// 빼기함수의 결과값을 출력함
		double esult = nanu(a,b);// 나누기함수의 자료형 더블과 변수 두개를 입력후 대입
		System.out.println(esult);//나누기 함수의 결과값
	}public static int add(int a, int b) {// 메인에서 자료형을 받아서 넣고 함수의 자료형도 같게 맞춰준다
		int result = a+b;// 결과 변수 자료형 인트에 값두개를 더해서 결과변수에 대입해준다
		return result;// 다시 메인에 반환해준다
	}public static int go(int a, int b) {// 이하동문
		int result = a*b;
		return result;
    }public static int bagi(int a, int b) {// 이하동문
    	int result = a-b;
    	return result;
    }public static double nanu(double a, double b) {// 나누기는 더블형으로받아서 자료형과 인자가 동일하게 해준다
    	double esult = a/b ;// 자료형을 당연히 더블형으로 받은 결과변수에 나누기 함수의 결과를 대입해준다
    	return esult;//반환한다
    }
}
