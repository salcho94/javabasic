package Test;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import java.awt.Font;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

 

class MyFrame extends JFrame implements ActionListener

{

 

private JPanel displayPanel;

private JPanel buttonPanel;

private JPanel debugPanel;

 

private JTextField display;

 

private JButton[] buttons; // 0 ~ 9

private JButton btnPlus;

private JButton btnMinus;

private JButton btnProduct;

private JButton btnDivide;

private JButton btnEqual;

private JButton btnCE;

 

private JLabel prev;

private JLabel operator;

private JLabel flag;

 

 

public MyFrame()

{

this.setSize(300, 400);

this.setTitle("GUI TEST");

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

// Programming Here

 

this.setLayout(new BorderLayout());

 

/*

 * 3개의 panel 객체 만들고 각자 layout 설정

 */

 

displayPanel = new JPanel();

buttonPanel = new JPanel();

debugPanel = new JPanel();

 

displayPanel.setLayout(new FlowLayout());

buttonPanel.setLayout(new GridLayout(0,4, 5, 5));

debugPanel.setLayout(new FlowLayout());

 

/*

 * displayPanel의 component를 만들어서 붙이기

 */

 

display = new JTextField(11);

display.setText("0");

display.setHorizontalAlignment(JTextField.RIGHT);

 

Font font = new Font("Serif", Font.BOLD, 30);

display.setFont(font);

 

 

 

 

displayPanel.add(display);

 

 

/*

 * buttonPanel에 component 만들고, 붙이기

 */

 

Font fontBtn = new Font("Serif", Font.BOLD, 20);

 

buttons = new JButton[10];

// 실제 버튼 객체 생성

for(int i=0; i<buttons.length; i++)

{

//buttons[i] = new JButton("" + i);

buttons[i] = new JButton(Integer.toString(i));

buttons[i].setFont(fontBtn);

 

buttons[i].addActionListener(this);

}

 

btnPlus = new JButton("+");

btnMinus = new JButton("-");

btnProduct = new JButton("*");

btnDivide = new JButton("/");

btnEqual = new JButton("=");

btnCE = new JButton("CE");

 

btnPlus.addActionListener(this);

btnMinus.addActionListener(this);

btnProduct.addActionListener(this);

btnDivide.addActionListener(this);

btnEqual.addActionListener(this);

btnCE.addActionListener(this);

 

// 1 2 3 +

// 4 5 6 -

// 7 8 9 *

// 0 / = CE

 

buttonPanel.add(buttons[1]);

buttonPanel.add(buttons[2]);

buttonPanel.add(buttons[3]);

buttonPanel.add(btnPlus);

 

buttonPanel.add(buttons[4]);

buttonPanel.add(buttons[5]);

buttonPanel.add(buttons[6]);

buttonPanel.add(btnMinus);

 

buttonPanel.add(buttons[7]);

buttonPanel.add(buttons[8]);

buttonPanel.add(buttons[9]);

buttonPanel.add(btnProduct);

 

buttonPanel.add(buttons[0]);

buttonPanel.add(btnDivide);

buttonPanel.add(btnCE);

buttonPanel.add(btnEqual);

 

/*

 * debugPanel에 debugMsg, btnDebug 만들어서 붙이기

 */

prev = new JLabel("");

operator = new JLabel("");

flag = new JLabel("");

 

debugPanel.add( new JLabel("PREV:"));

debugPanel.add(prev);

 

debugPanel.add( new JLabel("OPERATOR:"));

debugPanel.add(operator);

 

debugPanel.add( new JLabel("FLAG:"));

debugPanel.add(flag);

 

 

 

/*

 * frame에다가 panel 붙이기

 */

this.add(displayPanel, BorderLayout.NORTH);

this.add(buttonPanel, BorderLayout.CENTER);

this.add(debugPanel, BorderLayout.SOUTH);

 

//debugPanel.setVisible(false);

 

this.setVisible(true);

}

 

@Override

public void actionPerformed(ActionEvent e) {

 

for(int i=0; i<buttons.length; i++)

{

if(e.getSource() == buttons[i])

{

if(display.getText().equals("0"))

{

display.setText(""+i);

// display.setText(Integer.toString(i));

}else

{

if(operator.getText().equals(""))

{

display.setText(  display.getText() + i);

}else

{

if(flag.getText().equals(""))

{

display.setText(""+i);

flag.setText("#");

}else

{

display.setText(  display.getText() + i);

}

 

}

}

}

}

 

if(e.getSource() == btnEqual)

{

double op1, op2, result;

op1 = Double.parseDouble(prev.getText());  //문자->숫자(double)

op2 = Double.parseDouble(display.getText());

 

if(operator.getText().equals("+"))

{

result = op1 + op2;

display.setText("" + result);

// display.setText( String.valueOf(result));

}

if(operator.getText().equals("-"))

{

result = op1 - op2;

display.setText("" + result);

// display.setText( String.valueOf(result));

}

if(operator.getText().equals("*"))

{

result = op1 * op2;

display.setText("" + result);

// display.setText( String.valueOf(result));

}

if(operator.getText().equals("/"))

{

result = op1 / op2;

display.setText("" + result);

// display.setText( String.valueOf(result));

}

}

 

if(e.getSource() == btnPlus)

{

prev.setText( display.getText() );

operator.setText("+");

flag.setText("");

}

if(e.getSource() == btnMinus)

{

prev.setText( display.getText() );

operator.setText("-");

flag.setText("");

}

if(e.getSource() == btnProduct)

{

prev.setText( display.getText() );

operator.setText("*");

flag.setText("");

}

if(e.getSource() == btnDivide)

{

prev.setText( display.getText() );

operator.setText("/");

flag.setText("");

}

 

if(e.getSource() == btnCE)

{

display.setText("0");

prev.setText("");

operator.setText("");

flag.setText("");

}

 

}

 

 

 

}

 

 

public class Test1 {

 

public static void main(String[] args) {

 

MyFrame frame = new MyFrame();

}

 

}

 



