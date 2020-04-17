package e_static_sample;

public class View {
	
	DBconnect db;//클래스 생성
	
	
	public View() {
		db=DBconnect.getInstance();
		
		
	}
	public void use() {
		System.out.println("디비디비딥");
	}
}
