package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// DAO(Data Access Object) : DBMS에 접근하는 객체
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	int row = 0;

	// DB접속 메소드
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

	// 회원가입 기능
	public int register(MemberVO vo) {

		try {

			getConn();

			String sql = "insert into member values(?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());

			// 8.실행
			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			getClose();
		}
		return row;

	}

	// 로그인 기능
	public String login(MemberVO vo) {

		String name = null;
		try {

			getConn();

			String sql = "select name from member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());

			rs = psmt.executeQuery();

			if (rs.next()) {
				// 값을 가져오기
				name = rs.getString("name");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();

		}
		return name;

	}

	// 회원정보수정
	public int update(MemberVO vo, MemberVO voNew) {
		try {
			getConn();

			String sql = "update MEMBER set ID= ?, PW= ? where ID=? and PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, voNew.getId());
			psmt.setString(2, voNew.getPw());
			psmt.setString(3, vo.getId());
			psmt.setString(4, vo.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}

	// 회원정보 삭제
	public int delete(MemberVO vo) {
		try {
			getConn();
			String sql = "delete from MEMBER where ID=? and PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	// 회원정보조회
	public ArrayList<MemberVO> join(){
		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();
		try {
			getConn();
			String sq1 = "select * from member";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();
			// rs.next()반복필요 -> 반복 횟수가 정해져 있지 않음
			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);

				MemberVO vo = new MemberVO(id, pw, name, age);
				memList.add(vo);

				

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return memList;
	}
}
