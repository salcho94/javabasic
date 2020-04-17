package clas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//계산기 만들기.
public class MyDataTest extends JFrame implements ActionListener {
	//멤버변수 선언 
	JTextField tf;// 텍스트필드 변수 tf 지정
	JButton b[] = new JButton[15];// 배열로 15개 길이의 버튼을 생성 

	int prev;//이전값 
	String op;//연산자
	// (객체 생성)
	public MyDataTest() {//클래스 메소드 생성(객체 생성) 
		tf = new JTextField();//tf변수로  텍스트 필드 인스턴스화

		for(int i =0;i<10;i++) {//for 문을 사용 계산기 숫자갯수만큼
			b[i] = new JButton(String.valueOf(b[i]));//배열에 숫자를 넣은 값을 버튼에 입력후 문자형으로 변환 해준다 .
		}
		b[10] =new JButton("+");// 나머지 사칙연산 부호들의 배열값지정후 그값안에 버튼 이벤트를 생성해준다.
		b[11] =new JButton("ㅡ");
		b[12] =new JButton("*");
		b[13] =new JButton("/");
		b[14] =new JButton("=");

	}
		// 화면 구성및 출력하기.
		public void display() {
			JPanel p = new JPanel();//판넬을 인스턴스한다
			p.setLayout(new GridLayout(5,3));//레이아웃값을 지정 그리드렝이아웃으로 5행3열이라는 뜻
			for(int i = 0;i<15;i++) {// for문사용하여 전체배열의 길이만큼 메모리를 확보하게 한다
				p.add(b[i]);// 판넬에 위에서 생성한 배열버튼을 더한다.
			}
			setLayout(new BorderLayout());//창에 표시될 텍스트필드와 버튼을 구성하기위한 작업
			add(tf,BorderLayout.NORTH);//텍스트필드를 북쪽에 표시하게끔한다.
			add(p,BorderLayout.CENTER);//생성한 버튼 배열을 중앙에 표시.

			setTitle("초고급 계산기");
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(500, 500);
		}
		
			public void eventproc() {//이벤트를 발생시키는 메서드 하나 생성
				for(int i=0;i<b.length;i++) {//포문을사용하여 버튼의 길이만큼 이벤트 추가
					b[i].addActionListener(this);// 배열 I에  this 지정 위의 길이만큼 액션리스너 추가
				}

			}
			public void action(ActionEvent e) {//액션메소드생성 액션이벤트
				JButton evt = (Jbutton)e.getSource();// 버튼에 소스를가져온다
			}

						//숫자가 눌렸을 경우
						for(int i=0;i<10;i++) {//숫자 크기만큼 for문만들고
							if(evt == b[i]) {// 만약에 그값이 이벤트 정해준거랑 배열의 값과 동일하다면
								String su = tf.getText();// 스트링 수라는 변수선언과동시에 텍스트 필드로 내보낸다(문자열로 바꿔주는것)
								su+=b[i].getText();// 입역받은 문자값 스트링 su랑 배열의 값을 더한걸 텍스트 필드로 보내고
								tf.setText(su);// 텍스트 필드에 su의 값을 넣어서 세팅해준다.
							}
						}
    			}
				//연산자 벝튼이 눌렸을 경우
				if(evt == b[10]) {
					prev = integer.parseInt(tf.getText());
					tf.setText(null);
					op = evt.getText();
				}else if(evt == b[10]) {
				}else if(evt == b[12]) {
				}else if(evt == b[13])	{
				}else if(evt == b[14]) {
				}	
					
					
					
				
					switch(op) {
					case  "+" :
						int second = Integer.parseInt(tf.getText());
						int result = prev +second;
						tf.setText(String.valueOf(result));
						break;
					}
				}
			}











			public static void main(String[] args) {
				MyDataTest t = new MyDataTest();
				t.display();
				t.eventproc();

			}

		}
