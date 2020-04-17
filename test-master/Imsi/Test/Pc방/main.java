package Pc방;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class main extends JFrame {//클래스 main에 JFrame상속한다.
	//멤버변수 선언
	int sum=0;//변수에 값 0을 대입
	int [] ran=new int[4];//크기가 [4]인 배열 생성
	JButton [] menu = new JButton[12];//메뉴에 12가지를 넣을수있도록 배열을 생성
	JButton [] hot = new JButton[4];//추천메뉴는 랜덤하게 지정, 추천메뉴의 4개길이의 배열을 생성
	JButton  total, cancel, order;//버튼 합 취소 주문 생성한다.
	JLabel won;//라벨에 won이라는 변수를 지정한다.
	Mainmenu ma;//Mainmenu에 ma라는 변수를 지정한다.
	Bob bo;//Bob에 bo라는 변수를 지정한다.
	Noodle nd;//Noodle에 nd라는 변수를 지정한다.
	Drink dr;//Drink에 dr라는 변수를 지정한다.
	JList ls;//JList에 ls라는 변수를 지정한다.
	Vector vec= new Vector();//Vector을vec참조변수생성 인스턴스에 저장.
	HashMap <String, Integer> price = new HashMap <String, Integer>();
	int[]pr= {4500, 6000, 4500, 4500, 2500, 2500, 2500, 2500, 1200, 1200, 1200, 1200};//int배열 pr[]에 적용할 가격을 입력한다.
	String[]me = {"불고기덮밥","육회비빔밥","치킨마요덮밥","쭈꾸미덮밥","까르보 불닭볶음면","신라면","너구리","짜파게티","코카콜라","핫식스","코코팜","스프라이트"};//String배열 me[]에 적용할 메뉴명을 입력한다.
	ArrayList <JButton> list = new ArrayList<JButton>();
	main(){
		//객체 생성
		super("pc방");
		//랜덤 추천 메뉴 선정을 위한 랜덤숫자 지정
		HERE:
			for(int j=0;j<ran.length;) 
			{
				ran[j]=((int)(Math.random()*12));
				for(int k=0;k<j;k++) {
					if(ran[j]==(ran[k])) {
						continue HERE;
					}
				}
				j++;
			}
		//버튼에 이미지 입력 + 버튼 객체 생성
		for(int i=0; i<menu.length; i++) {//반복문을 사용하여 메뉴 배열안에 있는 배열의 길이 까지 증가
			menu[i] = new JButton(new ImageIcon("C:\\Users\\Canon\\git\\ilj125.github.com\\JavaGUI\\src\\Y_teamproject\\Imgs\\캡처"+i+".PNG"));
		}//메뉴 배열에 버튼과 이미지를  생성한다.
		for(int i=0;i<hot.length;i++) {//반복문을사용하여 랜덤메뉴 배열안에 있는 배열의 길이 까지 증가
			hot[i] = new JButton(new ImageIcon("C:\\Users\\Canon\\git\\ilj125.github.com\\JavaGUI\\src\\Y_teamproject\\Imgs\\캡처"+ran[i]+".PNG"));
		}//추천메뉴 (랜덤메뉴) 배열에 버튼과 이미지를  생성한다
		//각 텝 객체 생성


		ma = new Mainmenu(hot[0],hot[1],hot[2],hot[3]);//Mainmenu배열 객체안에 수를지정 객체 생성
		bo = new Bob(menu[0],menu[1],menu[2],menu[3]);//Bob배열 객체안에 수를지정 객체 생성
		nd = new Noodle(menu[4],menu[5],menu[6],menu[7]);//Noodle배열 객체안에 수를지정 객체 생성
		dr = new Drink(menu[8],menu[9],menu[10],menu[11]);//Drink배열 객체안에 수를지정 객체 생성

		cancel =  new JButton("전체 취소");
		ls = new JList(vec);
		won = new JLabel("0원");
		order = new JButton("주문하기");
		for(int i=0;i<menu.length;i++) {
			price.put(me[i],pr[i]);
		}
	}
	void display() {
		// 각 탭마다 해당 메뉴 부여
		JTabbedPane pane = new JTabbedPane();
		pane.add("추천메뉴", ma);
		pane.add("밥메뉴", bo);
		pane.add("면메뉴",nd);
		pane.add("음료",dr);

		//화면 출력
		setLayout(new BorderLayout());
		add(pane);

		//영역
		JPanel p1 = new JPanel(new BorderLayout());
		JPanel p2=new JPanel(new GridLayout(2, 1));
		p2.add(new JLabel("주문목록"),BorderLayout.NORTH);
		p2.add(cancel, BorderLayout.NORTH);
		p1.add(p2,BorderLayout.NORTH);
		p1.add(ls, BorderLayout.CENTER);

		//SOUTH영역
		JPanel p = new JPanel(new GridLayout(1,2));
		p.add(won);
		p.add(order);
		p1.add(p, BorderLayout.SOUTH);
		add(p1,BorderLayout.EAST);

		//메뉴판 사이즈 설정
		setSize(1000,900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	//주문 메뉴 총 가격 보여주기
	void totalPrice(int k) {
		sum +=pr[k];
		won.setText(String.valueOf(sum)+"원");
	}
	void deletePrice(String k) {
		sum = sum-(price.get(k)); 
		won.setText(String.valueOf(sum)+"원");
	}
	public void eventProc()
	{
		//(1) 이벤트 핸들러 
		//(2)이벤트 핸들러 객체생성
		//(3)이벤트 연결
		for(int i=0;i<menu.length;i++) {
			menu[i].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					JButton evt =(JButton)e.getSource(); 
					for(int j=0;j<menu.length;j++) {
						if(evt==menu[j]) {
							vec.add(me[j]);
							ls.setListData(vec);
							totalPrice(j);
						}
					}
				}
			});
		}
		//랜덤 추천 메뉴 클릭시 이벤트
		for(int raw=0;raw<hot.length;raw++) {
			hot[raw].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					JButton evt =(JButton)e.getSource(); 
					for(int j=0;j<hot.length;j++) {
						if(evt==hot[j]) {
							vec.add(me[ran[j]]);
							ls.setListData(vec);
							totalPrice(ran[j]);
						}
					}
				}
			});
		}

		cancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				JButton evt =(JButton)e.getSource(); 
				vec.clear();
				ls.setListData(vec);
				System.out.println("전체취소");
				sum=0;
				won.setText(String.valueOf(0)+"원");
			}
		});
		//order버튼을 눌렀을 때 예를 누르면 사라지고 아니오를 누르면 Data값이 남아있는다.
		order.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				JButton evt = (JButton)e.getSource();
				int result = JOptionPane.showConfirmDialog(null, "주문하시겠습니까?");
				if(result == JOptionPane.OK_OPTION) {
					//주문 정보 콘솔창에 출력
					for(int k=0;k<vec.size();k++) {
						System.out.println(vec.get(k));
					}
					System.out.println(won.getText());
					//정보 삭제
					vec.clear();
					ls.setListData(vec);
					sum=0;
					won.setText(String.valueOf(0)+"원");
				}
			}
		});
		//주문목록 중 선택한 메뉴 클릭시 삭제
		ls.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "삭제 하시겠습니까?");
				if(result == JOptionPane.OK_OPTION) {
					//클릭한 리스트 목록의 index를 가져옴
					int dex=ls.getSelectedIndex();
					//가격에서도 그 삭제한 메뉴의 가격만큼 삭제
					deletePrice((String)ls.getSelectedValue());
					//ls(주문목록)에서 선택한 index위치에 정보 삭제
					vec.remove(dex);
					ls.setListData(vec);
				}
			}
		});
	}

	public static void main(String[] args) {
		main a = new main();
		a.display();
		a.eventProc();
	}

}



