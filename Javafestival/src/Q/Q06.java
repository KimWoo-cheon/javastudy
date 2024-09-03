package Q;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		for (int a=1, b=1; a!=0 & b!=0;) {
		System.out.print("A 입력 >> ");
		a = sc.nextInt();
		System.out.print("B 입력 >> ");
		b = sc.nextInt();
		if (a!=0 & b!=0) {
		System.out.println("결과 >> " + (a-b));
		}
		
		}

	}

}
