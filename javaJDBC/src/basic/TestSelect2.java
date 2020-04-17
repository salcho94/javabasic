package basic;

import java.sql.Connection; // 패키지가 어디있는지 알고가야합니다.
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect2 {

	public static void main(String[] args) {
			
		try {
			//1. 드라이버를 로딩 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Coneection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.13:1521:orcl", "scott", "tiger");
			//3. sql문장 (*)
			String sql = "SELECT count(*) cnt FROM emp";
			//4. 전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 전송
			ResultSet rs = st.executeQuery(sql);
			//6.결과를 확인
		//	while(rs.next()) {//내려와서 확인하게되는 함수 next 끝날때까지 가져온다 .한줄식 읽기때문
			//	System.out.print(rs.getInt("count(*)"));}
		    rs.next();
			int result = rs.getInt("CNT");// 별칭이다 
				System.out.println(result);
		     
				
			
			//7.닫기
			rs.close();
			st.close();
			con.close();
		}catch(Exception ex) {
			System.out.println("실패"+ex.getMessage());
		}

	}

}
