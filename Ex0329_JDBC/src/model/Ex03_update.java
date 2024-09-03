package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex03_update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;

		System.out.println("======회원정보 수정======");

		// ㅇ아이디 입력
		System.out.print("로그인 ID : ");
		String id = sc.next();
		System.out.print("로그인 PW : ");
		String pw = sc.next();

		// 수정할 아이디,패스워드 입력
		System.out.print("수정할 ID : ");
		String newid = sc.next();
		System.out.print("수정할 PW : ");
		String newpw = sc.next();

		// 바꿀 아이디
		MemberVO vo = new MemberVO(id, pw);
		// 수정할 내용 vo에 저장
		MemberVO voNew = new MemberVO(newid, newpw);

//		System.out.println(vo.getId());

		// java-DBMS 연결
		// 1. ojdbc6.jar 외부라이브러리 추가(통로를 만들기 위한 Class를 담고 있는 외부 라이브러리)
		// 프로젝트 오른쪽 마우스 - build pathe-Library-add External Jars..
		// ojdbc6.jar 경로 추가
		// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
		try {

			// 2 java-db 연결 통로
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 3. DB에 접속(접속하기 위한 url, user, pw가 필요)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String db_pw = "hr";

			// 4. DB에 접속 --> 연결 성공시 Connection 객체로 return
			conn = DriverManager.getConnection(url, user, db_pw);

//			if (conn == null) {
//				System.out.println("DB연결 실패");
//
//			} else {
//				System.out.println("DB연결 성공");
//			}

			// 5. SQL작성
			String sql = "update MEMBER set ID= ?, PW= ? where ID=? and PW=?";

			// 6. SQL문장을 실행할 수 있는 지 판단
			// - >실행 가능 -> PrepareStatement객체로 return
			psmt = conn.prepareStatement(sql);

			// 7. 바인드변수(?)에 값 채우기
			// psmt.set자료형(?의순서, 채울값)
			psmt.setString(1, voNew.getId());
			psmt.setString(2, voNew.getPw());
			psmt.setString(3, vo.getId());
			psmt.setString(4, vo.getPw());

			// 8. SQL문장 실행
			// executeUpdate() : select구문을 제외하고 사용, 수행 결과로 int를 반환(실행된 행의 개수)
			// executeQuery() : select구문을 실행할 때 사용, 수행 결과로 Resultset을 반환
			// ResultSet : select의 결과를 저장하는 객체

			int row = psmt.executeUpdate();

			// 실행 결과 확인
			if (row > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				// 문닫기 : 무조건 실행, 역순으로 닫기

				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}