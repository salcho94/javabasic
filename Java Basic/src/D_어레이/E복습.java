package D_어레이;

public class E복습 {

	public static void main(String[] args) {
		//1번 3x4의 배열 char 배열 ch
		char[][]ch=new char[3][4];//3X4의 배열을 출력한다 
		
 		
		//값입력
//		for(int i=0;i<ch.length;i++) {//조건문 중첩 사용하여3x4의 배열을 설명i가 0이면 문자형으로만든 ch와비요하여더 작으면 더한다
//			for(int j=0;j<ch[i].length;j++) {
//				ch[i][j]='Z';
//			}
//		}
		char al ='A';
		for(int i=0;i<3;i++) {//조건문 중첩 사용하여3x4의 배열을 설명i가 0이면 문자형으로만든 ch와비요하여더 작으면 더한다
			for(int j=0;j<4;j++) {
				ch[i][j]=al;
				al++;
		         }
			}	
		//출력
		for(int i=0;i<ch.length;i++) 
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+" ");
				
			}
		
		System.out.println();
					
		
 		
	}

}
