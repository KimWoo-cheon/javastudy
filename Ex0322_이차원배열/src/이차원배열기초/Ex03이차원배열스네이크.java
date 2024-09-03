package 이차원배열기초;

public class Ex03이차원배열스네이크 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int k = 21;
		for (int i = 0; i < array.length; i++) {
			
				if(i%2==0) {
					for (int j = 0; j < array.length; j++) {
				array[j][i] = k;
				k++;}}
				else if(i%2==1) {
					for (int j = 4; j >=0; j--) {
						array[j][i] = k;
						k++;}}
					
				}

			
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println(" ");
		}
	}

}
