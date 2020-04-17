package jfreechart;

import java.sql.*;
import java.util.*;

public class Database {

	String URL = "jdbc:oracle:thin:@192.168.0.13:1521:orcl";
	String USER ="scott";
	String PASS ="tiger";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
//			String sql = "SELECT nvl(to_char(hiredate,'MM'),00)hire_month,count(*)cnt " + 
//					"     FROM EMP" + 
//					"     GROUP BY  to_char(hiredate,'MM') " + 
//					"     order by hire_month  ";
//			String sql = " select nvl(job,'백수')job, nvl(round(avg(sal)),00)avg\r\n" + 
//					"   from emp\r\n" + 
//					"   group by nvl(job,'백수')";
			String sql ="select et.ename,et.sal\r\n" + 
					"			    from  (select *\r\n" + 
					"			   from emp\r\n" + 
					"			   order by nvl(sal,0) DEsc)et\r\n" + 
					"			    where ROWNUM<=5";
			
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();

			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getInt("cnt"));				//****************
				temp.add( rset.getString("hire_month"));		//****************		
				data.add(temp);
			}
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}
