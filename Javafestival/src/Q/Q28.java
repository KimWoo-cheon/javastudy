package Q;

import java.util.Iterator;

public class Q28 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int[][] array2 = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = k;
				k++;
			}
		}
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
			
					
				array2[i][j] = array[j][4 - i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println(" ");

		}
	}
}