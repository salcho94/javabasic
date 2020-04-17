package A_sample;

// ----------------has- a 방식
import java.awt.*;
public class Test {
	//멤버변수를 선언
	Frame f;
	Button b;
	Label a;
	TextField tf;
	TextArea c;
	Checkbox cb,cb2;
	List lst;
	public Test() {// 생성자함수 하나 생성
		//객체 생성 
		a = new Label("name");
		b = new Button("OK");// 화면에 뜨기전에 입력을 해줘야 화면에 출력된다.
		f = new Frame("창");
		tf = new TextField("이름은 5자 미만입니다",40);
		c = new TextArea();
		cb = new Checkbox("Male");
		cb2 = new Checkbox("Female",true);
		lst = new List();
		lst.add("바보");
		lst.add("2");
		lst.add("3");
		lst.add("4");
		lst.add("5");
		//화면 출력
		//붙이는 방식을 다르게 한다
//		f.setLayout(new FlowLayout());
//		f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(a,BorderLayout.EAST);
		f.add(tf,BorderLayout.NORTH);
		f.add(c,BorderLayout.CENTER);
		    Panel p = new Panel();
		    p.setLayout(new GridLayout(2,1));
		    
		    p.add(cb);
		    p.add(cb2);// 한영역에 하나만사용이 가능 

		f.add(p,BorderLayout.SOUTH);
		
		
		f.setSize(500,400);
		f.setVisible (true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		 Test t = new Test();
		 

	}

}
