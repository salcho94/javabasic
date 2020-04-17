package D_어레이;

public class Ex최대값찾기 {

	public static void main(String[] args) {
	
		
		//max변수 선언 
		// 반복문(for) 배열의 갯수만큼
		//score의 i번째의 값과 max비교
		//max값이 더 작다면 max에 저장
		//최댓값 max출력
		int[]score ={8,33,2,123,11};
		int max=score[0];
		for(int i=0;i<5;i++) {
			if(max<score[i]){
				max=score[i];
			}
			
		}
		System.out.println(max);
	
	}

}
