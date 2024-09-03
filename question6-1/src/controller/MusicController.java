package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.MusicVO;


public class MusicController {
	
	static int index=0;
	ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();

	public ArrayList<MusicVO> updateMusic(String title, String singer, int playTime) {
		MusicVO vo = new MusicVO(title, singer, playTime);

		musicList.add(vo);
		return musicList;
	}

	public ArrayList<MusicVO> musicList() {
		
	 return musicList;
	}

	public void now() {
		
		System.out.println(musicList.get(index).toString());
	}

	public void next() {
	int i=index;
		if (i + 1 == musicList.size()) {
			System.out.println(musicList.get(i).toString()); 
			
		} else {
			System.out.println(musicList.get(i + 1).toString());
		}

	}

	public void prev() {
		int i = index;
		if (i - 1 < 0) {
			System.out.println(musicList.get(i).toString()); 
		} else {
			System.out.println(musicList.get(i - 1).toString()); 
		}

	}

}
