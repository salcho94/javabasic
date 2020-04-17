package e_static_sample;

public class View1 {

DBconnect db;//클래스 생성
	
	
	public View1() {//생성자함수랑 이름이 같아야한다 
		db=DBconnect.getInstance();//객체하나생성
		
		
		
	}
	public void use() {
		System.out.println("디비디비딥");
	}
}
