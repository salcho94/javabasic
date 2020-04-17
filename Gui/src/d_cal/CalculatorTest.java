package d_cal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorTest extends JFrame implements ActionListener{
	//멤버 변수 선언
	JTextField tf;
	JButton b[] = new JButton[15];
	
	
	int prev;  // 이전값
	String op;  // 연산자

	//객체생성
	public CalculatorTest() {

		tf = new JTextField();

		b[0] = new JButton("1");
		b[1] = new JButton("2");
		b[2] = new JButton("3");
		b[3] = new JButton("4");
		b[4] = new JButton("5");
		b[5] = new JButton("6");
		b[6] = new JButton("7");
		b[7] = new JButton("8");
		b[8] = new JButton("9");
		b[9] = new JButton("0");
	    b[10] = new JButton("+");
		b[11] = new JButton("=");
		b[12] = new JButton("-");
		b[13] = new JButton("*");
		b[14] = new JButton("/");

	}
	//화면 구성및 출력하기
	public void display() {

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,3));
		for(int i=0;i<15;i++)
			p.add(b[i]);

		setLayout(new BorderLayout());
		add(tf,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);

		setTitle("유치원계산기");
		setSize(360,290);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void eventProc() {
		for(int i =0 ;i<b.length; i++) {
			b[i].addActionListener(this);
		}
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();
		//숫자가 눌렸을 때 
		for(int i =0 ;i<10; i++) {
			if(evt == b[i]) {
			String s = tf.getText();
			s += b[i].getText();
			tf.setText(s);
		}
	}
	
	//연산자가 눌렸을때
	if(evt == b[10]) {//더하기
		prev =Integer.parseInt( tf.getText());
		tf.setText(null);
		op = evt.getText();
	}else if(evt == b[12]) {//빼기
		
	}else if(evt == b[13]) {//곱하기
		
	}else if(evt == b[14]) {//나누기
		
	}
	
	
	
	
	if (evt == b[11]) {//출력
		switch(op) {
		case "+":
			int second =Integer.parseInt (tf.getText());
			int result = prev +second;
			tf.setText(String.valueOf(result));
			break;
			
			
			
		}
	}
	
	}
	    public static void main(String[] args) {
		CalculatorTest t = new CalculatorTest();
		t.display();
		t.eventProc();
	}
	

}