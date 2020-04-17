package h_inherit3;

public class  Dvd extends Item{
	String actor,deracter;
	Dvd(String num, String title, String actor, String deracter){
		super(num,title);
		this.actor=actor;
		this.deracter=deracter;
	}
	public void output() {
	   System.out.println(num);
	   System.out.println(title);
	   System.out.println(actor);
	   System.out.println(deracter);

	}

	

}
