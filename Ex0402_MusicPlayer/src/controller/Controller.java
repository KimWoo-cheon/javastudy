package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.MusicDAO;
import model.MusicVO;

public class Controller {

	static // 음악 목록이 담아줄 전역변수
	ArrayList<MusicVO> musicList;

	// controller : 비지니스 로직
	// view로 부터 데이터를 받아서 가공/처리하는 역할
	// model로부터 데이터를 가지고 오거나 수정하는 역할

	// 노래를 재생/정지 할 수 있는 객체 생성 -> MP3Player(player.jar)객체
	MP3Player mp3 = new MP3Player();

	// 노래 순서를 관리할 변수
	static int index = 0;

	// 생성자 : new 키워드로 객체가 생성될 때 자동 호출되는 메소드
	// Controller 객체가 생성되자마자 음악 리스트를 세팅 -> 바로 재생이 가능하도록
	public Controller() {
		musicList = new MusicDAO().joinMusic();
	}

	// 목록 조회 Controller
	public ArrayList<MusicVO> musicList() {
		return musicList;
	}

	// 재생
	public void play(int index) {
		// 현재 재생중이라면 정지
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(musicList.get(index).getPath());
		now();
	}


	// 정지
	public void stop() {
		mp3.stop();
	}

	// 다음곡
	public void next() {
		if (mp3.isPlaying())
			mp3.stop();

		if (index < musicList.size() - 1) {
			index++;
		} else {
			index = 0;
		}
		mp3.play(musicList.get(index).getPath());
		now();

	}
	// 이전곡
	public void back() {
		if (mp3.isPlaying())
			mp3.stop();

		if (index > 0) {
			index--;
		} else {
			index = musicList.size() - 1;
		}
		mp3.play(musicList.get(index).getPath());
		now();

	}
	// 현재 재생곡
	public void now() {
		System.out.println(index+1+" "+musicList.get(index).toString());
	}
	public static void main(String[] args) {
	System.out.println(musicList.get(index).getPath());	
	}
}
