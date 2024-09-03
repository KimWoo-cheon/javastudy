package ArrayList기초;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_ArrayList실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> team = new ArrayList<String>();
//		System.out.println(team.size());

		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			team.add(i, name);
		}
		System.out.print("연구개발팀의 팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다.");

		// 삭제할 팀원의 이름을 입력받아서 team에서 삭제
		
		System.out.println();
		System.out.print("방출할 팀원은....?");
//		String dname = sc.next();
//		team.remove(dname);
		team.remove(sc.next());
		
		// team조회
		System.out.print("남은 팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.print("입니다.");
	}

}
