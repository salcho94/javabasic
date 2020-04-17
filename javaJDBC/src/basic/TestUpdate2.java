package basic;

import java.sql.*;

public class TestUpdate2 {

	public static void main(String[] args) {
			int deptno = 20;// 1.변수에 값을 지정 해준다 
			int salInc = 500;
		try {// 외부에서 메모리 가져오기에 예외처리는 필수다
			Class.forName("oracle.jdbc.driver.OracleDriver");// 동일한 것
			// 2 connection얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.13:1521:orcl", "scott", "tiger");
		
			// SQL 문장
			String sql = "UPDATE EMP SET SAL = sal+? WHERE DEPTNO=? ";
						// 4 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, salInc);// 위에서 선언한 변수 지정 
			st.setInt(2, deptno);
			// 5 전송
			
			int result = st.executeUpdate();// 한번만 끌고 가야지 여기 꺼 없애준다 
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
