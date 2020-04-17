package h_inherit3;
// this=자신의 객체를 지칭하는 레퍼런스 
// super =부모의 객체를 지칭하는 레퍼런스
// this(): 다른 생성자 함수를 호출할때
//super(): 부모 생성자 함수를 호출시 사용
public class  CD extends Item {

	String singer;
	CD(){
		
	}
	CD(String num, String title,String singer){
		super.num=num;
		this.singer=singer;
		super.title=title;
	}
	
	
	
	

	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(singer);
	

	}
}
