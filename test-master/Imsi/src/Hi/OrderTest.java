package Hi;

public class OrderTest {

	public static void main(String[] args) {
		Order s = new Order();
		s.ordernumber = 201803120001l;
		s.orderID ="abc123";
		s.orderDay ="2018년3월 12일";
		s.ordername = "홍길순";
		s.number = "PD0345-12";
		s.address = "서울시 영등포구 여의도동 20번지";
		
		
		System.out.println(s.ordernumber);
		System.out.println(s.orderID);
		System.out.println(s.orderDay);
		System.out.println(s.ordername);
		System.out.println(s.number);
		System.out.println(s.address);
		
	}

}
