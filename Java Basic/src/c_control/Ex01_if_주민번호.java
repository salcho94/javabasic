package c_control;

import java.util.*;


public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		String id ="940729-1877779";
	    char sung =id.charAt(7);
	    //1이거나 3이거나 9이면 남자
	    //2이거나 4이거나 0이면 여자
	    if(sung =='1' |sung =='3'|sung =='9') {
	    	System.out.println("남자 출력");
	    }else if(sung =='2'|sung =='4'|sung =='0') {
	    	System.out.println("여자 출력");
  
	    }
	    
	    
    	
	    String nai=id.substring(0, 2);//두번째열 앞에부터 두개 컴터는 0부터센다
	    int nai2 =Integer.parseInt(nai);
	    
	    //올해 년도 구하기
	    Calendar c= Calendar.getInstance();
	    int year = c.get(Calendar.YEAR);
	    
	    
	    
	    int age=0;
	    if(sung =='1'|sung =='2')
	    {
	    	age=year-(1900+nai2)+1;
	    }else if(sung =='3'|sung =='4') 
	    {
	    	age=year-(2000+nai2)+1;
	    }else if(sung =='0'|sung =='9')
	    {
	    	age=year-(1800+nai2)+1;
	    }
	    
	    System.out.println("나이는"+age);
	    
	    
	   
	    
	  
	  
	}

}
