import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.MemberVO;

public class Ex01_insert {

	public static void main(String[] args) {
		// 회원가입 : 사용자에게 회원정보(id,pw,name,age)를 입력받아서 DB에 저장하는 기능
		// SQL : insert into member values(id,pw,name,age);

		// 1.CREATE MEMBER TABLE(ID,PW,NAME,AGE)
		// 2. INPUT INFORMATION FROM USER
		Scanner sc = new Scanner(System.in);

		System.out.println("== 회원가입 ==");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NAME : ");
		String name = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();

		//입력받은 정보를 MemberVO 객체로 생성
		// 3. 입력받은 정보를 DB에 insert
		MemberVO vo = new MemberVO(id,pw,name,age);
		
		//지역 변수 --->>> 전역변수화
		PreparedStatement psmt = null;
		Connection conn = null;

		// java-DBMS 연결
		// 1. ojdbc6.jar 외부라이브러리 추가(통로를 만들기 위한 Class를 담고 있는 외부 라이브러리)
		// 프로젝트 오른쪽 마우스 - build pathe-Library-add External Jars..
		// ojdbc6.jar 경로 추가
		// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar

		// 예외처리 try-catch문
		// :문법적 오류 같은 컴파일 에러는 바로 수정이 가능하지만,
		// 런타임 오류처럼 실행 중에 발생하는 오류는 예기치 못한 상황에 발생
		// :예외처리는 프로그램의 실행 중 예외가 발생하면, 이에 대응하고자 하는것
		// try : 일단 시도(예외가 발생할 수 있는 실행문장)
		// catch : 예외처리문(예외가 발생했을 때 넘어가는 부분)
		try {
			// 2. Java와 DB를 연결해줄 통로 -> OracleDriver클래스가 진행
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 3. DB에 접속(접속하기 위한 url, user, pw가 필요)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String db_pw = "hr";

			// 4. DB에 접속 --> 연결 성공시 Connection 객체로 return
			conn = DriverManager.getConnection(url, user, db_pw);

			if (conn == null) {
				System.out.println("DB연결 실패");

			} else {
				System.out.println("DB연결 성공");
			}
			// 5. SQL문장 작성(?:바인드변수, soft파싱)
//			String sql = "insert into member values(id, pw, name, age)";

			String sql = "insert into member values(?, ?, ?, ?)";// 변수로 입력하려면

			// 6. SQL문장을 실행할 수 있는 지 판단
			// - >실행 가능 -> PrepareStatement객체로 return 
			psmt = conn.prepareStatement(sql);
			
			// 7. 바인드변수(?)에 값 채우기
			// psmt.set자료형(?의순서, 채울값)
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			
			//8.실행
			int row = psmt.executeUpdate();
			
			//실행 결과 확인
			if(row >0) {
				System.out.println("회원가입 성공");
			}
			else {
				System.out.println("회원가입 실패");
			}

			
		} catch (ClassNotFoundException e) {// 2에서 발생한 예외처리
			e.printStackTrace(); // 오류가 났을 때 어떤 오류가 났는지 console창에 출력해주는 메소드
		} catch (SQLException e) {// 4.DB접속에 대한 예외처리
			e.printStackTrace();
		}finally {
			//finally : 무조건 실행(try문에서 끝나든, catch문에서 끝나든)
			//9. 접속 종료
				try {
					if(psmt !=null)	psmt.close();
					if(conn !=null) conn.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			
		}

	}
}
