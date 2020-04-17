package e_event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 이벤트 핸들러 클래스는 내가된다~!이벤트 클래스는 바로 클래스 안에 대입해서
public class TestA extends JFrame implements ActionListener{
	JButton b;
	JTextField tp;
	
	TestA(){
	setLayout(new GridLayout(1,2));
	b = new JButton("button");
	tp = new JTextField(10);
	add(b);
	add(tp);
	
	setVisible(true);
	setTitle("창");
	setSize(400, 400);
	setLocation(200,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//1 이벤트 핸들러	}
	void eventProc() {
		b.addActionListener(this);
		tp.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource();
		if(evt == b) {
		String msg = b.getText();
		JOptionPane.showMessageDialog(null,msg+"이벤트발생");
		}else if (evt == tp) {
			String msg = tp.getText();
	    JOptionPane.showMessageDialog(null,msg+"이벤트발생2");	
		}
	
	
	}


	
	public static void main(String[] args) {
		//이벤트 핸들러 생성이 이미됌
		TestA a = new TestA();
		a.eventProc();
	}



}
