package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {
		String id ="2018211232";

		String year= id.substring(0,4);

		char daehak=id.charAt(4);

		String colleage="";
		String 학과번호=id.substring(5,7);
		String 학과명="";
		if(daehak=='1') {
			colleage="공대";
			switch (학과번호){
			case "11":학과명="컴퓨터 학과";
			break;
			case "12":학과명="소프트웨어 학과";
			break;
			case "13":학과명="모바일 학과";
			break;
			case "22":학과명="자바 학과";
			break;
			case "33":학과명="서버 학과";
			break;
			default:학과명="고졸";
			}
		}
		/*			if(학과번호.equals("11")) {
				학과명="컴퓨터 학과"; }
			else if(학과번호.equals("12")){
			    학과명="소프트웨어학과";}
			else if(학과번호.equals("13")){
			    학과명="모바일학과";}
			else if(학과번호.equals("22")){
			    학과명="자바학과";}
			else if(학과번호.equals("33")){
			    학과명="서버학과";}	
			}*/
		else if(daehak=='2'){ 	
			colleage="사회대";
		 	switch (학과번호){
			case "11":학과명="사회학과";
			break;
			case "12":학과명="경제학과";
			break;
			case "13":학과명="경영학과";
			break;
		 	    }
		 	}
//		{
			
//						    if (학과번호.equals("11") ) {
//							학과명="사회학과";}
//						    else if(학과번호.equals("12") ) {
//								학과명="경영학과";}
//						    else if(학과번호.equals("13") ) {
//								학과명="경제학과";}
//			}


			System.out.println(id+ "번 학생은"+year +"년에입학\n"+colleage+"학이다");

	}
}

			
