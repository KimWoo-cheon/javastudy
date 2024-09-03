package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Ex05_selectList {

	public static void main(String[] args) {
		// 회원정보 조회 : member테이블에 있는 전체 회원 정보 출력
		// sq1 : select * from member
		// 회원정보 MemberVO(id, pw, name, age)
		// -->> 회원정보가 여러개 --> Arraylist<memberVO>

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// ArrayList생성
		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();

		System.out.println("===== 회원정보 조회==");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(ur1, user, db_pw);
			String sq1 = "select * from member";
			psmt = conn.prepareStatement(sq1);

			rs = psmt.executeQuery();
			// rs.next()반복필요 -> 반복 횟수가 정해져 있지 않음
			while (rs.next()) {
				// rs객체에서 값 가져오기
				// getString(컬럼순서),getString(컬럼이름)
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
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
//		for(int i=0; i<memList.size(); i++) {
//			System.out.print("회원 ID : " + memList.get(i).getId()); 
//			System.out.print(", 회원 PW : " + memList.get(i).getPw()); 
//			System.out.print(", NAME : " + memList.get(i).getName()); 
//			System.out.println(", AGE : " + memList.get(i).getAge());
		
			//foreach문 형태로 바꿔오기
		for( MemberVO num : memList ) {
			System.out.print("회원 ID : " + num.getId()); 
			System.out.print(", 회원 PW : " + num.getPw()); 
			System.out.print(", NAME : " + num.getName()); 
			System.out.println(", AGE : " + num.getAge());
			
		}
	}

}
