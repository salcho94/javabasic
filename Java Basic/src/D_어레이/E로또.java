package D_어레이;

public class E로또 {
public static void main(String[] args) {
	//변수를 하나 만든후 그안에 랜덤수를 지정받아서 편리하게 할 수 있어요
	//
	//
	//
	int[]lotto= new int[6];
	for(int j=0;j<6;j++) {
	      lotto[j] =(int)(Math.random()*45)+1;
	}
	
	for(int i=lotto.length-1;i>0;i--) {
	for(int j=0;j<i;j++) {
	if(lotto[j]>lotto[j+1]) {
		int temp=lotto[j];
		lotto[j]=lotto[j+1];
		lotto[j+1]=temp;
	}
	}
	}
	for(int j=0;j<6;j++) {
		System.out.print(lotto[j]+"/");
}
}

}