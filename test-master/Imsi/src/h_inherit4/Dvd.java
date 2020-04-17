package h_inherit4;

public class  Dvd extends Item{
	String actor,deracter;
	Dvd(){
		System.out.println("Dvd기본생성자");
	}
	
	Dvd(String num, String title, String actor, String deracter){
		super(num,title);
		this.actor=actor;
		this.deracter=deracter;
		System.out.println("Dvd인자생성자");
	}
	public void output() {
	   System.out.println(num);
	   System.out.println(title);
	   System.out.println(actor);
	   System.out.println(deracter);

	}

	

}
