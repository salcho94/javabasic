package javaTest;

public class InfoVO {
	String name;// 변수들을 선언해준다 
	String jumin;
	String tel;
	String gender;
	int age;
	String home;
	InfoVO(){} // 디폴트 생성자 생성 
	InfoVO(String name, String jumin, String tel, String gender, int age , String home){// 생성자 함수 생성 this 지정 
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.home = home;
	this.tel = tel;
	}
	
	
	public String toString() {
		return name +"\t"+ jumin + "\t" +tel+ "\t"+ gender+"\t" + age +"\t" + home+"\n";
	}
	
	

	
	
	// getter setter 로 자동으로 생성 되게 만들어준다 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
		
	
	
	
	
	
}
