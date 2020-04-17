package info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_info2 extends JFrame {
	//변수선언
	JTextArea ta;
	JButton bAdd,bShow,bSearch,bDelete,bCancel,bExit;
	JTextField tfName,tfId,tfTel,tfsex,tfAge,tfHome;

	C_info2(){
		//객체생성
		ta = new JTextArea();
		bAdd = new JButton("add",new ImageIcon());
		bShow = new JButton("show");
		bSearch = new JButton("search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("cancle");
		bExit = new JButton("exit");

		tfName = new JTextField(13);
		tfId = new JTextField(13);
		tfTel = new JTextField(13);
		tfsex = new JTextField(13);
		tfAge = new JTextField(13);
		tfHome = new JTextField(13);



	}
	public void eventProc(){
		MyEvent me = new MyEvent();
		//이벤트 연결
		bAdd.addActionListener(me);
		bShow.addActionListener(me);
		bSearch.addActionListener(me);
		bDelete.addActionListener(me);
		bCancel.addActionListener(me);
		bExit.addActionListener(me);


		tfId.addActionListener(new ActionListener() //이것이 1,2,3단계를 한꺼번에한것이다
				{
			public void actionPerformed(ActionEvent e) {

				String msg = tfId.getText();
				JOptionPane.showMessageDialog(null,msg+"이벤트발생");
			}

				});
		addWindowListener(new WindowListener() {
			public void windowClosed(WindowEvent e) {

				int result = JOptionPane.showConfirmDialog(null, "진짜나가시겠습니까?");
				if(result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
			public void windowClosing(WindowEvent e) {
			}
			public void windowDeactivated(WindowEvent e) {
			}
			public void windowDeiconified(WindowEvent e) {

			}
			public void windowIconified(WindowEvent e) {
			}

			public void windowOpened(WindowEvent e) {
			}
			
			public void windowActivated(WindowEvent e) {

			}

			
			
		});
		}
		


				
		

	


	class MyEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton evt = (JButton)e.getSource();
			if(evt == bAdd) {
				String msg = bAdd.getText();
				JOptionPane.showMessageDialog(null,msg+"더하기");
			}else if (evt == bShow) {
				String msg = bShow.getText();
				JOptionPane.showMessageDialog(null,msg+"보여주다");	
			}else if (evt == bSearch) {
				String msg = bSearch.getText();
				JOptionPane.showMessageDialog(null,msg+"검색");	
			}else if (evt == bDelete) {
				String msg = bDelete.getText();
				JOptionPane.showMessageDialog(null,msg+"삭제");	
			}else if (evt == bCancel) {
				String msg = bCancel.getText();
				JOptionPane.showMessageDialog(null,msg+"취소");	
			}else if (evt == bExit) {
				System.exit(0);
			}

		}
	}

	void display() {
		setLayout(new BorderLayout());

		JPanel p = new JPanel(new GridLayout(6,2));
		p.add(new JLabel("Name"));
		p.add(tfName);

		p.add(new JLabel("ID"));
		p.add(tfId);
		p.add(new JLabel("TEL"));
		p.add(tfTel);
		p.add(new JLabel("SEX"));
		p.add(tfsex);
		p.add(new JLabel("AGE"));
		p.add(tfAge);
		p.add(new JLabel("Home"));
		p.add(tfHome);
		add(p,BorderLayout.WEST);
		JPanel p1 =new JPanel(new GridLayout(1,6));
		p1.add(bAdd);
		p1.add(bShow);
		p1.add(bSearch);
		p1.add(bDelete);
		p1.add(bCancel);
		p1.add(bExit);
		add(p1,BorderLayout.SOUTH);

		add(ta, BorderLayout.CENTER);


		//화면구성 출력
		setLocation(200,100);
		setSize(700,560);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);


	}



	public static void main(String[] args) {
		C_info2 c = new C_info2();
		c.display();
		c.eventProc();
	}

}
