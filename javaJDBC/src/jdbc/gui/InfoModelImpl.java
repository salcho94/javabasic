package jdbc.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl implements Infomodel {

	String url = "jdbc:oracle:thin:@192.168.0.13:1521:orcl";
	String user = "scott";
	String pass = "tiger";

	public InfoModelImpl() throws Exception {// 예외처리
		// 1드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}

	public void insert(InfoVO vo) throws SQLException {
		Connection con = null;

		try {
			// 2 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3 sql문장
			String sql = " INSERT INTO info_tab( name, jumin, tel, gender, age , home)  " + "VALUES(?,?,?,?,?,?) ";
			// 4 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, vo.getName());
			st.setString(2, vo.getJumin());
			st.setString(3, vo.getTel());
			st.setString(4, vo.getGender());
			st.setInt(5, vo.getAge());
			st.setString(6, vo.getHome());

			// 5 전송하기
			st.executeUpdate();
			// 6 닫기
			st.close();
		} finally {
			con.close();
		}
	}

	public void modify(InfoVO vo) throws SQLException {
		Connection con = null;

		try {
			// 2 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3 sql문장
			String sql = " UPDATE info_tab SET name =?,jumin=?,gender=?,age=?,home=? WHERE tel =?" ;
			// 4 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, vo.getName());
			st.setString(2, vo.getJumin());
			st.setString(3, vo.getGender());
			st.setInt(4, vo.getAge());
			st.setString(5, vo.getHome());
			st.setString(6, vo.getTel());
			// 5 전송하기
			st.executeUpdate();
			// 6 닫기
			st.close();
		} finally {
			con.close();
		}

	}

	public ArrayList<InfoVO> selectAll() throws SQLException {
		Connection con = null;
		ArrayList<InfoVO> list = null;
		try { // 2. connection 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 만들기
			String sql = "SELECT * FROM info_tab";
			// 4 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			// 5. 전송
			ResultSet rs = st.executeQuery();
			list = new ArrayList<InfoVO>();// 어레이 리스트를 사용한다
			while (rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setJumin(rs.getString("Jumin"));
				vo.setTel(rs.getString("Tel"));
				vo.setGender(rs.getString("Gender"));
				vo.setAge(rs.getInt("Age"));
				vo.setHome(rs.getString("Home"));
				list.add(vo);
			}
			// 6. 닫기
			st.close();

		} finally {
			con.close();
		}
		return list;
	}



	public InfoVO selectByTel(String tel) throws SQLException {
		Connection con = null;
		InfoVO vo = new InfoVO();
		con = DriverManager.getConnection(url, user, pass);

		String sql = "SELECT * FROM info_tab  WHERE tel = ? ";

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			vo.setName(rs.getString("NAME"));
			vo.setJumin(rs.getString("Jumin"));
			vo.setTel(rs.getString("Tel"));
			vo.setGender(rs.getString("Gender"));
			vo.setAge(rs.getInt("Age"));
			vo.setHome(rs.getString("Home"));
		}

		rs.close();
		con.close();
		return vo;// 비어있는 정보를 넘긴다 .
	}

	
	public void delete(String tel) throws SQLException {
		Connection con = null;
		try {
			// 2 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3 sql문장
			String sql = " DELETE FROM info_tab WHERE tel =?" ;
			// 4 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,tel);
			
			st.executeUpdate();
			
			// 5 전송하기
			
			// 6 닫기
			st.close();
		} finally {
			con.close();
		}

	}
	}
