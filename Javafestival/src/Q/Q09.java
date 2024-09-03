package Q;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("행 개수 : ");
		 int num = sc.nextInt();
		 int i;
		 int n;
		 for (i=1; i<=num; i++)
		 {
		 	for( n=0; n<i; n++) 
		 {
		 		System.out.print("*");
		 		
		 		} 
		 	 System.out.println("");
		 	
		 	}

	}

}
