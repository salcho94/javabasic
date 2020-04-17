package e_event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//이너 클래스를 사용하여 할때는 출력할 명을 지정해주어야한다
public class TestB extends JFrame{
	JButton b;
	JTextField tp;
	
	TestB(){
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
	public void eventProc(){
		MyEvent me = new MyEvent();
	//이벤트 연결
		b.addActionListener(me);
		tp.addActionListener(me);
	}
	class MyEvent implements ActionListener{
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
	}
	
	
	
	public static void main(String[] args) {
		TestB a = new TestB();
		a.eventProc();
	}

	}
