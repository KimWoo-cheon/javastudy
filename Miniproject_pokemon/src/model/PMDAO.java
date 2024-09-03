package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PMDAO {
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

	// 포켓몬 리스트
	public ArrayList<PM> joinfire() {
		ArrayList<PM> pmList = new ArrayList<PM>();
		try {
			getConn();
			String sq1 = "select * from poketmon where type='불꽃'";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String name = rs.getString(1);
				String type = rs.getString(2);
				int atk = rs.getInt(3);
				String skill = rs.getString(4);

				PM pm = new PM(name, type, atk, skill);
				pmList.add(pm);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return pmList;
	}

	public ArrayList<PM> joinwater() {
		ArrayList<PM> pmList = new ArrayList<PM>();
		try {
			getConn();
			String sq1 = "select * from poketmon where type='물'";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String name = rs.getString(1);
				String type = rs.getString(2);
				int atk = rs.getInt(3);
				String skill = rs.getString(4);

				PM pm = new PM(name, type, atk, skill);
				pmList.add(pm);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return pmList;
	}

	public ArrayList<PM> joinleaf() {
		ArrayList<PM> pmList = new ArrayList<PM>();
		try {
			getConn();
			String sq1 = "select * from poketmon where type='풀'";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String name = rs.getString(1);
				String type = rs.getString(2);
				int atk = rs.getInt(3);
				String skill = rs.getString(4);

				PM pm = new PM(name, type, atk, skill);
				pmList.add(pm);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return pmList;
	}

	public ArrayList<PM> joinelec() {
		ArrayList<PM> pmList = new ArrayList<PM>();
		try {
			getConn();
			String sq1 = "select * from poketmon where type='전기'";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String name = rs.getString(1);
				String type = rs.getString(2);
				int atk = rs.getInt(3);
				String skill = rs.getString(4);

				PM pm = new PM(name, type, atk, skill);
				pmList.add(pm);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return pmList;
	}

	public ArrayList<PM> joinland() {
		ArrayList<PM> pmList = new ArrayList<PM>();
		try {
			getConn();
			String sq1 = "select * from poketmon where type='땅'";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String name = rs.getString(1);
				String type = rs.getString(2);
				int atk = rs.getInt(3);
				String skill = rs.getString(4);

				PM pm = new PM(name, type, atk, skill);
				pmList.add(pm);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return pmList;
	}

	public PM Choice(String mypm) {
		PM my = new PM("", "", 0, "");

		try {
			getConn();
			String sq1 = "select * from poketmon where name=?";
			psmt = conn.prepareStatement(sq1);
			psmt.setString(1, mypm);
			rs = psmt.executeQuery();
			if (rs.next()) {
				my.setName(rs.getString(1));
				my.setType(rs.getString(2));
				my.setAttack(rs.getInt(3));
				my.setSkill(rs.getString(4));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return my;
	}

}
