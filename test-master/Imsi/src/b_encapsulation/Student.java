package b_encapsulation;

/******* 캡슐화  //보안
 public 모든 클래스 어디서든지 접근을 허용 
 private 다른 클래스 접근을 차단해주는 역할
B.	private / public 	-> private 멤버 변수 만든 후 main 에서 에러 확인
							-> public 멤버 메소드를 만들지 않아도 에러는 발생하진 않지만 명확하게 public 지정
C.	setter / getter
D.	 this 
		

 */
public class Student {
	// 1. 멤버변수는 private / 멤버 메소드는 public이것이 캡슐화의 가장 기본
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public int calTotal()		{  
		total = kor + eng + math;  
		return total;
	}
	public double calAverage() 	{  
		avg = (double)total / 3;   
		return avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
	// 2. 필요한 것만 setter / getter 만든다
	
	
}
