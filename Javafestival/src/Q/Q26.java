package Q;

import java.util.Scanner;
public class Q26 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				 System.out.print("행 개수 : ");
				 int num = sc.nextInt();
				 int i=0;
				 int n=0;
				 int j=0;
				 for (i=1; i<=num; i++)
				 {
				 	for( n=num-i; n>=1; n--) 
				 {
				 		System.out.print(" ");		 		
				 		} 
				 	for (j=1; j<=i; j++) {
				 		System.out.print("*");
				 	}
				 	 System.out.println("");
				 	
				 	}


			}

		}


