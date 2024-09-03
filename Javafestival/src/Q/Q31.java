package Q;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자입력 >> ");
		int num2 = sc.nextInt();
		
		int res1=num1*(num2%10);
		int res2=num1*(num2%100/10);
		int res3=num1*(num2/100);		
				
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res1+res2*10+res3*100);
		
		
	}

}
