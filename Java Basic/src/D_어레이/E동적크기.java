package D_어레이;

public class E동적크기 {

	public static void main(String[] args) {
		// 변수명star 문자 하나 들어가는 공간 char 이차원 배열로 만들기
		char[][]star=new char[5][];//3X4의 배열을 출력한다 


		for(int i=0;i<star.length;i++) 
		{
			star[i]=new char[i+1];
			for(int j=0;j<i+1;j++) 
			{
				star[i][j]='*';
			}
			//각각의 칸에다 *하나씩 입력 받으시오
		}	

		for(int i=0;i<star.length;i++) 
		{
			for(int j=0;j<star[i].length;j++) 
			{	
				System.out.print(star[i][j]+" ");

			}

			System.out.println();
		}
	}
}
