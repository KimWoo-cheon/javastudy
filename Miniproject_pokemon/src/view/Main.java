package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import model.Member;

public class Main {

	public static void main(String[] args) {

		int clearnum = 0;
		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();
		String result = null;
		
		con.playopen();
		for (int i = 0; i < i + 1; i++) {
			
		
			
			System.out.println("□□□□□□□□□□□□□■■■■■■■□□■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□■■■■■■■■□□□■■■■■■■□□■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□■■□□□□□□□□□□□□■□□□□□■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□■■□□□□□□□□□□□■■□□■■■■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□■■□□□□□□□□□□■■■■□□□□■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□■■■■■■■■■□□■■■□■■■□□■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□□□□■■□□□□□■■■□□□■■□□■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□□□□■■□□□□□□□□■□□□□□□■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□□□□■■□□□□□□□□■□□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "■■■■■■■■■■■■□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□□□□□□□□□□□□□□■□□□□□□□□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□□□□□□□□□□□□□□■■■■■■■■□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
					+ "□□□□□□□□□□□□□■■■■■□□■□■□□□■■■■■■■■□□□□□□□□□□□□□□■□□□□□□□□■□□□□□□□■■■■■■□□□■\r\n"
					+ "□□■■■■■■■■■□□■■■■■□□■□■□□□■■□□□□□■□□□□□□■■■■■■□□■□□□□□□□□■□□□□□□□■■■■■■□□□■\r\n"
					+ "□□□□■□□□■□□□□□□□□■□□■□■□□□■■□□□□□■□□□□□□■□□□□■□□■□□□□□□□□■□□□□□□□■□□□□□□□□■\r\n"
					+ "□□□□■□□□■□□□□■■■■■■■■□■□□□■■□□□□□■□□□□□□■□□□□■□□■□□□□□□□■■■□□□□□□■□□□□□□□□■\r\n"
					+ "□□□□■□□□■□□□□□□□■■□□■□■□□□■■■■■■■■□□□□□□■□□□□■□□■■■■□□□■■■■■□□□□□■■■■■■■■■■\r\n"
					+ "□□□□■□□□■□□□□□□■■□□□■□■□□□□□□■■□□□□□□□□□■□□□□■□□■■■□□■■■□□□■■■□□□■■■■■■□□□■\r\n"
					+ "□□■■■■■■■■■□□■■■□□□□■□■□■■■■■■■■■■■■□□□□■□□□□■□□■□□□■■■□□□□□■■■□□■□□□□□□□□■\r\n"
					+ "□□□□□□■□□□□□□■□□□□■■□□■□□□□□□□□□□□□□□□□□■□□□□■□□■□□□□□□□□□□□□□□□□■□□□□□□□□■\r\n"
					+ "□□□□□□■□□□□□□□□□□□■■□□□□□□■■□□□□□□□□□□□□■■■■■■□□■□□□□□□□□□□□□□□□□■■■■■■■■□■\r\n"
					+ "■■■■■■■■■■■■□□□□□□■■□□□□□□■■□□□□□□□□□□□□□□□□□□□□■□□■■■■■■■■■■■■□□□□□□□□□□□■\r\n"
					+ "□□□□□□□□□□□□□□□□■■■■■■□□□□■■□□□□□□□□□□□□□□□□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□■\r\n"
					+ "□□□□□□□□□□□□□□■■■□□□■■■■□□■■■■■■■■■□□□□□□□□□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□■");
		      

			System.out.println("");
			System.out.println("===================== [1] 로그인   [2] 회원가입  [3] 회원정보  ================");
			int menu = sc.nextInt();
			if (menu == 2) {

				System.out.println("=========================== 회원가입 =======================");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NAME : ");
				String name = sc.next();

				// 입력받은 정보를 MemberVO 객체로 생성
				Member player = new Member(id, pw, name);

				result = con.registerCon(player);

				System.out.println("회원가입에 " + result + "했습니다.");

			} else if (menu == 3) {
				System.out.println("=============================== 회원관리 =========================");
				for (int j = 0; j < j + 1; j++) {
					System.out.println("==== [1] 회원정보수정 [2] 회원삭제 [3] 랭킹조회 [4]뒤로가기 ====");
					int menu2 = sc.nextInt();

					if (menu2 == 1) {
						System.out.println("===================== 회원정보수정 =====================");

						System.out.print("로그인 ID : ");
						String id = sc.next();
						System.out.print("로그인 PW : ");
						String pw = sc.next();

						// 수정할 아이디,패스워드 입력

						System.out.print("수정할 ID : ");
						String newid = sc.next();
						System.out.print("수정할 PW : ");
						String newpw = sc.next();
						System.out.print("수정할 이름 : ");
						String newname = sc.next();

						// 바꿀 아이디
						Member vo = new Member(id, pw);
						// 수정할 내용 vo에 저장
						Member voNew = new Member(newid, newpw, newname);

						result = con.updateCon(vo, voNew);
						System.out.println("회원정보수정에 " + result + "했습니다.");

					} else if (menu2 == 2) {
						System.out.println("======== 회원정보 삭제 ========");

						System.out.print("삭제할 ID : ");
						String id = sc.next();
						System.out.print("     PW : ");
						String pw = sc.next();

						Member vo = new Member(id, pw);

						result = con.deleteCon(vo);
						System.out.println("회원 삭제에 " + result + "했습니다.");

					} else if (menu2 == 3) {

						System.out.println("============ 클리어 랭킹 조회 ==========");
						con.joinCon();
						for (Member num : con.joinCon()) {
							System.out.print(" Clear횟수 : " + num.getClear());
							System.out.print(", 회원 ID : " + num.getId());
							System.out.print(", 회원 PW : " + num.getPw());
							System.out.println(", NAME : " + num.getName());
							

						}
						System.out.println();
					} else if (menu2 == 4) {
						System.out.println("회원조회를 종료합니다.");
						break;
					} else {
						System.out.println("번호를 다시 입력해주세요.");
					}
				}
			} else if (menu == 1) {
				System.out.println("======================= 로그인 ==================");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				Member vo = new Member(id, pw);

				result = con.loginCon(vo);

				if (result != null) {
					System.out.println(result + "님 로그인에 성공했습니다.");
					con.stop();
					Game.game(args);
					
				} else {
					System.out.println("아이디와 비밀번호를 다시 확인해주세요");
				}
			} else {
				System.out.println("번호를 다시 입력해주세요.");
			}

		}

	}

}
