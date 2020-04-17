package z_sample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class Login extends JFrame{
	JTextField j1,j2;
	JButton b;
	public Login(){
		j1 = new JTextField();
		j2 = new JTextField();
		b = new JButton("로그인");
	}
	
	public void display() {
		setLayout(new BorderLayout());
		
		
		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(100,50));
		p.setLayout(new GridLayout(2,2));
		p.add(new JLabel("아이디"));
		p.add(j1);
		p.add(new JLabel("비밀번호"));
		p.add(j2);
		add(p, BorderLayout.CENTER);
		add(b, BorderLayout.EAST);
		
		
		
		setVisible(true);
		setSize(300, 300);
		setTitle("Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
			Login l = new Login ();
			l.display();

	}

}
