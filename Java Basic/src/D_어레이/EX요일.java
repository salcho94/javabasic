package D_어레이;

import java.util.Calendar;


public class EX요일 {

	public static void main(String[] args) {
	
		Calendar cal= Calendar.getInstance();
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH);
		int d=cal.get(Calendar.DATE);
		System.out.println(y+"년"+ (m+1) +"월" + d +"일");
		
		
		
		int A=cal.get(Calendar.HOUR);
		int B=cal.get(Calendar.MINUTE);
		int C=cal.get(Calendar.SECOND);
		
		System.out.println(A+"시"+ B +"분" + C +"초");
	
	  String[] yoil= {"일","월","화","수","목","금","토"};
	  
	  System.out.println(yoil[cal.get((int)Calendar.DAY_OF_WEEK)-1]+"요일"); 
	
	
	
	
	
	}
}
