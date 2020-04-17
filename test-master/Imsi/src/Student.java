
public class Student {

	//멤버변수(member filed)
		String name;
		int kor,eng,math;// 클래스의 내부에 선언하여 객체 속성을 나타내는 변수- 멤버변수이다
		private int total;
		private double avg;//외부에서 접근을 못하게 하기위해 private붙인다

		//멤버함수(member method/member function)
		int calTotal() {
			total=kor+eng+math;
			return total;
		}
		double calAve() {
			avg=(double)total/3;
			return avg;
		}
	}
	



