package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.Member;
import model.MemberDAO;
import model.PM;
import model.PMDAO;
import model.MyPM;
import model.YourPM;

public class Controller {

	// Controller : Model과 View 사이의 중간다리 역할
	// Model을 통해 가지고온 데이터를 View에서 해야할 비지니스 로직 등을 작성해야할 역할
	MP3Player mp3 = new MP3Player();
	MemberDAO dao = new MemberDAO();
	PMDAO pmdao = new PMDAO();

	// 회원가입 Controller
	public String registerCon(Member player) {

		// 회원가입 메소드 호출
		int row = dao.register(player);

		// 실행결과 확인
		String result = null;
		if (row > 0) {
			result = "성공";
		} else {
			result = "실패";
		}
		return result;

	}

	// 로그인 Controller
	public String loginCon(Member player) {

		return dao.login(player);
	}

	// 회원정보 수정 Controller
	public String updateCon(Member vo, Member voNew) {
//		int row = dao.update(vo, voNew);
		if (dao.update(vo, voNew) > 0) {
			return "성공";
		} else {
			return "실패";
		}
	}

	// 회원정보 삭제
	public String deleteCon(Member player) {
		if (dao.delete(player) > 0) {
			return "성공";
		} else {
			return "실패";
		}
	}

	// 회원정보 조회
	public ArrayList<Member> joinCon() {

		return dao.join();
	}

	// 포켓몬 리스트
	public void pmjoin(int typenum) {

		if (typenum == 1) {
			for (PM num : pmdao.joinfire()) {
				System.out.print(" 이름 : " + num.getName());
				System.out.print(", 타입 : " + num.getType());
				System.out.print(", 기술 : " + num.getSkill());
				System.out.println(" ");
			}
		}

		else if (typenum == 2) {
			for (PM num : pmdao.joinwater()) {
				System.out.print(" 이름 : " + num.getName());
				System.out.print(", 타입 : " + num.getType());
				System.out.print(", 기술 : " + num.getSkill());
				System.out.println(" ");
			}

		} else if (typenum == 3) {
			for (PM num : pmdao.joinleaf()) {
				System.out.print(" 이름 : " + num.getName());
				System.out.print(", 타입 : " + num.getType());
				System.out.print(", 기술 : " + num.getSkill());
				System.out.println(" ");
			}

		} else if (typenum == 4) {
			for (PM num : pmdao.joinelec()) {
				System.out.print(" 이름 : " + num.getName());
				System.out.print(", 타입 : " + num.getType());
				System.out.print(", 기술 : " + num.getSkill());
				System.out.println(" ");
			}

		} else if (typenum == 5) {
			for (PM num : pmdao.joinland()) {
				System.out.print(" 이름 : " + num.getName());
				System.out.print(", 타입 : " + num.getType());
				System.out.print(", 기술 : " + num.getSkill());
				System.out.println(" ");
			}

		}

	}

	public void balacne(MyPM my, YourPM your) {
		switch (my.getType()) {
		case "불꽃":
			if (your.getType().equals("물")) {
				your.setAttack(your.getAttack() + 10);

			} else if (your.getType().equals("풀")) {
				my.setAttack(my.getAttack() + 10);

			}
			break;

		case "물":
			if (your.getType().equals("전기")) {
				your.setAttack(your.getAttack() + 10);

			} else if (your.getType().equals("불")) {
				my.setAttack(my.getAttack() + 10);

			}
			break;
		case "풀":
			if (your.getType().equals("불")) {
				your.setAttack(your.getAttack() + 10);

			} else if (your.getType().equals("땅")) {
				my.setAttack(my.getAttack() + 10);

			}
			break;
		case "땅":
			if (your.getType().equals("전기")) {
				your.setAttack(your.getAttack() + 10);

			} else if (your.getType().equals("풀")) {
				my.setAttack(my.getAttack() + 10);

			}
			break;
		case "전기":
			if (your.getType().equals("땅")) {
				your.setAttack(your.getAttack() + 10);

			} else if (your.getType().equals("물")) {
				my.setAttack(my.getAttack() + 10);

			}
			break;
		}

	}

	//// 뮤직 삽입
	public void playopen() {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play("music/open.mp3");

	}

	public void playend() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play("music/end.mp3");

	}

	public void playbattle() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play("music/battle.mp3");

	}

	public void playdown() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play("music/down.mp3");

	}

	public void playattack() {
	
		mp3.play("music/attack.mp3");
	}

	public void stop() {

		mp3.stop();

	}
}
