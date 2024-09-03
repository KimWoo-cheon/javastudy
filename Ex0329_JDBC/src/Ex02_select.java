import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import model.MemberVO;

public class Ex02_select {

	public static void main(String[] args) {
		// 로그인 기능 : 사용자가 id,pw를 입력하면 
		// 이름을 가져와서 ~님 환영합니다.
		// DB에 있는 name값을 가지고 와서 출력
		// sq1문장 : select name from member where id = 입력한id and pw = 입력한 pw

		Scanner sc=new Scanner(System.in);
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		String name = null;
		
		//1. 사용자에게 id,pw 입력받기

		System.out.println("==로그인==");
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("PW : ");
		String pw = sc.next();
		
		MemberVO vo = new MemberVO(id, pw);
		
		//2. DB연결해서 name값 가져오기
		try {
			//1. ojdbc6.jar 외부라이브러리 추가
			//2. OracleDriver Class 찾기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//3. 카드키(ulr, user, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String db_pw="hr";
			
			//4. DB접속 -> Connection 객체로 return
			conn = DriverManager.getConnection(url, user, db_pw);
			
			//5. SQL문장 작성
			String sql = "select name from member where id = ? and pw = ?";
			
			//6. SQL문장 실행할 수 있는지 확인
			psmt= conn.prepareStatement(sql);
			
			//7. 바인드변수에 값 채우기
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			
			//8. SQL문장 실행
			// executeUpdate() : select구문을 제외하고 사용, 수행 결과로 int를 반환(실행된 행의 개수)
			// executeQuery() : select구문을 실행할 때 사용, 수행 결과로 Resultset을 반환
			// ResultSet : select의 결과를 저장하는 객체
			rs= psmt.executeQuery();
			
			//9. rs에서 실행한 결과값 가져오기
			// rs객체는 처음에 컬럼을 가리키고 있음.
			// rs.next() : 커서를 다음줄로 내리고, 값이 있는지 없는지 확인
			// 값이 있으면 true, 없으면 false 반환
			
			if(rs.next()) {
				//값을 가져오기
			name = rs.getString("name");
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally { 
			
			try {
				//문닫기 : 무조건 실행, 역순으로 닫기
				if(rs !=null) rs.close();
				if(psmt != null)psmt.close();
				if(conn != null)conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		if(name!=null) {
			System.out.println(name+"님 로그인에 성공했습니다. ");
		}
		else{
			System.out.println("아이디랑 비밀번호를 다시 확인해주세요");
		}
	}

}
