package javaTest;

public interface InfoModel {
		void insert(InfoVO vo) throws SQLException;
		ArrayList<InfoVO> selectAll()
}
