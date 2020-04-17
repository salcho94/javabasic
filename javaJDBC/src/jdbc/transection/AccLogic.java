package jdbc.transection;

import java.sql.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
public class AccLogic 
{
	// 연결 객체 생성시 필요한 변수 선언
	String url;
	String user;
	String pass;

	//===============================================
	// 드라이버를 드라이버매니저에 등록
	public AccLogic() throws Exception{
		/////////////////////////////////////////////////////////
		// 1. 드라이버를 드라이버 매니저에 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url = "jdbc:oracle:thin:@192.168.0.13:1521:orcl";
		user = "kosmo";
		pass = "a123456789";
	}


	//====================================================
	// 보내는 계좌번호와 받는 계좌번호와 계좌금액을 넘겨받아 
	//	보내는계좌에서 계좌금액을 빼고 받는계좌에서 계좌금액을 더한다
	public int moveAccount(String sendAcc, String recvAcc, int amount)
	{
		Connection con = null;

		///////////////////////////////////////////////////////////
		//	 1. Connection 객체 생성
		//@@ 2. Auto-commit을 해제
		//	 3. 출금계좌에서 이체금액을 뺀다
		//	 4. 입금계좌에 이체금액을 더한다
		//@@ 5. commit을 전송한다
		//	 6. 객체 닫기
		//	 - 만일 정상적인 경우는 0을 리턴하고 도중에 잘못되었으면 트랜잭션을 롤백시키고 -1을 리턴
		try {
			con = DriverManager.getConnection(url, user, pass);
			con.setAutoCommit(false);
			String sendSql ="update account set amount = amount - ? where account_num = ? "; //"? 보내는 계좌에서 금액을 빼기";
			PreparedStatement sendPs = con.prepareStatement(sendSql);//반드시 끌고간다
			//?지정하기
			
		    sendPs.setInt(1, amount);//물음표의 값지정
			sendPs.setString(2, sendAcc);
			int result =sendPs.executeUpdate();//select는 쿼리다 여기에는 문장 끌고가면 안댐 위에서 끌고갔기에 두번들어가면 실행오류
			if(result ==0) {
				con.rollback();
				return -1;
			}
				sendPs.close();//닫아주기

			String recvSql = "update account set amount = amount + ? where account_num = ? " ; // ? 받는계좌에서 금액 더하기
			 PreparedStatement recvPs =  con.prepareStatement(recvSql);
			 
			 
			 recvPs.setInt(1, amount);
		     recvPs.setString(2, recvAcc);
		     int result2 = recvPs.executeUpdate();
		     if(result2 == 0)con.rollback();
		     
			 recvPs.close();
			 
			 con.commit();
		} catch (SQLException e) {
			try {con.rollback();}catch(Exception ex) {}
			return -1;//문제발생시 -1 리턴
			
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				
			}
			
		}
		
		
		
		
		
		
		return 0;// 문제 없을시 0 리턴
	}

	//=======================================================
	//	보내는계좌번호와 받는계좌번호를 넘겨받아
	//		보내는계좌고객명과 보내는계좌의남은 금액을 얻어오고
	//		받는계좌고객명을 얻어와서
	//		얻은 정보를 ConfirmData객체에 넣고 리턴
	public ConfirmData confirmAccount(String sendAcc, String recvAcc) 
		throws Exception{

		
		String sendCust="", recvCust="";
		int gainMoney=0;
		ConfirmData  resultData=null;
		
		//	1. Connection 객체 생성
		//	2. 테이블에서, 넘겨받은 sendAcc와 같은 account_num필드에서 customer, amount를 얻어온다
		//	3. 테이블에서, 넘겨받은 recvAcc와 같은 account_num필드에서 customer를 얻어온다
		//  4. 2와 3에서 얻은 값을 ConfirmData 객체에 저장
		//	5. 4번의 객체를 리턴



		return resultData;
	}

}


//#################################################################
//	테이블명 : account
//	account_num		계좌번호		varchar2(20)
//	customer		고객명			varchar2(20)
//	amount			계좌금액		int
