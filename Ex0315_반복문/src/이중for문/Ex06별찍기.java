package 이중for문;

import java.util.Scanner;

public class Ex06별찍기 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("줄수 입력 : ");
		int num=sc.nextInt();
		
		int i;
		int j;
		int k;
		for ( i=1; i<=(num+1)/2; i++) {
			for( j=1; j<=(num+1)/2-i; j++) 
			{
				System.out.print(" ");
			}
			for (k=1; k<=(i*2-1); k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			}
		for ( i=(num-1)/2; i>=1; i--) {
			for( j=1; j<=(num+1)/2-i; j++) 
			{
				System.out.print(" ");
			}
			for (k=1; k<=(i*2-1); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
			}
		
		
		
	}

}
