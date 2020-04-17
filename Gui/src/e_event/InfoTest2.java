package e_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class InfoTest2 extends JFrame {

   // 1. 멤버변수 선언
   JTextArea ta;
   JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
   JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
   
   InfoTest2(){
      // 2. 객체 생성
      ta = new JTextArea();
      bAdd = new JButton("Add", new ImageIcon("src/c_info/Imgs/캡처.PNG"));
      bShow = new JButton("Show", new ImageIcon("src/c_info/Imgs/캡처1.PNG"));
      bSearch = new JButton("Search", new ImageIcon("src/c_info/Imgs/캡처2.PNG"));
      bDelete = new JButton("Delete", new ImageIcon("src/c_info/Imgs/캡처3.PNG"));
      bCancel = new JButton("Cancel", new ImageIcon("src/c_info/Imgs/캡처4.PNG"));
      bExit = new JButton("Exit", new ImageIcon("src/c_info/Imgs/캡처5.PNG"));
      tfName = new JTextField(15);
      tfId = new JTextField(15);
      tfTel = new JTextField(15);
      tfSex = new JTextField(15);
      tfAge = new JTextField(15);
      tfHome = new JTextField(15);
   }
   
   void display() {
      // 3. 화면 구성 및 출력
      setLayout(new BorderLayout());
      
      //WEST 영역
      JPanel p = new JPanel(new GridLayout(6, 2));
      p.add(new JLabel("Name"));
      p.add(tfName);
      p.add(new JLabel("Id"));
      p.add(tfId);
      p.add(new JLabel("Tel"));
      p.add(tfTel);
      p.add(new JLabel("Sex"));
      p.add(tfSex);
      p.add(new JLabel("Age"));
      p.add(tfAge);
      p.add(new JLabel("Home"));
      p.add(tfHome);
      add(p, BorderLayout.WEST);
      
      //SOUTH 영역
      JPanel p1 = new JPanel(new GridLayout(1, 6));
      p1.add(bAdd);
      p1.add(bShow);
      p1.add(bSearch);
      p1.add(bDelete);
      p1.add(bCancel);
      p1.add(bExit);
      add(p1, BorderLayout.SOUTH);
      
      add(ta, BorderLayout.CENTER);
      
      setLocation(200, 100);
      setSize(700, 560);
      setVisible(true);
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X버튼 눌렀을 때 자동으로 나가기
      setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
   }
   
   public void eventProc() {
      // (2) 이벤트 핸들러 객체 생성
      MyEvent me = new MyEvent();
      
      // (3) 이벤트 연결
      bAdd.addActionListener(me);
      bShow.addActionListener(me);
      bSearch.addActionListener(me);
      bDelete.addActionListener(me);
      bCancel.addActionListener(me);
      bExit.addActionListener(me);
      
      // 아이디 텍스트필드에서 엔터쳤을 때 이벤트처리 /C타입
      tfId.addActionListener(new ActionListener()    //이벤트 1~3번을 한번에 구현
      {
         public void actionPerformed(ActionEvent e) {
//            String msg = tfId.getText();
//            JOptionPane.showMessageDialog(null, msg + "를 입력하였습니다.");
            String id = tfId.getText();
            char sung =id.charAt(7);
    	    //1이거나 3이거나 9이면 남자
    	    //2이거나 4이거나 0이면 여자
    	    if(sung =='1' |sung =='3'|sung =='9') {
    	    	tfSex.setText("남자 출력");
    	    }else if(sung =='2'|sung =='4'|sung =='0') {
    	    	tfSex.setText("여자 출력");
      
    	    }
    	    
    	    
    		char chul = id.charAt(8);
    		String home="";
    		switch (chul) {
    		case '0' :home="서울";
    		break;
    		case '1' :home="인천/부산";
    		break;
    		case '2' :home="경기도";
    		break;
    		default :home="강아지";
    		break;
    		}tfHome.setText(home);
       
         String nai=id.substring(0, 2);//두번째열 앞에부터 두개 컴터는 0부터센다
 	    int nai2 =Integer.parseInt(nai);
 	   int age=0;
 	    //올해 년도 구하기
 	    Calendar c= Calendar.getInstance();
 	    int year = c.get(Calendar.YEAR);
 	    
 	    
 	    
 	    
 	    if(sung =='1'|sung =='2')
 	    {
 	    	age=year-(1900+nai2)+1;
 	    }else if(sung =='3'|sung =='4') 
 	    {
 	    	age=year-(2000+nai2)+1;
 	    }else if(sung =='0'|sung =='9')
 	    {
 	    	age=year-(1800+nai2)+1;
 	    }
 	    
 	   tfAge.setText(" " + age);
 	    
         
      }  
      });
      
      // 윈도우에 x 버튼 눌렸을 때의 이벤트 처리
      addWindowListener(new WindowAdapter() {   

         public void windowClosing(WindowEvent e) {
            int result = JOptionPane.showConfirmDialog(null, "진짜 나가시겠습니까?");
            if(result == JOptionPane.OK_OPTION) {
               System.exit(0);
            }
         }
      });
   }
   // (1)이벤트 핸들러
   class MyEvent implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         //Object evt = e.getSource();
         JButton evt = (JButton)e.getSource();
         if(evt == bAdd) {
            String msg = bAdd.getText();
            JOptionPane.showMessageDialog(null, msg + "합니다.");
         }else if(evt == bShow) {
            String msg1 = bShow.getText();
            JOptionPane.showMessageDialog(null, msg1 + "합니다.");
         }else if( evt == bSearch) {
            String msg2 = bSearch.getText();
            JOptionPane.showMessageDialog(null, msg2 + "합니다.");
         }else if( evt == bDelete) {
            String msg3 = bDelete.getText();
            JOptionPane.showMessageDialog(null, msg3 + "합니다.");
         }else if( evt == bCancel) {
            String msg4 = bCancel.getText();
            JOptionPane.showMessageDialog(null, msg4 + "합니다.");
         }else if( evt == bExit) {
            System.exit(0);
         }
      }
   }
   public static void main(String[] args) {
      InfoTest2 t = new InfoTest2();
      t.display();
      t.eventProc();
   }
   }