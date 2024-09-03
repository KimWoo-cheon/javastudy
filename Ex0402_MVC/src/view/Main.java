package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import model.MemberVO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();
		String result = null;

		System.out.println("===============회원 관리 시스템===============");
		for (int i = 0; i < i + 1; i++) {
			System.out.println("[1] 회원가입 [2] 로그인 [3] 회원정보수정 [4] 회원삭제 [5] 회원정보조회 [6]종료");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("===== 회원가입 =====");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NAME : ");
				String name = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();

				// 입력받은 정보를 MemberVO 객체로 생성
				MemberVO vo = new MemberVO(id, pw, name, age);

				result = con.registerCon(vo);

				System.out.println("회원가입에 " + result + "했습니다.");

			} else if (menu == 2) {
				System.out.println("======== 로그인 ========");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				MemberVO vo = new MemberVO(id, pw);

				result = con.loginCon(vo);

				if (result != null) {
					System.out.println(result + "님 로그인에 성공했습니다.");
				} else {
					System.out.println("아이디와 비밀번호를 다시 확인해주세요");
				}

			} else if (menu == 3) {
				System.out.println("======== 회원정보 수정 ========");

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

				result = con.updateCon(vo, voNew);
				System.out.println("회원정보수정에 " + result + "했습니다.");

			} else if (menu == 4) {
				System.out.println("====== 회원정보 삭제 ======");

				System.out.print("삭제할 ID : ");
				String id = sc.next();
				System.out.print("     PW : ");
				String pw = sc.next();

				MemberVO vo = new MemberVO(id, pw);

				result = con.deleteCon(vo);
				System.out.println("회원 삭제에 " + result + "했습니다.");

			} else if (menu == 5) {

				System.out.println("======= 회원정보 조회 ========");
				con.joinCon();
				for (MemberVO num : con.joinCon()) {
					System.out.print("회원 ID : " + num.getId());
					System.out.print(", 회원 PW : " + num.getPw());
					System.out.print(", NAME : " + num.getName());
					System.out.println(", AGE : " + num.getAge());
				}
				System.out.println();
			} else if (menu == 6) {
				System.out.println("회원관리 프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("번호를 다시 입력해주세요.");
			}
		}
	}

}
