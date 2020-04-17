package c_control;


import java.util.*;

public class While개념 {

	public static void main(String[] args) {

		//1~10가지의 합을출력
		//		int h=0;
		//		int i=0;// 초기치는 위로 올리고 .
		//		for( ;i<11; ) {//조건문만 남았당.가급적 조건문은 살립시다 무한루프방지위해서
		//		while(i<11) {	//for문에서 초기치 증가치를 제외한 조건문만 남았으면 while문을 사용해도 결과는 같아(조건문만남으면권장함) 
		//	 	    h+=i;
		//			i++;// 증가치는 밑으로 내린다.
		//		}
		//	System.out.println("합" + h);	

//		Scanner c=new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int k=c.nextInt();
//		int i=1;
//		//for(int i=1;i<=9;i++)1~9까지 숫자잡은거
//		while(i<=9) {
//
//			System.out.printf("%d * %d = %d \n",k, i, k*i);//%d=int 형\개행
//			i++;}
		// 문장을 입력받아 단어로 나눠서 출력
		// "빨리 코로나 끝났으면 좋겠어요"
		Scanner c=new Scanner(System.in);
		System.out.println("점수를입력해주세요(90/80/70/60)");
		String k=c.nextLine();
		StringTokenizer st = new StringTokenizer(k,"/");
		while(st.hasMoreTokens()) {
			String temp =st.nextToken();
			int su =Integer.parseInt(temp);//string을 숫자로 변환 
			System.out.println(++su);
		}
		
	
	}



}
