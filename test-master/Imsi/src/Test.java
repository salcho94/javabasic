

public class Test {

	public static void main(String[] args) {
	// 변수 선언
	//	Student s; 같이쓰는게 일반적
	// 객체 생성( 메모리에 확보)
	Student	s=new Student();//s 는 변수명 앞의 student는 클래스명
	s. kor =70;// 멤버를 찾아갈때는 .을찍어준다
	s. eng =88;
	s. math=99;
	System.out.println("총점"+s.calTotal());// 멤버 메소드.을찍고 이동한다
	
    //s.total=100;
	
	System.out.println("평균"+s.calAve());
	}
}//