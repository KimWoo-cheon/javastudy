package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.MusicController;
import model.MusicVO;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MusicController con = new MusicController();
		

		System.out.println("==== 뮤직플레이어 ====");

		while (true) {
			System.out.println();
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("==== 등록 ====");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playtime = sc.nextInt();
				con.updateMusic(title, singer, playtime);

			} else if (menu == 2) {

				 ArrayList<MusicVO> musicList = con.musicList();
				 System.out.println("== Play List ==");
				 int num=1;
				 for(MusicVO music : musicList)
					 System.out.println(num+++music.toString());
			} else if (menu == 3) {
				System.out.println("==== 실행 ====");

				con.now();

			} else if (menu == 4) {
			
				con.prev();
			} else if (menu == 5) {
				 ArrayList<MusicVO> musicList = con.musicList();
				con.next();
			} else if (menu == 6) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다른 번호를 입력하세요.");
			}
		}
	}

}
