package basic;

import java.sql.*;

public class TestUpdate {

	public static void main(String[] args) {
		// 1 oracle드라이버를 메모리에 로딩
		// new oracle.jdbc.driver.OracleDriver(); == Class.forName(""); 동일한 의미
		try {// 외부에서 메모리 가져오기에 예외처리는 필수다
			Class.forName("oracle.jdbc.driver.OracleDriver");// 동일한 것
			// 2 connection얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.13:1521:orcl", "scott", "tiger");

			// SQL 문장
			String sql = "UPDATE EMP SET SAL = sal+500 WHERE DEPTNO=20 ";
			// "DELETE FROM EMP_COPY";
			// "UPDATE EMP SET ENAME ='홍길숙',SAL =4500 WHERE EMPNO ='9001' ";
			// 4 전송객체 얻어오기
			Statement st = con.createStatement();
			// 5 전송
			// --int executeUpdate: insert/update/delete 수행한 행의 수를 리턴
			// --ResultSet executeQurey : select/ 리턴형만 달라서 오버로딩 못한다
			int result = st.executeUpdate(sql);
			System.out.println(result + "행을 실행");
			// 6 닫기
			st.close();
			con.close();// !반 드 시! 닫아주어야한다 .
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("fail" + e.getMessage());

		}

	}

}
