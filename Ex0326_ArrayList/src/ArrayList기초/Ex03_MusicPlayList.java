package ArrayList기초;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_MusicPlayList {

	public static void main(String[] args) {
		// 뮤직플레이리스트
		Scanner sc = new Scanner(System.in);

		// 노래 목록을 담아줄 ArrayList생성
		ArrayList<String> musicList = new ArrayList<String>();

		System.out.println("============ Music Play List ============");

		while (true) {
			System.out.println(" ");
			System.out.print("[1] 노래추가 [2] 노래조회 [3] 노래삭제 [4] 프로그램 종료  >>");
			int menu = sc.nextInt();
			System.out.println(" ");

			if (menu == 4) {// 사용자 4번 입력시 종료
				System.out.println("===== Music Play List를 종료합니다. =====");
				break;
			} else if (menu == 2) {// 2번 선택시

				System.out.println("============ 현재 재생 목록 ===========");
				System.out.println(" ");
				if (musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					for (int i = 0; i < musicList.size(); i++) {
						System.out.println(i + 1 + ". " + musicList.get(i));
					}
				}
				System.out.println();

			} else if (menu == 1) {// 사용자가 1번을 선택했을 때
				System.out.println("==============================================");
				System.out.println(" ");
				System.out.print(" [1]원하는 위치에 추가  [2] 마지막 위치에 추가 >> ");
				int menu1 = sc.nextInt();
				if (menu1 == 2) {// 마지막위치에 추가
					System.out.println(" ");
					System.out.print(" 추가 할 노래 >> ");
					String m = sc.next();
					musicList.add(m);
					System.out.println(" ");
					System.out.print(" 노래가 추가 되었습니다.");
					System.out.println(" ");
//					for (int i = 0; i < musicList.size(); i++) {
//						System.out.println(i + 1 + ". " + musicList.get(i));
//					}
//					System.out.println(" ");

				} else if (menu1 == 1) {
					System.out.println(" ");
					System.out.print(" 추가할 순번 >> ");
					int n = sc.nextInt();
					System.out.print(" 추가할 노래 >> ");
					String m = sc.next();
					musicList.add(n - 1, m);
					System.out.println(" ");
					System.out.println(" 노래가 추가 되었습니다.");
					System.out.println(" ");
//					for (int i = 0; i < musicList.size(); i++) {
//						System.out.println(i + 1 + ". " + musicList.get(i));
//					}
//					System.out.println(" ");

				} else {
					System.out.println();
					System.out.println(" 번호를 다시 입력해 주세요. ");
				}
			} else if (menu == 3) {// 3번 선택

//				for (int i = 0; i < musicList.size(); i++) {
//					System.out.println(i + 1 + ". " + musicList.get(i));
//				}
				System.out.println(" ");
				System.out.print("[1]선택삭제 [2]전체삭제) >> ");
				System.out.println(" ");
				int d = sc.nextInt();
				if (d == 2) {
					musicList.clear();
					System.out.println("전체 리스트가 삭제되었습니다. ");
				} else if (d == 1) {

					System.out.print("삭제 할 노래 선택 >> ");
					int d2 = sc.nextInt();
					musicList.remove(d2 - 1);
					System.out.println(" ");
					System.out.println(" 노래가 삭제 되었습니다. ");
					System.out.println(" ");
//					for (int i = 0; i < musicList.size(); i++) {
//						System.out.println(i + 1 + ". " + musicList.get(i));
				} else {
					System.out.println();
					System.out.println(" 번호를 다시 입력해 주세요. ");
				}
			} else {
				System.out.println(" 번호를 다시 입력해 주세요. ");
			}
		}

	}
}
