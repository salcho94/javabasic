package A_sample;

import java.awt.*;
import javax.swing.*;
// is a 방식 입니다 .

public class Test2 extends JFrame{//변수 객체 화면출력 필요가없음 부모가 가지고 있는 함수를 사용 한다 .
	//멤버 변수	
	JRadioButton rb1 = new JRadioButton("남자",true);//값을 이미 가지고있으면 한방에 처리가능!
	JRadioButton rb2 = new JRadioButton("여자");
	JRadioButton rb3 = new JRadioButton("성인");
    JRadioButton rb4 = new JRadioButton("미성년",true);
	
	public Test2() {
		super("나의창2");
//	rb1 = new JRadioButton("남자",true);
//	rb2 = new JRadioButton("여자");
//	rb3 = new JRadioButton("성인");
//	rb4 = new JRadioButton("미성년",true);
		
	ButtonGroup bg1 = new ButtonGroup();
	bg1.add(rb1);
	bg1.add(rb2);
	ButtonGroup bg2 = new ButtonGroup();
	bg2.add(rb3);
	bg2.add(rb4);
	  //출력담당
	  setLayout(new FlowLayout());
	  add(rb1);
	  add(rb2);
	  add(rb3);
	  add(rb4);
	  
		
  
	  
	  setSize(500,400);
		setVisible (true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
		 Test2 t = new Test2();
	

	}

}
