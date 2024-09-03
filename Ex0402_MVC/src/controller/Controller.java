package controller;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;

public class Controller {

	// Controller : Model과 View 사이의 중간다리 역할
	// Model을 통해 가지고온 데이터를 View에서 해야할 비지니스 로직 등을 작성해야할 역할

	MemberDAO dao = new MemberDAO();

	// 회원가입 Controller
	public String registerCon(MemberVO vo) {

		// 회원가입 메소드 호출
		int row = dao.register(vo);

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
	public String loginCon(MemberVO vo) {

		return dao.login(vo);

	}

	// 회원정보 수정 Controller
	public String updateCon(MemberVO vo, MemberVO voNew) {
//		int row = dao.update(vo, voNew);
		if (dao.update(vo, voNew) > 0) {
			return "성공";
		} else {
			return "실패";
		}
	}

	// 회원정보 삭제
	public String deleteCon(MemberVO vo) {
		if (dao.delete(vo) > 0) {
			return "성공";
		} else {
			return "실패";
		}
	}

	// 회원정보 조회
	public ArrayList<MemberVO> joinCon() {

		return dao.join();

	}
}
