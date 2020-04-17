package B_sample;

// ----------------has- a 방식
// AWT-> Swing

import javax.swing.*;

import java.awt.*;



public class Test {
	//멤버변수를 선언
	JFrame f;
	JButton b;
	JLabel a;
	JTextField tf;
	JTextArea c;
	JCheckBox cb,cb2;
	JList lst;
	public Test() {// 생성자함수 하나 생성
		//객체 생성 
		a = new JLabel("name");
		b = new JButton("OK");// 화면에 뜨기전에 입력을 해줘야 화면에 출력된다.
		f = new JFrame("창");
		tf = new JTextField("이름은 5자 미만입니다",40);
		c = new JTextArea();
		cb = new JCheckBox("Male");
		cb2 = new JCheckBox("Female",true);
		String []data = {"asds","dkd","asdas","asdads"};
		lst = new JList(data);
		
		
		//화면 출력
		//붙이는 방식을 다르게 한다
//		f.setLayout(new FlowLayout());
//		f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(a,BorderLayout.EAST);
			JPanel p2 = new JPanel();
			p2.add(tf);
			p2.add(lst);
		f.add(c,BorderLayout.CENTER);
	
		    JPanel p = new JPanel();
//		    p.setLayout(new GridLayout(2,2));
		    p.add(cb);
		    p.add(cb2);// 한영역에 하나만사용이 가능 

	
		f.add(p, BorderLayout.SOUTH);
		
		
		f.setSize(500,400);
		f.setVisible (true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		
		 Test t = new Test();
		 

	}

}
