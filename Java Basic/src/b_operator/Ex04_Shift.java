package b_operator;

/**
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  <<왼쪽으로이동
 *  >> 오른쪽으로 이동
 *  [예] 0000 0010	<<1 		0000 0100
 *  	  0000 0010	>>1		0000 0001
 */
public class Ex04_Shift {

	public static void main(String[] args) {

		int su=4;
		System.out.println(su);
		System.out.println(su<<1);//8
		System.out.println(su>>1);//2
		System.out.println(su>>2);//16
		System.out.println(su<<2);//0
		
		System.out.println(su >>> 1);//부호비트에 0으로 채움
	}

}
