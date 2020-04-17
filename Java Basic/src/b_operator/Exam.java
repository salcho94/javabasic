package b_operator;

public class Exam {

	public static void main(String[] args) {
		//short circuit Logic:일반 논리에서만 발생한다.=일반논리는 true,false이거야
		// 이진논리는 비트를건드려서 실행안돼=이진논리로 실행된다 개념이 있다.
        //하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않습니다.
		// if(3&4) 이진논리 
		// if(3.1 & 4.1) 일반논리를 대신한다.
		
		int a =3;//일반논리다 아래의 조건중 하나만선택되면 뒤의 조건은 실행되지않는다
		if (a > 3 && ++a>3) {
		System.out.println("조건 만족");
			
		}// &&기준으로 첫번째 조건에서 틀려서 뒤의 조건을 계산 안함 그래서 결과 a=3이야
		System.out.println("A="+ a);
		// 이진논리다 두개다 실행한다
		if(a > 1 | ++a>3) {
			System.out.println("조건 만족");
		}
			System.out.println("A="+a);
		
		
	}

	}













		 	
	