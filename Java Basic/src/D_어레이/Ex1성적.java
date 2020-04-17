package D_어레이;
public class Ex1성적{ 
public static void main(String[] args){
	//int[] kor;
	//kor= new int[5]//배열 변수선언 메모리확보
//			int[]kor=new int[5];
//			kor[0] = 90;
//			kor[1] = 88;
//			kor[2] = 89;
//			kor[3] = 70;
//			kor[4] = 60;
			//kor[5] = 50;
			
			//배열 초기화       앞의 new인트 생략가능!
			//int []kor= new int[] {90,88,89,70,77};
	        int []kor= {90,88,89,70,77};
			int total=0;
			for(int i=0;i<kor.length;i++) {
				total +=kor[i];
	        }
			System.out.println("총점"+total);



}

}