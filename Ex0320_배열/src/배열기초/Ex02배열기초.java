package 배열기초;
import java.util.Iterator;
import java.util.Random;

public class Ex02배열기초 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] array = new int[3];
		
		for(int i=0; i<array.length; i++) {
			array[i]=rd.nextInt(10)+1;
		}
		for(int i=0; i <array.length; i++) {
			System.out.print(array[i]+" ");
		}
		//Snippets --> 조각들
		for (int i = 0; i < array.length; i++) {
			
		}
	}
}
