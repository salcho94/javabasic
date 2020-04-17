package h_inherit2;
//MyFrame has a Frame;
//math클래스는 부모클래스가 될 수없다 이유는 final때문
import java.awt.*;
class MyFrame1{
	Frame f;
	
	MyFrame1(){
		f = new Frame("나의 첫 화면");// 객체생성해서 쓰는 이분을 has-a관계라 칭한다
		f.setSize(500,300);
		f.setVisible(true);
	}
}

public class Test {
  public static void main(String[] args) {
	     new MyFrame1();	

	}

}
