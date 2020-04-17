package h_inherit4;
// 추상 메서드는 미완성이니까 오버라이딩으로 완성해줘야한다
public abstract class  Item {
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
	
	
	public abstract void output();//다형성 오버라이딩 중요함
//			System.out.println(num);
//			System.out.println(title);
//		}
//
	}


