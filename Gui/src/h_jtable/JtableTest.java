package h_jtable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JtableTest extends JFrame {
	JTable table;// 이객체가 널값이다 객체생성이 필수이다 변수만 선언해둔 상태이다 .
	JButton btn;
	myTableModel myTM;
	
	
	public JtableTest() {
		// 객체생성
		myTM = new myTableModel();//데이터와 컬럼명 만들고 넣어 줘야 한다
		table = new JTable(myTM);/// 테이블의 뷰
		btn = new JButton("cheak");
		
		
		// 화면을 구성
		add(new JScrollPane(table), BorderLayout.CENTER);// 반드시 스크롤 패인 대입해줘야화면에뜬다 
		add(btn, BorderLayout.NORTH);

		// 화면에 출력하는 부분
		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//이벤트 처리
		btn.addActionListener(new ActionListener() {// 또 오버라이딩해준다  이너클래스이다안쪽에서 코딩을 하게되면 문제가 발생 한다 
			public void actionPerformed(ActionEvent e) {
				change();
				
			}
		});
	
	    table.addMouseListener(new MouseAdapter() {
	

		
		@Override
		public void mouseClicked(MouseEvent e) {
			int row = table.getSelectedRow();
			int col = table.getSelectedColumn();
			System.out.println(row+":"+col+"이벤트 발생");
			
		}
	});
		
		
	}

	void change() {
		ArrayList data = new ArrayList();
		for(int i=0;i<5;i++) {//row
			ArrayList temp = new ArrayList();
			for(int j=0;j<4;j++) {//col
				if(j==0)temp.add(new Boolean(false));
				temp.add(new Integer(j+2));// int -> integer 어짜피자동형변환 된다 .
			}
			data.add(temp);
		}
		myTM.data = data;
		table.setModel(myTM);//혹시 몰라서 다시지정 
		myTM.fireTableDataChanged();//모델측에서 화면한테 내용변경알려줘야함 
	}
	
	// 이너클래스 생성 위에 화면을 구성하기때문에 상속 table model 이라는 이것은 이름 자체가 추상이니까 추상메소드이다 .옆의 버튼
	// 눌러서 오버라이딩 필수
	class myTableModel extends AbstractTableModel {
		String [] columnName = {"하나","둘","셋","넷"};
		ArrayList data= new ArrayList();
		public int getColumnCount() {

			return columnName.length;
		}//위에서 선언한 변수 

		public int getRowCount() {

			return data.size();
		}// 어레이 리스트의 함수를 리턴한다

		public Object getValueAt(int rowIndex, int columnIndex) {
			//행과열에해당하는값 리턴하는 함수
			ArrayList temp = (ArrayList)data.get(rowIndex);
			return temp.get(columnIndex);
		}
		@Override
		public String getColumnName(int c) {
			return columnName[c];
		}
		
		public Class getColumnClass(int c) {
			
			return getValueAt(0, c).getClass();
		}
		public boolean isCellEditable(int row,int col) {
			if(col<2)return true;
			else return false;
		}
		public void setValueAt(Object value,int row, int col) {
			ArrayList temp = (ArrayList)data.get(row);
			temp.set(col, value);
			fireTableCellUpdated(row, col);
		}
	}

	public static void main(String[] arge) {
		JtableTest jt = new JtableTest();

	}
}
