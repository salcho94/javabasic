package e_event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//이너 클래스를 사용하여 할때는 출력할 명을 지정해주어야한다
public class TestC extends JFrame{
	JButton b;
	JTextField tp;
	
	TestC(){
	setLayout(new FlowLayout());
	b = new JButton("button");
	tp = new JTextField(100);
	add(b);
	add(tp);
	
	setVisible(true);
	setTitle("창");
	setSize(400, 400);
	setLocation(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void eventProc(){
	//	MyEvent me = new MyEvent(); 딱 한번만 사용했을시 아래 화면처럼 초기화하여 하나로 줄일수있다.
	//이벤트 연결
		b.addActionListener(new ActionListener() //이것이 1,2,3단계를 한꺼번에한것이다
		{
			public void actionPerformed(ActionEvent e) {
				
				String msg = b.getText();
				JOptionPane.showMessageDialog(null,msg+"이벤트발생");
				}
			
			});
		tp.addActionListener(new ActionListener() //이것이 1,2,3단계를 한꺼번에한것이다
				{
					public void actionPerformed(ActionEvent e) {
						
						String msg = tp.getText();
						JOptionPane.showMessageDialog(null,msg+"enter이벤트발생");
						}
					
					});
				
		
	}
//	class MyEvent implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			
//			String msg = b.getText();
//			JOptionPane.showMessageDialog(null,msg+"이벤트발생");
//			}
//		
//		}
//	
	
	
	
	public static void main(String[] args) {
		TestC a = new TestC();
		a.eventProc();
	}

	}
