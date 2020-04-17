package c_control;

public class Ex01_swith_주민번호 {

	public static void main(String[] args) {
	
		String id ="200133-153412";
		char chul = id.charAt(8);
		String home="";
		switch (chul) {
		case '0' :home="서울";
		break;
		case '1' :home="인천/부산";
		break;
		case '2' :home="경기도";
		break;
		default :home="강아지";
		break;
		}System.out.println("출신지-"+ home);
	
	   
		
	}
	}
