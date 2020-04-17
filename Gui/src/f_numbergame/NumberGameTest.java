package f_numbergame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NumberGameTest  {




	public static void main(String[] args) {
		NumberGame game = new NumberGame();
		game.initChar();
		game.showAnswer();
	}
}
class NumberGame extends JFrame implements ActionListener{//액션 리스너 구현
	//멤버변수선언
	int getsu = 4;
	JButton [][] b = new JButton[getsu][getsu];

	//버튼위에 지정할 문자 변수
	char[][]answers = new char[getsu][getsu];//가급적 변수잡고 사용 권장합니다	char 자동초기화값 '\u0000'

	// 첫번째 버튼에대한 저장!
	JButton firstClick;
	int firstRow,firstCol;



	NumberGame(){
		//2객체생성
		//3화면 구성	
		setLayout(new GridLayout(4, 4));
		for(int i=0; i<b.length ;i++) {
			for(int j=0; j<b[i].length ;j++) {
				b[i][j] = new JButton(i+":"+j);
				add(b[i][j]);
				//문자배열을 0으로 초기화
				answers[i][j] = '0';

				//이벤트 연결
				b[i][j].addActionListener(this);
			}
		}










		setVisible(true);
		setSize(777, 777);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Game");
		//화면에 출력


	}
	//임의의 알파벳을 임의의 위치에 지정하는역할을하는 메서드
	void initChar() {
		char alpha = '0';
		BACK:
			for (int i=0;i<getsu*getsu;) {

				//임의의 알파벳 만들기
				if( i%2 == 0) {
					alpha = (char)('A'+(int)(Math.random()*26));
					System.out.println(alpha);
					//기존에 이미 이 알파벳이 있는 지 확인 
					for(int r=0;r<getsu;r++) {
						for(int c=0;c<getsu;c++){
							if( answers[r][c] == alpha) continue BACK; 


						}
					}



				}

				//임의의 위치 선정하기
				boolean ok = false;
				do {
					int row = (int)(Math.random()*getsu);//아무거나 잡는다
					int cal = (int)(Math.random()*getsu);


					if(answers[row][cal] == '0') {
						answers[row][cal] =alpha;
						i++;
						ok =true;
					}
				}while(!ok);//true가된다






			}


	}


	void showAnswer() {
		//답을 보여주기
		for(int i=0;i<getsu;i++) {
			for(int j=0;j<getsu;j++) {
				b[i][j].setText(String.valueOf(answers[i][j]));
			}
		}







		//답가리기 
				try {
					Thread.sleep(5000);
					
				}catch(InterruptedException e) {
					
				}
				
				
				
				for(int i=0;i<4;i++) {
					for(int j=0;j<4;j++) {
						b[i][j].setText(null);
					}
				}
	}

	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();
		for(int r=0;r<getsu;r++) {
			for(int c=0;c<getsu;c++) {
				if ( b[r][c] == evt) {
					//					evt.setBackground(Color.BLACK);
					if(firstClick == null) {
						firstClick = evt;
						firstRow = r;
						firstCol = c;
						evt.setBackground(Color.RED);
						evt.removeActionListener(this);
					}else {//두번째 선택
						if(answers[firstRow][firstCol] ==answers[r][c]) {
							firstClick.setBackground(Color.BLACK);
							evt.setBackground(Color.BLACK);
						}else {
							firstClick.setBackground(null);
							
						}
						firstClick.addActionListener(this);
						firstClick = null;

					}

				}
			}
		}

	}
}