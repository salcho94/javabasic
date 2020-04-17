package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.CustomerDao;
import model.vo.Customer;

public class CustomerModel implements CustomerDao{
String url ="jdbc:oracle:thin:@192.168.0.13:1521:orcl";
String user = "kosmo";
String pass ="a123456789";
	
	public CustomerModel() throws Exception{
	 	// 1. 드라이버로딩
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	}
	
	public void insertCustomer(Customer vo) throws Exception{
		Connection con =null;
		// 2. Connection 연결객체 얻어오기
		try {
		con = DriverManager.getConnection(url, user, pass);
		// 3. sql 문장 만들기 (INSERT 문장 만들기)
		String sql = "INSERT INTO customer(name,tel,tel2,email,adr) VALUES (?,?,?,?,?)";
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,vo.getCustName());
		st.setString(2,vo.getCustTel1());
		st.setString(3,vo.getCustTel2());
		st.setString(4,vo.getCustEmail());
		st.setString(5,vo.getCustAddr());
		// 5. sql 전송
		st.executeUpdate();
		// 6. 닫기 
		st.close();
	}finally {
		con.close();
	}
	}
	
	public Customer selectByTel(String tel) throws Exception{
		Connection con=null;
		Customer dao = new Customer();
		try {

		con = DriverManager.getConnection(url, user, pass);
		String sql ="SELECT * FROM customer WHERE TEL = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) { 
			dao.setCustTel1(rs.getString("tel"));
			dao.setCustName(rs.getString("Name"));
			dao.setCustTel2(rs.getString("Tel2"));
			dao.setCustAddr(rs.getString("Adr"));
			dao.setCustEmail(rs.getString("Email"));
			
			
			
			
			
		
		}
		rs.close();
		st.close();	
		
		}finally {
			con.close();
		
		}
		return dao;
	}
	
	public int updateCustomer(Customer vo) throws Exception{
	
			Connection con = null;
			int result = 0;
			try {
				// 2 연결객체 얻어오기
				con = DriverManager.getConnection(url, user, pass);

				// 3 sql문장
				String sql = " UPDATE customer SET Name = ?,Tel2= ? ,Email= ?,Adr= ? WHERE tel =?" ;
				// 4 전송객체 얻어오기
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(2, vo.getCustTel1());
				st.setString(1, vo.getCustName());
				st.setString(3, vo.getCustTel2());
				st.setString(5, vo.getCustAddr());
				st.setString(4, vo.getCustEmail());	
				
				
				
				// 5 전송하기
				result = st.executeUpdate();
				System.out.println(result+":"+ vo.getCustTel1());
				// 6 닫기
				st.close();
			} finally {
				con.close();
			}
			
			return result;

	}
}



