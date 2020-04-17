package g_access;

import g_access.sub.Access;
//다른 패키지는 임포트로 끌어와야 사용이 가능!
// 2. 다른 패키지에서 확인
class Main
{
	public static void main(String[] args) 
	{//다른 패키지는 public만 적용 가능
		Access me = new Access();
//		  me.a = "프라이빗 변경";
		  me.b = "퍼블릭 변경 ";
//		  me.c = "프로텍티드 변경";특별한 경우에 한해서만 적용해줌 
//		  me.d = "디폴트 변경";
		
		me.output();
	}
}

