package e_static_sample;
// 이 패턴을 싱글톤 패턴: 하나의 메모리를 생성하는 패턴
public class DBconnect {
	//생성자함수 생성! private 때문에 이클래스 안에서만 사용가능
	
	static DBconnect con;//자신의 클래스를 멤버로영입!자동 null 생성 메모리단 하나생성
	
	private DBconnect(){//private자신의 클래스에서만 사용가능!
		System.out.println("실제로 디비 연굘");
	}
	

	public static DBconnect getInstance() {//
		if(con==null) con =new DBconnect();
		return con;//참이므로 객체생성 코딩에 의해서 이객체를 한번만 생성 
	}// 첫번째 적용 하는 순간에 생성하고 나머지는 생성 안한다.
	
}
