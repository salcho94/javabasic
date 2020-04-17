package h_inherit3;

public class Book extends Item {
	String author,publisher;
	Book(){
		System.out.println("Book기본생성자");
	}
	
	Book(String num, String title, String author, String publisher){
		super(num,title);
		this.author=author;
//		super.title=title;
//		super.num = num;
		this.publisher=publisher;
		
		System.out.println("Book인자생성자");
		
	}//private < default < protected < public
	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
	}
	

}
