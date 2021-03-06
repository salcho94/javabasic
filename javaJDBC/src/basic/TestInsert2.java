package basic;

import java.sql.*;

public class TestInsert2 {

	public static void main(String[] args) {
		// 1 oracle드라이버를 메모리에 로딩
		Connection con = null;
		// new oracle.jdbc.driver.OracleDriver(); == Class.forName(""); 동일한 의미
		//화면에서 입력값 받아서 저장한 변수입니다 
		int empno = 902;
		String ename ="노현호";
		int sal = 1100;
		
		try {// 외부에서 메모리 가져오기에 예외처리는 필수다
			Class.forName("oracle.jdbc.driver.OracleDriver");// 동일한 것
			// 2 connection얻어오기
			 con = DriverManager.getConnection
					("jdbc:oracle:thin:@192.168.0.13:1521:orcl", "scott", "tiger");
			
			//SQL 문장 
			String sql = "INSERT INTO emp(empno,ename,sal) VALUES(?,?,?)";
			System.out.println(sql);
			//4 전송객체 얻어오기
			//Statement st = con.createStatement();
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, empno);
			st.setString(2, ename);
			st.setInt(3, sal);
			//5 전송 
			//st.executeUpdate(sql);
			st.executeUpdate();
			//6 닫기 
			st.close();
			// !반 드 시! 닫아주어야한다 .
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("fail" + e.getMessage());

		}finally {
			try {con.close();} catch (SQLException e) {
			}
		}
			
	}

}
