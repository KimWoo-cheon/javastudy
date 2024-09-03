package Q;

import java.util.Arrays;
import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int[] array2 = new int[5];
		int n = 0;
		for (int i = 0; i < 5; i++) {
			
			System.out.print(i + 1 + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<5; j++) {
				
				if(array[i]>array[j]) {
					n=n+1;
				}
				
				
				
			}
		
			array2[n]=array[i];
			n=0;
			
			
		}
		
		System.out.println("정렬 후");
		for(int i=0; i<5; i++)
		System.out.print(array2[i]+ " ");
	}
}
