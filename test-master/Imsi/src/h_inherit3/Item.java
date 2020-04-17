package h_inherit3;

public class Item {
	protected String num;
	protected String title;
	Item(){
		System.out.println("item기본생성자");
	}
	public Item(String num, String title){
		this.num = num;
		this.title = title;
		System.out.println("item인자생성자");
	}
	
	
	public void output() {
			System.out.println("num");
			System.out.println("title");
		}

	}


