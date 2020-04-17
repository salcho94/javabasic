package b_useful_class;

public class String버퍼 {

	public static void main(String[] args) {
		//0.기본형
		int a = 10;
		a +=5;
		System.out.println(a);
		//1.string : 참조형
		String s = new String ("안녕");//참조형은 무조껀 new를 사용합니다.
		// 아이디나 패스워드는 거의 most문자열로 받는다 문자 한글자 받으면 char
		// 문자형으로 변환하는건 참조형이다.
		//String s = "안녕";// 기본형이 아닌데도 기본형으로 사용하게끔 특권을줌		
		s+= "하세요";// 원래 문자열은 연산도 안돼 그런데 문자열을 기본형처럼 쓸수있는 특권을줌
		System.out.println(s);//자료형은 기본형 참조형 String 클래스가 있다.
		//위에 A는 스택에 잡힌다 아래s는 스택에 4바이트로잡히는데 new를 만나면 heap로 잡혀 찾아갈수 있게 해준다.
		//String s 도 마찬가지로  문자열로 잡힌다.연산을하게되면 위의 안녕은사라지고 아래의 하세요와 합쳐져 안녕하세요 하나의 문장이된다.
		//가비쥐 콜렉터 같이 메모리를 정리해주는 프로그램이있음 단점: 내가 원하는 시간에 돌아가지 않을때
		//결론은 위의 안녕이 가비지 콜렉터가돌아가서 사라진다.
		//2. Stringbuffer
		StringBuffer sb = new StringBuffer("행복함");
		//StringBuffer sb2="행복한"; 오류난다 이유는 스트링을 제외한 모든 건 new를써줘야된다
		//sb+="목요일"; 오류난다 연산도 안된다
		//스트링버퍼는 메모리 정리를 안하고 위에 덮어서서 ("행복함")이 사라지지 않는다.
		// 변형되는 문자에서는 스트링 버퍼를 써야한다 (실무에서 많이쓴다)
		sb.append("목요일");//
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
