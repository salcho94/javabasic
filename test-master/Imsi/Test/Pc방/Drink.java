package Pc방;//pc방 패키지.

import java.awt.Color;//안쪽 배경의색 넣어준다.
import java.awt.GridLayout;//행과열을 출력하도록 도운다.

import javax.swing.JButton;//버튼을 사용할수 있도록 한다
import javax.swing.JPanel;// 패널을 생성 할수 있도록 사용

public class Drink extends JPanel{// 클래스Drink  에 JPanel을 상속한다.
	
	public Drink(JButton a, JButton b, JButton c, JButton d){//버튼에 변수를 지정 해준다.
		super(new GridLayout(2,2));//부모에게 상속받아 행과열을 2행2열로 맞추도록 설정
		setBackground(Color.WHITE);//배경화면을 흰색으로 설정한다
		add(a);//a버튼에 색을 입힌다
		add(b);//b버튼에 색을 입힌다
		add(c);//c버튼에 색을 입힌다
		add(d);//d버튼에 색을 입힌다
	}
}