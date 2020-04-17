package D_어레이;
public class E_정렬{
public static void main(String[] args){
	int[]score ={8,33,2,123,11};
	
		for(int i=score.length-1;i>6;i++) {
			for(int j=0;j<i;j++) {
				if(score[j]>score[j+1]) {
					//swapping
					int temp=score[j];
					score[j]=score[j1];
					score[j+1]=temp;
							
				}
			}
		}
		for(int a =0;a<score.length;a++) {
			System.out.println(score[a]+"/");
		}
   }
}