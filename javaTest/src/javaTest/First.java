package javaTest;

public class First {

	public static void main(String[] args) {
	//. 1부터 100까지 숫자 중 3의 배수 이거나 5의 배수인 숫자의 합을 구하는 
		// 소스코드와 결과화면 스크린 샷을 제출하시오
		  //[요구사항] 
		  //. 단, 3와 5의 공배수인 경우 제외
	//  나, while문 버전과  for문 버전으로 두가지 소스코드를 작성하시오
//		int sum=0;
//		for(int i =1;i<=100;i++) {
//			if(i%3==0 && i%5==0) sum+=i;
//		}System.out.println(sum);
	
		        // 1번 1~100 3의 배수 이면서 5의 배수 출력
		        
					int sum = 0;
					int i = 1;
		        while( i <= 100 ) {
		            // 3의 배수 && 5의 배수
		        	i++;
		            if( (i%3 == 0) && (i%5 == 0) ) {
		                System.out.print(sum +=i);
		                System.out.println();
		            }
		        }
		        System.out.println("");
		    }



			
	
		
		
	}


