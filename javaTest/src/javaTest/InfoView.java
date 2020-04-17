package javaTest;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class InfoView implements ActionListener {
	// 화면에 관련한 변수를 선언한다
	JFrame frame;
	JTextField tf_name, tf_id, tf_tel, tf_age, tf_gender, tf_home;// 창에 들어갈 글자 입력
	JButton b_add, b_show, b_modify, b_delete, b_cancle, b_exit;// 버튼에 들어갈 글자입력
	JTextArea ta; // 텍스트 에리어 변수 지정

	// 1.business logic 을 실행하는 클래스 변수를 선언
	InfoModel model;

	// 생성자 함수 위의 멤버변수에 선언된 클래스 객체를 생성
	public InfoView() {
		frame 			=new JFrame("dbTest");
		
		tf_name =new JTextField(15); // 생성자함수 안에서 객체 생성후 () 문자열이 보일 크기를 지정해준다 
		tf_id	=new JTextField(15);
		tf_tel	=new JTextField(15);
		tf_age	=new JTextField(15);
		tf_gender	=new JTextField(15);
		tf_home	=new JTextField(15);
	
		b_add          = new JButton("add", new ImageIcon());// 버튼을 생성하며 이미지 넣어주고 싶으면 넣어준다.
		b_add.setVerticalTextPosition(SwingConstants.BOTTOM);// 버튼의 위치를 지정 
		b_add.setHorizontalTextPosition(SwingConstants.CENTER);//중간으로 위치 지정 
		b_add.setBorder(new BevelBorder(BevelBorder.RAISED));
		b_add.setToolTipText("추가");
		
		 b_show = new JButton("show");
		 b_modify =new JButton("modify");
		 b_delete = new JButton("delete");
		 b_cancle = new JButton("cancle");
		 b_exit = new JButton("exit");
		 ta    = new JTextArea(20,50);
	
		 model new InfoModelImpl();
		 System.out.println("");
	}

}
