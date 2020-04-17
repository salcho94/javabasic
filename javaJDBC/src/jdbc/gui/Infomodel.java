package jdbc.gui;

import java.sql.SQLException;
import java.util.ArrayList;
// 모든변수는 상수 모든 자료형은 추상이 된다 인터페이스 안에서
public interface Infomodel {
	 void insert(InfoVO vo)throws SQLException;// 기본틀 구현  이것을 구현하는 클래스하나 만들어주면된다  부모에게도 인자값넣어준당
	 ArrayList<InfoVO> selectAll() throws SQLException;
	 void delete(String tel)  throws SQLException;
	 InfoVO selectByTel(String tel) throws SQLException;
	 
	 void modify(InfoVO vo) throws SQLException;
	 
}
