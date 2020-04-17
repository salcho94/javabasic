package D_어레이;

public class E로또2 {
public static void main(String[] args) {
	
	
	int[][]lotto= new int[5][6];//첫번째는줄 두번째는칸
	for(int i=0;lotto.length;i++) {////줄
	for(int j=0;lotto[i].length;j++) {//칸
	      lotto[i][j] =(int)(Math.random()*45)+1;
	}
	}
	
	for(int i=lotto.length-1;i>0;i--) {
	for(int j=0;j<i;j++) {
	if(lotto[j][i]>lotto[j+1][i]) {
		int temp=lotto[i][j];
		lotto[j][i]=lotto[j+1][i];
		lotto[j+1][i]=temp;
	}
	}
	}
	for(int i=0;i<5;i++) {
		for(int j=0;j<6;j++) {
			System.out.print(lotto[i][j]+"/");
		}
		System.out.println();
}
}
}
