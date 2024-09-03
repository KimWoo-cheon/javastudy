package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {// DAO(Data Access Object) : DBMS에 접근하는 객체
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	int row = 0;

	// DB접속 메소드
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1523:xe";
			String user = "mp_24K_DCXBIG_p1_1";
			String db_pw = "smhrd1";

			conn = DriverManager.getConnection(url, user, db_pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DB종료 메소드
	public void getClose() {

		try {
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
	public int register(Member player) {

		try {

			getConn();

			String sql = "insert into mem values(?, ?, ?,0)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, player.getId());
			psmt.setString(2, player.getPw());
			psmt.setString(3, player.getName());

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
	public String login(Member player) {

		String name = null;

		try {

			getConn();

			String sql = "select name from mem where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, player.getId());
			psmt.setString(2, player.getPw());

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

	// 로그인 클리어 추출
	public void log(Member player) {

		try {

			getConn();

			String sql = "update mem set clear =mem.clear + 1 where id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, player.getId());

			rs = psmt.executeQuery();


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();

		}

	}

	// 회원정보수정
	public int update(Member player, Member playerNew) {
		try {
			getConn();

			String sql = "update MEM set ID= ?, PW= ? , NAME=? where ID=? and PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, playerNew.getId());
			psmt.setString(2, playerNew.getPw());
			psmt.setString(3, playerNew.getName());
			psmt.setString(4, player.getId());
			psmt.setString(5, player.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}

	// 회원정보 삭제
	public int delete(Member player) {
		try {
			getConn();
			String sql = "delete from MEM where ID=? and PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, player.getId());
			psmt.setString(2, player.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	// 회원정보조회
	public ArrayList<Member> join() {
		ArrayList<Member> memList = new ArrayList<Member>();
		try {
			getConn();
			String sq1 = "select * from mem order by clear desc";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int clear = rs.getInt(4);

				Member player = new Member(id, pw, name, clear);
				memList.add(player);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return memList;
	}
}
