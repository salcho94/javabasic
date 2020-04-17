package test;

public class MenuActionEventEx {

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import javax.swing.event.*;

	class MenuActionEventEx extends JFrame{
	    String name[]={"Color","Font","Top","Bottom"};
	    JMenuItem mi[]=new JMenuItem[4];
	    JLabel la;
	    MenuActionEventEx(){
	        this.setTitle("Menu에 Action리스너 만들기 예제");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        JMenuBar mb = new JMenuBar();
	        JMenu jm = new JMenu("Text");
	        la = new JLabel("Hello");
	        la.setHorizontalAlignment(SwingConstants.CENTER);
	        
	        for(int i=0; i<mi.length; i++){
	            mi[i]=new JMenuItem(name[i]);
	            mi[i].addActionListener(new MyActionListener());
	            jm.add(mi[i]);
	        }
	        
	        mb.add(jm);
	        this.setJMenuBar(mb);
	        this.add(la);
	        this.setLocationRelativeTo(null);
	        this.setSize(250, 200);
	        this.setVisible(true);
	    }
	    
	    class MyActionListener implements ActionListener{

	        @Override
	        public void actionPerformed(ActionEvent ae) {
	            JMenuItem item = (JMenuItem)ae.getSource();
	            if(item==mi[0]){
	                la.setForeground(Color.blue);
	            }
	            else if(item==mi[1]){
	                la.setFont(new Font("Ravie", Font.ITALIC, 30));
	            }
	            else if(item==mi[2]){
	                la.setVerticalAlignment(SwingConstants.TOP);
	            }
	            else if(item==mi[3]){
	                la.setVerticalAlignment(SwingConstants.BOTTOM);
	            }
	        }
	        
	    }
	}
	public class JavaApplication40 {
	    public static void main(String[] args) {
	        new MenuActionEventEx();
	    }
	}
}
