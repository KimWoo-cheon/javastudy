package 배열기초;

import java.util.Arrays;
import java.util.Random;

public class EX062 {public class Ex06배열예제_로또번호추첨 {

	public static void main(String[] args) {
		Random rd = new Random();

		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(5) + 1;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				
					while(array[i] - array[j] == 0){
					array[j] = rd.nextInt(5) + 1;}
				
			}
		}
		System.out.println("====로또타임====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!");
		System.out.println(Arrays.toString(array));

	}

}


}
