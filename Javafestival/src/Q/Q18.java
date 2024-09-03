package Q;

public class Q18 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = k;
				k++;
			}
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.println(array[i][j]);
			}
		}
		

	}
}
