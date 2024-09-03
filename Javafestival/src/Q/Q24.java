package Q;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int a=num;
		String r="";
		int i;
		for(i=1; i<=num; i=i*2) {
			
					}
		
		for(int j=i/2; j>=1; j=j/2) { 
			
			r = r +" "+ a/j;
			a = a-a/j*j;
			
		}
		System.out.println(r);
		}
		
		
		}
	



