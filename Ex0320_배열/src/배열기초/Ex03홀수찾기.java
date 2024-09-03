package 배열기초;

import java.util.Random;

public class Ex03홀수찾기 {
	public static void main(String[] args) {
		
		// 실습
		Random rd= new Random();
		String odd="";
		int count=0;
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i]=rd.nextInt(100)+1;
			if (array[i]%2==1) {
				odd=odd+array[i]+" ";
				count++;
			}
		}
		System.out.println("array에 들어있는 홀수는"+odd+"이며, 총"+count+"개 입니다.");
		

		
	}

}
