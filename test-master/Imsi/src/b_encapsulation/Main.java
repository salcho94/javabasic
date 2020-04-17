package b_encapsulation;



public class Main {

	public static void main(String[] args) {

		Student	s=new Student();//s 는 변수명 앞의 student는 클래스명
//		s. kor =70;// 멤버를 찾아갈때는 .을찍어준다
//		s. eng =88;
//		s. math=99;
		s.setKor(70);
		s.setEng(88);
		s.setMath(99);
		s.setName("홍길동");
		System.out.println(s.getName());
		System.out.println(s.getKor()+"/"+s.getEng()+"/"+s.getMath());
		System.out.println("총점"+s.calTotal());// 멤버 메소드.을찍고 이동한다
		System.out.println("평균"+s.calAverage());
	
	    //s.total=100;
	

		


		
	}
	/*
	 * [ 결론내기 ] 캡슐화란??? 
	 */
}
