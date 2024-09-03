package 이차원배열기초;

public class ex02이차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int k = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = k;
				k++;

			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println(" ");
		}
	}
}
