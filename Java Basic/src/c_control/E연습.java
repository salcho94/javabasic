package c_control;

public class E연습 {

	public static void main(String[] args) {
	for(int i=1;i<=50;i++) {
		int su= i;
		boolean sus369=false;
		
		while(su!= 0) {
			int na=su % 10;
		
		if(na==3|na==6|na==9) {
			System.out.print("짝");
            sus369 = true;		
		}
		su=su/10;
		}	
		//sus369값?
		if(sus369) System.out.println();
		else       System.out.println(i);
	
	}
	}
}


