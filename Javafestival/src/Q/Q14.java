package Q;

public class Q14 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		int k=1;
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				array[j][i]=k;
				k++;
			}
		}
		for(int j=0; j<5; j++) {
			for (int i=0; i<5; i++) {
				System.out.print(" "+array[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
