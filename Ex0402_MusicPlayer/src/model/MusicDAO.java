package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MusicDAO {
	// Data Access object
	
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
//	int row = 0;
	
	// DB연결 메소드
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, user, db_pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DB종료 메소드
	public void getClose() {

		try {
			// 문닫기 : 무조건 실행, 역순으로 닫기
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 노래 목록 조회 메소드
	public ArrayList<MusicVO> joinMusic() {
		
		ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();
		
		try {
			getConn();
			
			psmt=conn.prepareStatement("select * from music");
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				String title = rs.getString(1);
				String singer = rs.getString(2);
				String path = rs.getString(3);
				
				musicList.add(new MusicVO(title, singer, path));
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			getClose();
		} return musicList;
	}
	
	
}
