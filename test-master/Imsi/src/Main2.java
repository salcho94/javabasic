
public class Main2 {

	public static void main(String[] args) {//출력을 할때는 get을사용한다.
		Person p = method();
		System.out.println("이름:"+p.getName());
		System.out.println("나이:"+p.getAge());
		System.out.println("키:"+p.getHeight());
	}
	static Person method() {
		String name="홍길자";
		int age =24;
		double height=190.99;
		
		Person p=new Person();//메모리 올려준다
		p.setName(name);//메모리 받을수 있게 생성 해준다.
		p.setAge(age);
		p.setHeight(height);
		
		return p;
	}

}//임시적인 클래스사용할때만 사용한다.(가급적 사용 권장하지않음)java파일은하나지만 클래스파일은 두개생성
class Person{//하나의 파일이라도 접근이 안된다.
	private String name;
	private int age;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

}