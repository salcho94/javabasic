package basic;

import java.sql.Connection; // 패키지가 어디있는지 알고가야합니다.
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {

	public static void main(String[] args) {
		Connection con =null;
		try {
			//1. 드라이버를 로딩 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Coneection 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.13:1521:orcl", "scott", "tiger");
			//3. sql문장 (*)
			String sql = "SELECT empno,ename,sal,job FROM emp";
			//4. 전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 전송
			ResultSet rs = st.executeQuery(sql);
			//6.결과를 확인
			while(rs.next()) {//내려와서 확인하게되는 함수 next 끝날때까지 가져온다 .한줄식 읽기때문
				System.out.print(rs.getInt("EMPNO") + "\t");
				System.out.print(rs.getString("Ename") +"\t");
				System.out.print(rs.getInt("SAL")+ "\t");
				System.out.println(rs.getString("job"));
			// 이것이 한칸식 내려가는 원리이다  몇개인지 모르니까 다음 실행할 문장이 없을시 는 false 로실행중단되게끔
				
			}
			//7.닫기 중요함 
			rs.close();
			st.close();
			
		}catch(Exception ex) {
			System.out.println("실패"+ex.getMessage());
		}finally {
			try {con.close();} catch (SQLException e) {}
		}

	}

}
