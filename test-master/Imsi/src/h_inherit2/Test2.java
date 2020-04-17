package h_inherit2;
//MyFrame is a Frame;
import java.awt.Frame;
//자바 모든 클래스의 최상위 클래스는 object 이다.
//is-a 관계라고 부름
class MyFrame2 extends Frame{//자바에서는 부모가하나다 다중선택이안됀다

	MyFrame2(){
		//super();생성자 함수앞에 자동생성
		super("나의 두번째 화면");
		setSize(500,300);
		setVisible(true);

	}
}

public class Test2 {

	public static void main(String[] args) {
		new MyFrame2();

	}

}
