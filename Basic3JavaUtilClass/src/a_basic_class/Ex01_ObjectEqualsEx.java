package a_basic_class;

public class Ex01_ObjectEqualsEx
{
	public static void main(String[] args)
	{
		 StudentA  a = new StudentA("012345", "송혜교");
		 StudentA  b = new StudentA("012345", "송혜교");
		 //object 클래스의 equals(): ==
		 if( a.equals(b)) { // a==b
			 System.out.println("객체 a와 b는 같다");
		 }else {
			 System.out.println("객체 a와 b는 다르다");
		 }

		 System.out.println( a.toString()  );// object만 들어올수있는 자리이다.
		 System.out.println( b  );
	}
}

class StudentA extends Object
{
	String  hakbun, name;
	StudentA( String  hakbun, String name)
	{
		this.hakbun = hakbun;
		this.name = name;
	}	
		public String toString() {
			return hakbun+ "/" +name;
		}
}
	